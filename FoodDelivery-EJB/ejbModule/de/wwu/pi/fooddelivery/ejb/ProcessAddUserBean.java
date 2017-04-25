package de.wwu.pi.fooddelivery.ejb;

import java.util.concurrent.TimeUnit;
import javax.ejb.Stateful;
import javax.ejb.StatefulTimeout;
//import javax.ejb.TransactionManagement;
//import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import de.wwu.pi.fooddelivery.jpa.User;

@Stateful
@StatefulTimeout(unit = TimeUnit.MINUTES, value = 20)
//@TransactionManagement(TransactionManagementType.BEAN)
public class ProcessAddUserBean implements ProcessAddUser {
	
	@PersistenceContext
	private EntityManager em;
	
	//protected User user;

	@Override
	public User step1_create_User(User user) {
		//this.user = user;
		//em.persist(user);
		System.out.println("Entity: " + user.getFirstName() + ", " + user.getLastName());
		
		return user;
	}

	@Override
	public User step2_add_Address(User user) {
		//this.user = user;
		System.out.println("Entity: " + user.getFirstName() + ", " + user.getLastName());
		
		// Final step: persist all elements
		em.persist(user);
			
		return user;
	}

	@Override
	public User getUser() {
		return new User();
	}
}
