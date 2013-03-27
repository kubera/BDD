package ch.borobudur;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ch.borobudur.banking.Account;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "/META-INF/spring/context.xml")
public class DITestJava extends Assert {

    @Test
    public void diTest() {
    	Account account = new Account(1000);
    	assertEquals("balance is 1000", 1000, account.getBalance(), 0.0001);
    }

}
