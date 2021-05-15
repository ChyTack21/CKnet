package core.concretes;

import GoogleRegister.GoogleRegisterManager;
import core.abstracts.LoggerService;

public class GoogleRegisterManagerAdapter implements LoggerService {

	@Override
	public void log(String Message) {
		GoogleRegisterManager googleManager = new GoogleRegisterManager();
		googleManager.googleCheck(Message);
	}

	
}
