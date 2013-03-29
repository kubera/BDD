package ch.borobudur.banking;

/**
 * Calculating numbers.
 * 
 * @author Stefan Wagner
 */
public interface ICalculator {
	
	/**
	 * Addition. 
	 * 
	 * @param summand1 Summand one.
	 * @param summand2 Summand two.
	 * @return The addition of summand one and two. 
	 */
	double add(double summand1, double summand2);
	
	/**
	 * Subtraction. 
	 * 
	 * @param minuend The minuend. 
	 * @param subtrahend The subtrahend. 
	 * @return The subtraction of the minuend and the subtrahend. 
	 */
	double subtract(double minuend, double subtrahend);
	
}
