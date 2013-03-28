package ch.borobudur.banking;

import javax.inject.Inject;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ch.borobudur.banking.Account;
import ch.borobudur.banking.AccountManager;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/META-INF/spring/test-context.xml")
public class JavaDependencyInjectionWithDummyCalculatorTest extends Assert {

	@Inject
	private AccountManager accountManager;
	
    @Test
    public void injectionTest() {
    	Account account = accountManager.createAccount();
    	account.deposit(500.229);
    	account.deposit(500);
    	assertEquals("balance is 1000.229", 1000.229, account.getBalance(), 0.0001);
    }

}
