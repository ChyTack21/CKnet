package core.abstracts;

import entities.concretes.User;

public interface ValidationService {
	
	boolean check(User user);

}
