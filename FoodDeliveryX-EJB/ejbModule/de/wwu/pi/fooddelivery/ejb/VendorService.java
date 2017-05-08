package de.wwu.pi.fooddelivery.ejb;

import javax.ejb.EJBException;
import javax.ejb.Remote;
import javax.validation.ConstraintViolationException;

import de.wwu.pi.fooddelivery.jpa.Vendor;

@Remote
public interface VendorService extends EntityService<Vendor> {
	/**
	 * Create a new vendor in the database with the specified property values.
	 * @param name The name of the vendor.
	 * @param zip The zipCode of the vendor.
	 * @return The newly created vendor.
	 * @throws ConstraintViolationException (wrapped in an {@link EJBException})
	 */
	Vendor createVendor(String name, String zip);
}
