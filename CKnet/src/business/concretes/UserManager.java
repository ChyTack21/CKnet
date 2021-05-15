package business.concretes;



import java.util.Scanner;


import business.abstracts.UserService;
import core.abstracts.LoggerService;
import core.abstracts.ValidationService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;
	private ValidationService[] validationServices;
	private LoggerService loggerService;


	public UserManager(UserDao userDao,ValidationService[] validationService,LoggerService loggerService) {
		this.userDao = userDao;
		this.validationServices=validationService;
        this.loggerService=loggerService;
	}

	public  UserManager() {}
	
	@Override
	public void register(User user) {
		for(ValidationService validationService: this.validationServices) {
			if (validationService.check(user)==false) {
				System.out.println("Failed to register!! Try again");
				return;
			}
		}
		
		this.userDao.add(user);
		this.loggerService.log("Your registration has been successfully completed");
		System.out.println("verification email has been sent: "+user.geteMail());
		System.out.println("Your registration has been successfully completed");
		
		
		
	}

	@Override
	public void login(User user) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the email: ");
	    String email =scan.nextLine();
	   System.out.println("enter the password: ");
	   String password =scan.nextLine();
	
			if (email.equals(user.geteMail()) && password.equals(user.getPassword())) {
			System.out.println("Your login is successful");
				return;
			}

		
		System.out.println("Sign in not successful");
	}
		
		
		
	



}
