package ch.borobudur;

import javax.inject.Inject;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "/META-INF/spring/context.xml")
public class DITestJava {

    @Inject
    WriteController wc;
    @Inject
    ReadController rc;

    @Test
    public void diTest() {
    	Assert.assertNotNull(wc);
    	Assert.assertNotNull(rc);
    	
    	wc.doConfig();
    	rc.printConfig();
    }

}
