import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorTestDaniel {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test_isValidEmail_integer() {
        boolean result;
        Validator myValidator = new Validator();
        result = myValidator.isValidEmail(2345);
        assertFalse(result);

    }

    @Test
    public void test_isValidEmail_string() {
        boolean result;
        Validator myValidator = new Validator();
        result = myValidator.isValidEmail("simple@example.com");
        assertTrue(result);
    }
    @Test
    public void test_isNotValidEmail_string(){
        boolean result;
        Validator myValidator = new Validator();
        result = myValidator.isValidEmail("Abc.example.com");
        assertFalse(result);
    }

}
