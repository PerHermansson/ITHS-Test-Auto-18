import org.junit.Test;

import static org.junit.Assert.*;

public class TonyDTest {

    @Test
    public void test_isValidEmail_true() {
        boolean result;
        Validator myValidator = new Validator();
        result = myValidator.isValidEmail("simple@example.com\n" +
                "very.common@example.com\n" +
                "disposable.style.email.with+symbol@example.com\n" +
                "other.email-with-hyphen@example.com\n" +
                "fully-qualified-domain@example.com\n" +
                "user.name+tag+sorting@example.com\n" +
                "x@example.com\n" +
                "example-indeed@strange-example.com\n" +
                "admin@mailserver1\n" +
                "example@s.example\n" +
                "\" \"@example.org\n" +
                "\"john..doe\"@example.org");
        assertTrue(result);

    }

    @Test
    public void test_isValidEmail_false() {
        boolean result;
        Validator myValidator = new Validator();
        result = myValidator.isValidEmail("Abc.example.com \n" +
                "A@b@c@example.com\n" +
                "a\"b(c)d,e:f;g<h>i[j\\k]l@example.com\n" +
                "just\"not\"right@example.com\n" +
                "this is\"not\\allowed@example.com\n" +
                "this\\ still\\\"not\\\\allowed@example.com\n" +
                "1234567890123456789012345678901234567890123456789012345678901234+x@example.com");
        assertFalse(result);

    }

}