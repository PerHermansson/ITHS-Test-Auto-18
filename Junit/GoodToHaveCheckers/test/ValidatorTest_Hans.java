import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class ValidatorTest_Hans {
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
        result = myValidator.isValidEmail("Hej");
        assertFalse(result);

    }

    @Test
    public void test_isValidEmail_myEmail(){
        boolean result;
        Validator myValidator = new Validator();
        result = myValidator.isValidEmail("h.g.borjesson@gmail.com");
        assertTrue(result);
    }
    @Test
    public void test_isValidEmail_plusSign(){
        boolean result;
        Validator myValidator = new Validator();
        result = myValidator.isValidEmail("h.g+.borjesson+@gmail.com");
        assertTrue(result);
    }

    @Test
    public void test_isValidEmail_arrayBadValues(){
        boolean result;
        Validator myValidator = new Validator();
        String[] anArray = {"Abc.example.com", "A@b@c@example.com", "a\"b(c)d,e:f;g<h>i[j\\k]l@example.com"};
        for (int i =0; i<anArray.length; i++){
            result = myValidator.isValidEmail(anArray[i]);
            assertFalse(result);
            System.out.println(anArray[i]);

        }
    }
    


}