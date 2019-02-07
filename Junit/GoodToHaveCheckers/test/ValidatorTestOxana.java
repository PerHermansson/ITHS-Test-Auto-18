import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorTestOxana {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isValidEmailTest1() {
        boolean result;
        Validator myValidator = new Validator();
        result = myValidator.isValidEmail("oxana@mail.com");
        assertTrue(result);
    }

    @Test
    public void isValidEmailTest2() {
        boolean result;
        Validator myValidator = new Validator();
        result = myValidator.isValidEmail("oxanamail.com");
        assertFalse(result);
    }




}