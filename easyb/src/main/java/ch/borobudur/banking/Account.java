package ch.borobudur.banking;

public class Account {

	private double balance;

	private ICalculator calculator;

	public Account() {
		balance = 0;
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

	public void setCalculator(ICalculator calculator) {
		this.calculator = calculator;
	}
	
}