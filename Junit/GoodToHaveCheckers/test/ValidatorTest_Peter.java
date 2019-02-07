import org.junit.Test;
import java.util.ArrayList;


import static org.junit.Assert.*;

public class ValidatorTest_Peter {

    Validator myValidator = new Validator();
    boolean result;

    ArrayList<String> validEmails = new ArrayList<String>(){{
        add("simple@example.com");
        add("very.common@example.com");
        add("disposable.style.email.with+symbol@example.com");
        add("other.email-with-hyphen@example.com");
        add("fully-qualified-domain@example.com");
        add("user.name+tag+sorting@example.com");
        add("x@example.com");
        add("example-indeed@strange-example.com");
        add("admin@mailserver1");
        add("example@s.example");
    }};

    @Test
    public void test_isValidEmail() {
        for (String i: validEmails) {
            result = myValidator.isValidEmail(validEmails);
            assertFalse(result);
            System.out.println("Entry: "+i+", is ok!");
        }

    }

    @Test
    public void test_isValidEmail_string() {
        for (String i : validEmails) {
            result = myValidator.isValidEmail(validEmails);
            assertFalse(result);
            System.out.println("Entry: "+i+", is ok!");
        }
    }
}