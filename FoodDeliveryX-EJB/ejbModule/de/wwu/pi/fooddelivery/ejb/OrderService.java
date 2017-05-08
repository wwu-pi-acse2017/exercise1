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
public interface OrderService extends EntityService<Order> {

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
}
