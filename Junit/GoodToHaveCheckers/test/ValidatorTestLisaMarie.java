import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorTestLisaMarie {


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
        result = myValidator.isValidEmail("simplexample.com");
        assertFalse(result);

    }
    @Test
    public void test_isNotValidEmail_string() {
        boolean result;
        Validator myValidator = new Validator();
        result = myValidator.isValidEmail("Ab@c@example.com");
        assertTrue(result);
    }
    @Test
    public void shortString() {
        boolean result;
        Validator myValidator = new Validator();
        result = myValidator.isValidEmail("ab");
        assertFalse(result);
    }

}
