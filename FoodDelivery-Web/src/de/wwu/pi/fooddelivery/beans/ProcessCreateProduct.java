package de.wwu.pi.fooddelivery.beans;

import java.util.Arrays;

import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.validation.ConstraintViolationException;

import de.wwu.pi.fooddelivery.ejb.ProductService;
import de.wwu.pi.fooddelivery.ejb.VendorService;
import de.wwu.pi.fooddelivery.jpa.Product;
import de.wwu.pi.fooddelivery.jpa.Vendor;
import de.wwu.pi.fooddelivery.web.Util;

/**
 * Backing bean for the create vendor page.
 */

@ManagedBean
@SessionScoped
public class ProcessCreateProduct {
	private int vendorId;
	private Product product;
	private String errorMessage;

	@EJB
	private VendorService vendorEjb;
	
	@EJB
	private ProductService productEjb;

	public Product getProduct() {
		if (product == null)
			product = new Product();
		return product;
	}

	public String submit() {
		// Action
		try {
			Vendor vendor = vendorEjb.getVendor(vendorId);
			
			getProduct().setVendors(Arrays.asList(vendor));
			productEjb.createProduct(product);
			
			product = null;
			errorMessage = null;
		} catch (EJBException e) {
			errorMessage = "Vendor not created: " + Util.getConstraintMessage(e);
		} catch (ConstraintViolationException e) {
			errorMessage = "Vendor not created: " + Util.getConstraintMessage(e);
		}

		// Navigation
		if (errorMessage != null)
			return null;
		else
			return "listVendors";
	}
	
	public String cancel() {
		product = null;
		
		return "listVendors";
	}
	
	public String getError() {
		return errorMessage != null ? errorMessage : "";
	}
}
