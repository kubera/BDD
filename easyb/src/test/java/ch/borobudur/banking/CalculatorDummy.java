package ch.borobudur.banking;

public class CalculatorDummy implements ICalculator {

	@Override
	public double add(double summand1, double summand2) {
		return summand1 + summand2;
	}

	@Override
	public double subtract(double minuend, double subtrahend) {
		return minuend - subtrahend;
	}

}
