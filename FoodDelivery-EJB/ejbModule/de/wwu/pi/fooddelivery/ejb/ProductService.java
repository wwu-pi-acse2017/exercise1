package de.wwu.pi.fooddelivery.ejb;

import java.util.Collection;

import javax.ejb.EJBException;
import javax.ejb.Remote;
import javax.validation.ConstraintViolationException;

import de.wwu.pi.fooddelivery.jpa.Product;
import de.wwu.pi.fooddelivery.jpa.Vendor;

@Remote
public interface ProductService {

	/**
	 * Create a new product in the database related to the specified <code>product</code>.
	 * @param vendor The product that should be created.
	 * @return The newly created product.
	 * @throws ConstraintViolationException (wrapped in an {@link EJBException})
	 */
	Product createProduct(Product product);
	
	/**
	 * Returns the product with the specified ID.
	 * @param productId The ID of the product.
	 * @return The product.
	 * @throws IllegalArgumentException If no product exists for the given ID.
	 */
	Product getProduct(int productId);
	
	/**
	 * Returns the collection of products that are related to a specified vendor.
	 * @param vendor The vendor to which the products are retrieved.
	 * @return The collection of products.
	 * @throws IllegalArgumentException If no product exists for the given ID.
	 */
	Collection<Product> getProductsOfVendor(Vendor vendor);
	
	/**
	 * Validate the product entity.
	 * @param product
	 * @throws ConstraintViolationException
	 */
	void validate(Product product) throws ConstraintViolationException;
}
