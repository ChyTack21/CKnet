package core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import core.abstracts.ValidationService;
import entities.concretes.User;

public class EmailCheck implements ValidationService {

	String emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	Pattern emailPattern = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
	
	@Override
	public boolean check(User user) {
	Matcher matcher =emailPattern.matcher(user.geteMail());
		if(matcher.matches()) {
		return true;
		}
		else {
			System.out.println("Invalid Email!!");
		return false;}
	}

}
