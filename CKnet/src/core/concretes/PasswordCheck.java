package core.concretes;

import core.abstracts.ValidationService;
import entities.concretes.User;

public class PasswordCheck implements ValidationService {

	@Override
	public boolean check(User user) {
		
	if(user.getPassword().length()<6) {
		System.out.println("The password must be at least 6 characters.");
		return false;
	}
		
		
		return true;
	}
	
	
	
	

}
