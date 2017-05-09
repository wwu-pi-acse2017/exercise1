package de.wwu.pi.fooddelivery.beans;

import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.validation.ConstraintViolationException;

import de.wwu.pi.fooddelivery.ejb.AddressService;
import de.wwu.pi.fooddelivery.ejb.UserService;
import de.wwu.pi.fooddelivery.jpa.Address;
import de.wwu.pi.fooddelivery.jpa.User;
import de.wwu.pi.fooddelivery.web.Util;

/**
 * Backing bean for the create vendor page.
 */

@ManagedBean
@SessionScoped
public class ProcessAddUser {

	private String errorMessage;
	
	private User user;
	
	private Address address;
	
	@EJB
	private UserService userEjb; 
	
	@EJB
	private AddressService addressEjb;
	
	public User getUser() {
		if(user == null) user = new User();
		return user;
	}
	
	public Address getAddress() {
		if(address == null) address = new Address();
		return address;
	}

	public String submit_step1_createUser() {
		// Action
		try {
			userEjb.validate(getUser());
			
			errorMessage = null;
		} catch (EJBException e) {
			errorMessage = "User not created: " + Util.getConstraintMessage(e);
		} catch (ConstraintViolationException e) {
			errorMessage = "User not created: " + Util.getConstraintMessage(e);
		}

		// Navigation
		if (errorMessage != null)
			return null;
		else
			return "addUser_step2_createAddress";
	}
	
	public String submit_step2_createAddress() {
		// Action
		try {
			addressEjb.validate(getAddress());
			
			getUser().setAddress(getAddress());
			userEjb.create(getUser());
			
			reset();
		} catch (EJBException e) {
			errorMessage = "User not created: " + Util.getConstraintMessage(e);
		}
		
		// Navigation
		if (errorMessage != null)
			return null;
		else
			return "listUsers";
	}
	
	public void cancel() {
		reset();
		
		Util.redirectToRoot();
	}
	
	public void reset() {
		user = null;
		address = null;
		errorMessage = null;
	}
	
	public String getError() {
		return errorMessage != null ? errorMessage : "";
	}
}
