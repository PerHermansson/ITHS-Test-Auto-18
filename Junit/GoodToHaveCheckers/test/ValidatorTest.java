import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorTest {

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
        result = myValidator.isValidEmail("Hej@du.glade");
        assertTrue(result);

    }

}