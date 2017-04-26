package de.wwu.pi.fooddelivery.beans;

import java.util.Collection;

import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.faces.bean.ManagedBean;

import de.wwu.pi.fooddelivery.ejb.UserService;
import de.wwu.pi.fooddelivery.jpa.Address;
import de.wwu.pi.fooddelivery.jpa.User;
import de.wwu.pi.fooddelivery.web.Util;

@ManagedBean
public class UserPage {

	private int userId;
	private User user;

	@EJB
	UserService userEjb;
	
	public void ensureInitialized() {
		try{
			if(getUser() != null)
				return; // Success
		} catch(EJBException e) {
			e.printStackTrace();
		}
		Util.redirectToRoot();
	}
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
		user = null;
	}

	public User getUser() {
		if(user == null)
			user = userEjb.getUser(getUserId());
		return user;
	}
}
