import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorTestImpl_Shahzad extends ValidatorTest {

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
        result = myValidator.isValidEmail("Hej@du.gl");
        assertTrue(result);

    }




}

