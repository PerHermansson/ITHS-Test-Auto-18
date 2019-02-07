import org.junit.Test;

import static org.junit.Assert.*;

public class UserClassTestAttempt3 {

    @Test
    public void getUserId() {
        UserClass myObject =new UserClass();
        myObject.setA(3);
        myObject.setB(5);
        String result= myObject.getUserId();
        assertEquals(result,"35");

    }
}