import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorTest_Fredrik {


    //Rejected emails

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
        result = myValidator.isValidEmail("hejhallå");
        assertFalse(result);

    }

    @Test
    public void test_isValidEmail_noProboscis() {
        boolean result;
        Validator myValidator = new Validator();
        result = myValidator.isValidEmail("Abc.example.com");
        assertFalse(result);
    }

    @Test
    public void test_isValidEmail_multipleProboscis() {
        boolean result;
        Validator myValidator = new Validator();
        result = myValidator.isValidEmail("A@b@c@example.com");
        assertFalse(result);
    }

    @Test
    public void test_isValidEmail_SpecialCharacters() {
        boolean result;
        Validator myValidator = new Validator();
        result = myValidator.isValidEmail("a\"b(c)d,e:f;g<h>i[j\\k]l@example.com");
        assertFalse(result);
    }

    @Test
    public void test_isValidEmail_nonDottedQuotedString() {
        //quoted strings must be dot separated or the only element making up the local-part
        boolean result;
        Validator myValidator = new Validator();
        result = myValidator.isValidEmail("just\"not\"right@example.com");
        assertFalse(result);
    }

    @Test
    public void test_isValidEmail_invalidSpaceQuote() {
        //Spaces, quotes, and backslashes may only exist when within quoted strings and preceded by a backslash
        boolean result;
        Validator myValidator = new Validator();
        result = myValidator.isValidEmail("this is\"not\\allowed@example.com");
        assertFalse(result);
    }

    @Test
    public void test_isValidEmail_nonContainedQuote() {
        //even if escaped (preceded by a backslash), spaces, quotes, and backslashes must still be contained by quotes
        boolean result;
        Validator myValidator = new Validator();
        result = myValidator.isValidEmail("this\\ still\\\"not\\\\allowed@example.com");
        assertFalse(result);
    }

    @Test
    public void test_isValidEmail_tooLongLocalPart() {
        //local part is longer than 64 characters
        boolean result;
        Validator myValidator = new Validator();
        result = myValidator.isValidEmail("1234567890123456789012345678901234567890123456789012345678901234+x@example.com");
        assertFalse(result);
    }





    //Accepted Email tests

    @Test
    public void test_isValidEmail_commonEmail() {
        boolean result;
        Validator myValidator = new Validator();
        result = myValidator.isValidEmail("simple@example.com");
        assertTrue(result);
    }

    @Test
    public void test_isValidEmail_SeperateByPunctuation() {
        boolean result;
        Validator myValidator = new Validator();
        result = myValidator.isValidEmail("very.common@example.com");
        assertTrue(result);
    }

    @Test
    public void test_isValidEmail_PlusSymbol() {
        boolean result;
        Validator myValidator = new Validator();
        result = myValidator.isValidEmail("disposable.style.email.with+symbol@example.com");
        assertTrue(result);
    }

    @Test
    public void test_isValidEmail_Hyphen() {
        boolean result;
        Validator myValidator = new Validator();
        result = myValidator.isValidEmail("other.email-with-hyphen@example.com");
        assertTrue(result);
    }

    @Test
    public void test_isValidEmail_QualifiedDomain() {
        boolean result;
        Validator myValidator = new Validator();
        result = myValidator.isValidEmail("fully-qualified-domain@example.com");
        assertTrue(result);
    }

    @Test
    public void test_isValidEmail_OneLetterLocalPart() {
        boolean result;
        Validator myValidator = new Validator();
        result = myValidator.isValidEmail("x@example.com");
        assertTrue(result);
    }

    @Test
    public void test_isValidEmail_Strange() {
        boolean result;
        Validator myValidator = new Validator();
        result = myValidator.isValidEmail("example-indeed@strange-example.com");
        assertTrue(result);
    }

    @Test
    public void test_isValidEmail_LocalDomain() {
        //local domain name with no TLD, although ICANN highly discourages dotless email addresses.
        boolean result;
        Validator myValidator = new Validator();
        result = myValidator.isValidEmail("admin@mailserver1");
        assertTrue(result);
    }

    @Test
    public void test_isValidEmail_Domain() {
        boolean result;
        Validator myValidator = new Validator();
        result = myValidator.isValidEmail("example@s.example");
        assertTrue(result);
    }

    @Test
    public void test_isValidEmail_SpacesBetweenQuotation() {
        boolean result;
        Validator myValidator = new Validator();
        result = myValidator.isValidEmail("\" \"@example.org");
        assertTrue(result);
    }

    @Test
    public void test_isValidEmail_QuotedDoubleDot() {
        boolean result;
        Validator myValidator = new Validator();
        result = myValidator.isValidEmail("\"john..doe\"@example.org");
        assertTrue(result);
    }




















}