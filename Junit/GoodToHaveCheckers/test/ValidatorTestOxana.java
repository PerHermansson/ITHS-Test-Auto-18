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

    @Test
    public void isValidEmailTest3() {
        boolean result;
        Validator myValidator = new Validator();
        result = myValidator.isValidEmail(1234);
        assertFalse(result);
    }

    @Test
    public void isValidEmailTest4() {
        boolean result;
        Validator myValidator = new Validator();
        result = myValidator.isValidEmail("amhdf///kjqwbd90q83");
        assertFalse(result);
    }

    @Test
    public void isValidEmailTest5() {
        boolean result;
        Validator myValidator = new Validator();
        String[] inValidEmail = {"Abc.example.com", "A@", "aakjskl....example.com","xcfvzfvfvfzdbvfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffgdfgfgdfgfgfgfgfgffffffffffffffffffffffffffffffffffff"};
        for (String a:inValidEmail) {
            result = myValidator.isValidEmail(a);
            System.out.println(result);
            assertFalse(result);
        }
        /*result = myValidator.isValidEmail(inValidEmail[0]);
        System.out.println(result);
        assertFalse(result);
        result = myValidator.isValidEmail(inValidEmail[1]);
        System.out.println(result);
        assertFalse(result);
        result = myValidator.isValidEmail(inValidEmail[2]);
        System.out.println(result);
        assertFalse(result);
        result = myValidator.isValidEmail(inValidEmail[3]);
        System.out.println(result);
        assertFalse(result);*/





    }




}