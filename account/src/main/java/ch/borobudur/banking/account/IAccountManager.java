package ch.borobudur.banking.account;

/**
 * Account manager creates new accounts.
 * 
 * @author Stefan Wagner
 */
public interface IAccountManager {

	/**
	 * @return Returns a new account. 
	 */
	Account createAccount();

}
