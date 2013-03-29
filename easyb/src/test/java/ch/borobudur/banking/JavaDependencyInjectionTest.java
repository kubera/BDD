package ch.borobudur.banking;

import javax.inject.Inject;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/META-INF/spring/context.xml")
public class JavaDependencyInjectionTest extends TestCase {

	private Account account;

	@Inject
	private AccountManager accountManager;

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
