package de.wwu.pi.fooddelivery.ejb;

import java.util.Collection;
import java.util.Set;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import de.wwu.pi.fooddelivery.jpa.User;

@Stateless
public class UserServiceBean implements UserService {
	@PersistenceContext
	private EntityManager em;
	
	@Resource
    private ValidatorFactory validatorFactory;

    @Resource
    private Validator validator;

	@Override
	public User create(User user) {
		em.merge(user);
		return user;
	}

	@Override
	public User createUser(String firstName, String lastName) {
		User newUser = new User();
		newUser.setFirstName(firstName);
		newUser.setLastName(lastName);
		return create(newUser);
	}

	@Override
	public User get(int userId) {
		User user = em.find(User.class, userId);

		if (user == null)
			throw new IllegalArgumentException(String.format("User with ID %s not found", userId));
		return user;
	}

	@Override
	public Collection<User> getAll() {
		return em.createQuery("FROM User", User.class).getResultList();
	}

	@Override
	public void validate(User user) throws ConstraintViolationException {
		Set<ConstraintViolation<User>> violations = validator.validate(user);
		if(!violations.isEmpty()) throw
			new ConstraintViolationException(violations);
	}

	@Override
	public User update(User user) {
		return em.merge(user);
	}

	@Override
	public void delete(int id){
		em.remove(get(id));
	}
}
