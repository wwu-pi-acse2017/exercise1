package de.wwu.pi.fooddelivery.ejb;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import de.wwu.pi.fooddelivery.jpa.Vendor;

@Stateless
public class VendorServiceBean implements VendorService {
	@PersistenceContext
	private EntityManager em;

	@Override
	public Vendor createVendor(Vendor vendor) {
		em.persist(vendor);
		return vendor;
	}

	@Override
	public Vendor createVendor(String name, String zip) {
		Vendor newVendor = new Vendor();
		newVendor.setName(name);
		newVendor.setZip(zip);
		return createVendor(newVendor);
	}

	@Override
	public Vendor getVendor(int vendorId) {
		Vendor vendor = em.find(Vendor.class, vendorId);

		if (vendor == null)
			throw new IllegalArgumentException(String.format("Vendor with ID %s not found", vendorId));
		return vendor;
	}

	@Override
	public Collection<Vendor> getAllVendors() {
		return em.createQuery("FROM Vendor", Vendor.class).getResultList();
	}

}
