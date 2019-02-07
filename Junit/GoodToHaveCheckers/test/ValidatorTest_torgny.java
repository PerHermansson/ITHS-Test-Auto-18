import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorTest_torgny {
    private Validator validator;

    @Before
    public void setUp() {
        validator = new Validator();
    }

    @Test
    public void isValidEmail_valid() {
        boolean result = validator.isValidEmail("simple@example.com");

        assertTrue(result);
    }

    @Test
    public void isValidEmail_ivalid() {
        boolean result = validator.isValidEmail("Abc.example.com");

        assertFalse(result);
    }
}