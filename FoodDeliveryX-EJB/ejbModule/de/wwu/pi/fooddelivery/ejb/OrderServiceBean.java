package de.wwu.pi.fooddelivery.ejb;

import java.util.Collection;
import java.util.Date;
import java.util.Set;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import de.wwu.pi.fooddelivery.jpa.Order;
import de.wwu.pi.fooddelivery.jpa.OrderPosition;
import de.wwu.pi.fooddelivery.jpa.User;

@Stateless
public class OrderServiceBean implements OrderService {

	@PersistenceContext
	private EntityManager em;
	
	@Resource
    private ValidatorFactory validatorFactory;

    @Resource
    private Validator validator;

	@Override
	public Order createOrder(Order order) {
		em.merge(order);
		return order;
	}

	@Override
	public Order createOrder(Date orderDate, Date deliveryTime, String additionalOrderInformation,
			Collection<OrderPosition> orderPositions, User user) {
		Order newOrder = new Order();
		newOrder.setOrderDate(orderDate);
		newOrder.setDeliveryTime(deliveryTime);
		newOrder.setAdditionalOrderInformation(additionalOrderInformation);
		newOrder.setOrderPositions(orderPositions);
		newOrder.setUser(user); //TODO bi-directional reference
		return createOrder(newOrder);
	}

	@Override
	public Order getOrder(int orderId) {
		Order order = em.find(Order.class, orderId);

		if (order == null)
			throw new IllegalArgumentException(String.format("Order with ID %s not found", orderId));
		return order;
	}

	@Override
	public Collection<Order> getAllOrders() {
		return em.createQuery("FROM Order", Order.class).getResultList();
	}

	@Override
	public void validate(Order order) throws ConstraintViolationException {
		Set<ConstraintViolation<Order>> violations = validator.validate(order);
		if(!violations.isEmpty()) throw
			new ConstraintViolationException(violations);
	}
}
