package ch.borobudur.banking;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JavaMockingCalculatorTest extends Assert {

	private ICalculator mockedCalculator = mock(Calculator.class);
	
	@Before
	public void setUpMock() {
		when(mockedCalculator.add(0, 500)).thenReturn(Double.valueOf(500));
		when(mockedCalculator.add(500, 500)).thenReturn(Double.valueOf(1000));
	}
	
    @Test
    public void injectionTest() {
		Account account = new Account();
		account.setCalculator(mockedCalculator);

		account.deposit(500);
    	account.deposit(500);
    	assertEquals("balance is 1000", 1000, account.getBalance(), 0.001);
    }

}
