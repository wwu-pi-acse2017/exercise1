package de.wwu.pi.fooddelivery.ejb;

import java.util.Collection;
import javax.ejb.EJBException;
import javax.ejb.Remote;
import javax.validation.ConstraintViolationException;

import de.wwu.pi.fooddelivery.jpa.Address;
import de.wwu.pi.fooddelivery.jpa.User;

@Remote
public interface UserService {

	/**
	 * Create a new user in the database with properties as specified by <code>user</code>.
	 * @param user The newly created user has the same property values as this parameter.
	 * @return The newly created user.
	 * @throws ConstraintViolationException (wrapped in an {@link EJBException})
	 */
	User createUser(User user);
	
	/**
	 * Create a new user in the database with the specified property values.
	 * @param firstName The first name of the user.
	 * @param lastName The last name of the user.
	 * @return The newly created user.
	 * @throws ConstraintViolationException (wrapped in an {@link EJBException})
	 */
	User createUser(String firstName, String lastName);
	
	/**
	 * Returns the user with the specified ID.
	 * @param userId The ID of the user.
	 * @return The user.
	 * @throws IllegalArgumentException If no user exists for the given ID.
	 */
	User getUser(int userId);
	
	/**
	 * Retrieves all users from stored in the system.
	 * @return All users.
	 */
	Collection<User> getAllUsers();
	
	/**
	 * Validate the user entity.
	 * @param user
	 * @throws ConstraintViolationException
	 */
	void validate(User user) throws ConstraintViolationException;
	
	/**
	 * Validate the address entity.
	 * @param address
	 * @throws ConstraintViolationException
	 */
	void validate(Address address) throws ConstraintViolationException;
}
