package de.wwu.pi.fooddelivery.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import de.wwu.pi.fooddelivery.jpa.User;

@ManagedBean(name="processAddUser")
@SessionScoped
public class ProcessBean {

	private User user = new User();
	
	public User getUser() {
		if (user == null)
			user = new User();
		return user;
	}
}
