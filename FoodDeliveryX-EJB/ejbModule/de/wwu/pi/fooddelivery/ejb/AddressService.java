package de.wwu.pi.fooddelivery.ejb;

import javax.ejb.Remote;

import de.wwu.pi.fooddelivery.jpa.Address;

@Remote
public interface AddressService extends EntityService<Address> {

}
