import javax.inject.Inject;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ch.borobudur.banking.account.Account;
import ch.borobudur.banking.account.IAccountManager;

description "simple account manipulation"

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath:/META-INF/spring/context.xml")
//scenario "increasing an empty account", {
//
//	@Inject AccountManager accountManager
//
//	given "is an empty account", {
//		accout = accountManager.createAccount()
//	}
//	when "500 is added", {
//		account.deposit(500);
//	}
//	and "200 is removed", {
//		account.withdraw(200);
//	}
//	then "the balance should be 300", {
//		account.getBalance().shouldBe 300
//	}
//}
