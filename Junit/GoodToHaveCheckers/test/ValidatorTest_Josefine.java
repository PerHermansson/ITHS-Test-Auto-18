import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorTest_Josefine {

    @Test
    public void test_isValidEmail_integer() {
        boolean result;
        Validator myValidator = new Validator();
        result = myValidator.isValidEmail(5566);
        assertFalse(result);

    }

    @Test
    public void test_isNotValidEmail_string() {
        boolean result;
        Validator myValidator = new Validator();
        result = myValidator.isValidEmail("Abc.example.com");
        assertFalse(result);

    }

    @Test
    public void test_isValidEmail_string() {
        boolean result;
        Validator myValidator = new Validator();
        result = myValidator.isValidEmail("Abc@example.com");
        assertTrue(result);

    }

    @Test
    public void test_shortLength_string() {
        boolean result;
        Validator myValidator = new Validator();
        result = myValidator.isValidEmail("A@");
        assertTrue(result);

    }

    @Test
    public void test_lagomLength_string() {
        boolean result;
        Validator myValidator = new Validator();
        result = myValidator.isValidEmail("hej@josefine.se");
        assertTrue(result);

    }


}