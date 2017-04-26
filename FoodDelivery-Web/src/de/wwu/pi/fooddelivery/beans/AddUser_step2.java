package de.wwu.pi.fooddelivery.beans;

import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import de.wwu.pi.fooddelivery.ejb.UserService;
import de.wwu.pi.fooddelivery.jpa.User;
import de.wwu.pi.fooddelivery.web.Util;

/**
 * Backing bean for the create vendor page.
 */

@ManagedBean
@SessionScoped
public class AddUser_step2 {
	@ManagedProperty(value="#{processAddUser}")
	private ProcessBean processBean;
	//private User user;
	private String errorMessage;

	@EJB
	private UserService userEjb;

	public User getUser() {
//		if (user == null)
//			user = new User();
//		return user;
		return processBean.getUser();
	}

	public String submit() {
		// Action
		try {
			userEjb.createUser(getUser());
			errorMessage = null;
		} catch (EJBException e) {
			errorMessage = "User not created: " + Util.getConstraintMessage(e);
		}

		// Navigation
		if (errorMessage != null)
			return null;
		else
			// TODO cleanup
			
			return "listUsers";
	}

	public void setProcessBean(ProcessBean processBean){
		this.processBean = processBean;
	}
	
	public String getError() {
		return errorMessage != null ? errorMessage : "";
	}
}