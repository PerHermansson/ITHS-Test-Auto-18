import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserClassTestPeter{
    UserClass uc = new UserClass();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void peterTest(){
        System.out.println("Heja heja friskt hurmör");
    }

    @Test
    public void testSetA(){
        uc.setA(94);
        String in = uc.getUserId();
        assertEquals("940", in);
    }

    @Test
    public void testSetB(){
        uc.setB(18);
        String in = uc.getUserId();
        assertEquals("018", in);
    }

    @Test
    public void setAandB(){
        uc.setA(18);
        uc.setB(94);
        String in = uc.getUserId();
        assertEquals("1894", in);
    }
}