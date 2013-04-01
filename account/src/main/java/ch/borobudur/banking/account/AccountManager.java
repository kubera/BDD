package ch.borobudur.banking.account;

import javax.inject.Inject;
import javax.inject.Named;

import ch.borobudur.banking.calculator.ICalculator;

/**
 * Account manager implementation.
 * Needs to have a calculator implementation injected. 
 * 
 * @author Stefan Wagner
 */
@Named
public class AccountManager implements IAccountManager {

	@Inject
	private ICalculator calculator;

	public Account createAccount() {
		return new Account(calculator);
	}

}
