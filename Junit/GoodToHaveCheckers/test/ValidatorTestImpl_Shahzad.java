import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorTestImpl_Shahzad extends ValidatorTest {

    @Test
    public void isValidEmail(String email)
    {
        email = "contribute@geeksforgeeks.org";
        if (isValidEmail(email))
            System.out.print("Yes");
        else
            System.out.print("No");
    }




}

