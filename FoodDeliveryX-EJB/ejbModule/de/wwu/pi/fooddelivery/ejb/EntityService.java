package de.wwu.pi.fooddelivery.ejb;

import java.util.Collection;

import javax.ejb.EJBException;
import javax.validation.ConstraintViolationException;

public interface EntityService<T> {
	/**
	 * Creates a new entity in the database.
	 * @param entity The newly created entity has the same property values as this parameter.
	 * @return The newly created entity.
	 * @throws ConstraintViolationException (wrapped in an {@link EJBException})
	 */
	T create(T entity) throws ConstraintViolationException; 
	
	/**
	 * Retrieve an entity using its id.
	 * @param id The id of the entity.
	 * @return The entity.
	 * @throws IllegalArgumentException If no user exists for the given ID.
	 */
	T get(int id) throws IllegalArgumentException;
	
	/**
	 * Retrieve all entities of this type stored in the system. 
	 * @return A collection of entities.
	 */
	Collection<T> getAll();
	
	/**
	 * Persist an updated entity.
	 * @param entity The entity with the property values to be updated.
	 * @return The updated entity.
	 */
	T update(T entity);
	
	/**
	 * Remove an entity from the database.
	 * @param id The id of the entity to delete.
	 */
	void delete(int id);
	
	/**
	 * Validate an entity according to its JPA constraints.
	 * @param entity The entity to validate
	 * @throws ConstraintViolationException
	 */
	void validate(T entity) throws ConstraintViolationException;
}
