import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ValidatorTest_torgny {
    private Validator validator;
    private String address;
    private boolean expected;

    public ValidatorTest_torgny(String address, boolean expected) {
        this.address = address;
        this.expected = expected;
    }

    private static String[] validAddresses = {
            "simple@example.com",
            "very.common@example.com",
            "disposable.style.email.with+symbol@example.com",
            "other.email-with-hyphen@example.com",
            "fully-qualified-domain@example.com",
            "user.name+tag+sorting@example.com",
            "x@example.com",
            "example-indeed@strange-example.com",
            "admin@mailserver1",
            "example@s.example",
            "\" \"@example.org",
            "\"john..doe\"@example.org"
    };

    private static String[] invalidAddresses = {
            "Abc.example.com",
            "A@b@c@example.com",
            "a\"b(c)d,e:f;g<h>i[j\\k]l@example.com",
            "just\"not\"right@example.com",
            "this is\"not\\allowed@example.com",
            "this\\ still\\\"not\\allowed@example.com",
            "1234567890123456789012345678901234567890123456789012345678901234+x@example.com"
    };

    /*
     * Para ihop de giltiga adresserna med true och de ogiltiga med false och returnera listan att parameterisera med.
     */
    @Parameterized.Parameters
    public static Collection getParameters() {
        ArrayList<Object[]> arrayList = new ArrayList<>();
        for (String a: validAddresses)
            arrayList.add(new Object[] {a, true});
        for (String a: invalidAddresses)
            arrayList.add(new Object[] {a, false});
        return arrayList;
    }

    @Before
    public void setUp() {
        validator = new Validator();
    }

    @Test
    public void verifyWikipediaExamples() {
        boolean result = validator.isValidEmail(address);

        assertEquals(expected, result);
    }

    @Test
    public void verifyEmptyAddressIsInvalid() {
        boolean result = validator.isValidEmail("");

        assertFalse(result);
    }

    @Test
    public void verifyTooShortAddressIsInvalid() {
        boolean result = validator.isValidEmail("a@b.c");

        assertFalse(result);
    }

    @Test
    public void verifyLowboundAddressIsValid() {
        boolean result = validator.isValidEmail("a@b.co");

        assertTrue(result);
    }

    @Test
    public void verifyNoAtIsInvalid() {
        boolean result = validator.isValidEmail("ab.c");

        assertFalse(result);
    }
}