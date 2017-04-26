package de.wwu.pi.fooddelivery.beans;

import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.validation.ConstraintViolationException;

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
	
	private User user = new User();
	
	private Address address = new Address();
	
	@EJB
	private UserService userEjb; 
	
	public User getUser() {
		return user;
	}
	
	public Address getAddress() {
		return address;
	}

	public String submit_create_user() {
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
			return "addUser_create_address";
	}
	
	public String submit_create_address() {
		// Action
		try {
			userEjb.validate(getAddress());
			
			getUser().setAddress(getAddress());
			userEjb.createUser(getUser());
			
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
