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

import de.wwu.pi.fooddelivery.jpa.Product;
import de.wwu.pi.fooddelivery.jpa.Vendor;

@Stateless
public class ProductServiceBean implements ProductService {

	@PersistenceContext
	private EntityManager em;
	
	@Resource
    private ValidatorFactory validatorFactory;

    @Resource
    private Validator validator;
	
	@Override
	public Product createProduct(Product product) {
		em.persist(product);
		return product;
	}

	@Override
	public Product getProduct(int productId) {
		Product product = em.find(Product.class, productId);

		if (product == null)
			throw new IllegalArgumentException(String.format("Product with ID %s not found", productId));
		return product;
	}

	@Override
	public Collection<Product> getProductsOfVendor(Vendor vendor) {
		return em.createQuery("SELECT p FROM Product p INNER JOIN p.vendors vendors WHERE vendors.id in :v", Product.class).setParameter("v", vendor.getVendorId()).getResultList();
	}
	
	@Override
	public void validate(Product product) throws ConstraintViolationException {
		Set<ConstraintViolation<Product>> violations = validator.validate(product);
		if(!violations.isEmpty()) throw
			new ConstraintViolationException(violations);
	}

}
