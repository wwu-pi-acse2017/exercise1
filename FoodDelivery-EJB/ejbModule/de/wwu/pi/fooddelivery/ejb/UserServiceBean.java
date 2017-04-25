package de.wwu.pi.fooddelivery.ejb;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import de.wwu.pi.fooddelivery.jpa.User;

@Stateless
public class UserServiceBean implements UserService {
	@PersistenceContext
	private EntityManager em;

	@Override
	public User createUser(User user) {
		em.persist(user);
		return user;
	}

	@Override
	public User createUser(String firstName, String lastName) {
		User newUser = new User();
		newUser.setFirstName(firstName);
		newUser.setLastName(lastName);
		return createUser(newUser);
	}

	@Override
	public User getUser(int userId) {
		User user = em.find(User.class, userId);

		if (user == null)
			throw new IllegalArgumentException(String.format("User with ID %s not found", userId));
		return user;
	}

	@Override
	public Collection<User> getAllUsers() {
		return em.createQuery("FROM User", User.class).getResultList();
	}

}
