package core.concretes;

import core.abstracts.ValidationService;
import entities.concretes.User;

public class FÝrstAndLastNameCheck implements ValidationService {

	@Override
	public boolean check(User user) {
	
		if(user.getFirstName().length()<2||user.getLastName().length()<2) {
			System.out.println("Name and surname must contain at least two characters");
			return false;
		}
		
		
		
		return true;
	}

}
