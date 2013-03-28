package ch.borobudur.banking;

import java.math.BigDecimal;

import javax.inject.Named;

@Named
public class Calculator implements ICalculator {

	@Override
	public double add(double summand1, double summand2) {
		System.out.println("Main implementation with " + Calculator.class.getName() + "addition");
		BigDecimal result = round(summand1 + summand2);
		return result.doubleValue();
	}

	@Override
	public double subtract(double minuend, double subtrahend) {
		System.out.println("Main implementation with " + Calculator.class.getName() + "subtraction");
		BigDecimal result = round(minuend - subtrahend);
		return result.doubleValue();
	}

	private BigDecimal round(double amount) {
		return new BigDecimal(amount).setScale(2, BigDecimal.ROUND_HALF_UP);
	}

}
