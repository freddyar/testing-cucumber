package runner;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * @author freddyar
 */
@RunWith(Cucumber.class)
public class Hook {

    @Before
    public void setup() {
        System.out.println("It is my before");
    }

    @After
    public void cleanUp() {
        System.out.println("It is my after");
    }
}
