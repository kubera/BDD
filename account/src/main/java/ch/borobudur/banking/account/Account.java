package ch.borobudur.banking.account;

import ch.borobudur.banking.calculator.ICalculator;

/**
 * Account example.
 * 
 * @author Stefan Wagner
 */
public class Account {

	private double balance = 0;

	private ICalculator calculator;

	public Account(ICalculator calculator) {
		this.calculator = calculator;
	}

	public void deposit(double amount) {
		balance = calculator.add(balance, amount);
	}

	public void withdraw(double amount) {
		balance = calculator.subtract(balance, amount);
	}

	public double getBalance() {
		return balance;
	}

}
