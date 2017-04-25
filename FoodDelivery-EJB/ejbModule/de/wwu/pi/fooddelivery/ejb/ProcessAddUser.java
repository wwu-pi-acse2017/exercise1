package de.wwu.pi.fooddelivery.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Remote;

import de.wwu.pi.fooddelivery.jpa.User;

@LocalBean
public interface ProcessAddUser {
	
	public User step1_create_User(User user);
	
	public User step2_add_Address(User user);

	public User getUser(); 

}
