import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorTest_Anders {

    @Test
    public void firstTest() {
        boolean result;
        Validator myValidator = new Validator();
        result = myValidator.isValidEmail(6666);
        assertFalse(result);

    }
    @Test
    public void test_isValidEmail_string() {
        boolean result;
        Validator myValidator = new Validator();
        result = myValidator.isValidEmail("Hej@du.glade");
        assertTrue(result);

    }

    @Test
    public void secondTest() {
        boolean result;
        Validator myValidator = new Validator();
        result = myValidator.isValidEmail("Abc.example.com");
        assertFalse(result);

    }

    @Test
    public void thirdTest() {
        boolean result;
        Validator myValidator = new Validator();
        result = myValidator.isValidEmail("A@b@c@example.com");
        assertTrue(result);
    }

    @Test
    public void forthTest() {
        boolean result;
        Validator myValidator = new Validator();
        result = myValidator.isValidEmail("very.common@example.com");
        assertTrue(result);
    }

    @Test
    public void fifthTest() {
        boolean result;
        Validator myValidator = new Validator();
        result = myValidator.isValidEmail("just\"not\"right@example.com");
        assertTrue(result);
    }
}
