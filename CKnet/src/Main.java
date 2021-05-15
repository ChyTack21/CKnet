
import business.abstracts.UserService;
import business.concretes.UserManager;
import core.abstracts.ValidationService;
import core.concretes.EmailCheck;
import core.concretes.F�rstAndLastNameCheck;
import core.concretes.GoogleRegisterManagerAdapter;
import core.concretes.PasswordCheck;
import dataAccess.concretes.UserBaseDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		ValidationService[] validationServices ={new PasswordCheck(),new F�rstAndLastNameCheck(),new EmailCheck()};
		User user = new User(1,"emir","o�uzt�rk","emir@gmail.com","em21ju5dasdas");
		
		UserService userService = new UserManager(new UserBaseDao(),validationServices,new GoogleRegisterManagerAdapter());
		userService.register(user);
		userService.login(user);
		
	}

}
