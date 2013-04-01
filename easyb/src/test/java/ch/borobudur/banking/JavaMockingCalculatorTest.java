package ch.borobudur.banking;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import ch.borobudur.banking.account.Account;
import ch.borobudur.banking.calculator.ICalculator;

public class JavaMockingCalculatorTest {

	private Account account;

	private ICalculator mockedCalculator = mock(ICalculator.class);

	@Before
	public void setUpMock() {
		when(mockedCalculator.add(0, 500)).thenReturn(Double.valueOf(500));
		when(mockedCalculator.subtract(500, 200)).thenReturn(Double.valueOf(300));

		account = new Account(mockedCalculator);
	}

	@Test
	public void injectionTest() {
		account.deposit(500);
		account.withdraw(200);

		assertEquals("balance is 300", 300, account.getBalance(), 0.001);
	}

}
