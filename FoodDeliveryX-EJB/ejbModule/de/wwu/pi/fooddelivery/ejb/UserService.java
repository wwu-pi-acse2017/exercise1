package de.wwu.pi.fooddelivery.ejb;

import javax.ejb.EJBException;
import javax.ejb.Remote;
import javax.validation.ConstraintViolationException;

import de.wwu.pi.fooddelivery.jpa.Address;
import de.wwu.pi.fooddelivery.jpa.User;

@Remote
public interface UserService extends EntityService<User> {
	/**
	 * Create a new user in the database with the specified property values.
	 * @param firstName The first name of the user.
	 * @param lastName The last name of the user.
	 * @return The newly created user.
	 * @throws ConstraintViolationException (wrapped in an {@link EJBException})
	 */
	User createUser(String firstName, String lastName);
	
	/**
	 * Validate the address entity.
	 * @param address
	 * @throws ConstraintViolationException
	 */
	void validate(Address address) throws ConstraintViolationException;
}
