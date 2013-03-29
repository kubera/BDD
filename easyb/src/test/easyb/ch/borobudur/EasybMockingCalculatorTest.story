import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import ch.borobudur.banking.Account;
import ch.borobudur.banking.ICalculator;

description "ssimple account manipulation"

scenario "increasing an empty account", {
	
	given "an empty account", {
		
		account = new Account()
		mockedCalculator = mock(ICalculator.class)
		account.setCalculator(mockedCalculator)

		when(mockedCalculator.add(0, 500)).thenReturn(Double.valueOf(500))
		when(mockedCalculator.subtract(500, 200)).thenReturn(Double.valueOf(300))
	}
	
	when "500 is added", {
		account.deposit(500)
	}
	
	and "200 is removed", {
		account.withdraw(200)
	}
	
	then "the balance should be 300", {
		account.getBalance().shouldBe 300
	}
}