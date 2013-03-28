package ch.borobudur.banking;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class AccountManager {
	
	@Inject
	private ICalculator calculator;
	
	public Account createAccount() {
		Account account = new Account();
		account.setCalculator(calculator);
		return account;
	}
	
}
