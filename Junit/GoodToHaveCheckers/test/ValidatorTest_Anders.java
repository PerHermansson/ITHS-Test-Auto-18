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
}
