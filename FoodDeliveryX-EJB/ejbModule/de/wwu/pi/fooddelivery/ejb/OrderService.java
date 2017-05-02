package de.wwu.pi.fooddelivery.ejb;

import java.util.Collection;
import java.util.Date;

import javax.ejb.EJBException;
import javax.ejb.Remote;
import javax.validation.ConstraintViolationException;

import de.wwu.pi.fooddelivery.jpa.Order;
import de.wwu.pi.fooddelivery.jpa.OrderPosition;
import de.wwu.pi.fooddelivery.jpa.User;

@Remote
public interface OrderService {

	/**
	 * Create a new order in the database with properties as specified by <code>order</code>.
	 * @param order The newly created order has the same property values as this parameter.
	 * @return The newly created order.
	 * @throws ConstraintViolationException (wrapped in an {@link EJBException})
	 */
	Order createOrder(Order order);
	
	/**
	 * Create a new order in the database with the specified property values.
	 * @param orderDate The date of the order.
	 * @param deliveryTime The desired delivery time of the order.
	 * @param additionalOrderInformation Additional text regarding the order.
	 * @param orderPositions The positions of the order.
	 * @param user The user who ordered.
	 * @return The newly created order.
	 * @throws ConstraintViolationException (wrapped in an {@link EJBException})
	 */
	Order createOrder(Date orderDate, Date deliveryTime, String additionalOrderInformation, Collection<OrderPosition> orderPositions, User user);
	
	/**
	 * Returns the order with the specified ID.
	 * @param orderId The ID of the order.
	 * @return The order.
	 * @throws IllegalArgumentException If no order exists for the given ID.
	 */
	Order getOrder(int orderId);
	
	/**
	 * Retrieves all orders from stored in the system.
	 * @return All orders.
	 */
	Collection<Order> getAllOrders();
	
	/**
	 * Validate the order entity.
	 * @param order
	 * @throws ConstraintViolationException
	 */
	void validate(Order order) throws ConstraintViolationException;
}
