package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserBaseDao implements UserDao {

	@Override
	public void add(User user) {
		
		System.out.println("User added to the system: "+user.getFirstName());
		
	}

	@Override
	public void delete(User user) {

		System.out.println("User deleted from the  system: "+user.getFirstName());
	}

	@Override
	public void update(User user) {
		
		System.out.println("User updated in the system "+user.getFirstName());
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
