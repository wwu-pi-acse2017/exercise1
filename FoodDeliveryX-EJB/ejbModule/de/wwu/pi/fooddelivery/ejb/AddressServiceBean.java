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
import de.wwu.pi.fooddelivery.jpa.Address;

@Stateless
public class AddressServiceBean implements AddressService {
	@PersistenceContext
	private EntityManager em;
	
	@Resource
    private Validator validator;
    
	@Override
	public Address create(Address entity) throws ConstraintViolationException {
		return em.merge(entity);
	}

	@Override
	public Address get(int id) throws IllegalArgumentException {
		Address address = em.find(Address.class, id);

		if (address == null)
			throw new IllegalArgumentException(String.format("Address with ID %s not found", id));
		return address;
	}

	@Override
	public Collection<Address> getAll() {
		return em.createQuery("FROM Address", Address.class).getResultList();
	}

	@Override
	public Address update(Address entity) {
		return em.merge(entity);
	}

	@Override
	public void delete(int id) {
		em.remove(get(id));
	}

	@Override
	public void validate(Address address) throws ConstraintViolationException {
		Set<ConstraintViolation<Address>> violations = validator.validate(address);
		if(!violations.isEmpty()) throw
			new ConstraintViolationException(violations);
	}
}
