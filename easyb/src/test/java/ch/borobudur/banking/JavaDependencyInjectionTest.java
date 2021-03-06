package ch.borobudur.banking;

import static org.junit.Assert.assertEquals;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ch.borobudur.banking.account.Account;
import ch.borobudur.banking.account.IAccountManager;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/META-INF/spring/context.xml")
public class JavaDependencyInjectionTest {

	private Account account;

	@Inject
	private IAccountManager accountManager;

	@Before
	public void setUpAccount() {
		account = accountManager.createAccount();
	}

	@Test
	public void injectionTest() {
		account.deposit(500.001);
		account.withdraw(200);

		assertEquals("balance is 300", 300, account.getBalance(), 0.0001);
	}

}
