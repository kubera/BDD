package ch.borobudur.banking;

import javax.inject.Inject;

public class Account {

	@Inject
	private ICalculator calculator;

	private double balance;

	public Account() {
		balance = 0;
	}

	public Account(double balance) {
		this.balance = balance;
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