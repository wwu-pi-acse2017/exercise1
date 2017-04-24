package de.wwu.pi.fooddelivery.ejb;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import de.wwu.pi.fooddelivery.jpa.Product;
import de.wwu.pi.fooddelivery.jpa.Vendor;

@Stateless
public class ProductServiceBean implements ProductService {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Product createProduct(Vendor vendor) {
		// TODO Auto-generated method stub
		return null;
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

}
