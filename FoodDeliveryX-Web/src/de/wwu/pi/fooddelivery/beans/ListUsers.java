package de.wwu.pi.fooddelivery.beans;

import java.util.Collection;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import de.wwu.pi.fooddelivery.ejb.UserService;
import de.wwu.pi.fooddelivery.jpa.User;

@ManagedBean
public class ListUsers {
	
	@EJB
	UserService userEjb;

	private Collection<User> users;
	
	public Collection<User> getUsers(){
		if(users == null)
			users = userEjb.getAll();
		return users;
	}
}
