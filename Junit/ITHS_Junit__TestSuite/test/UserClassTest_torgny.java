import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserClassTest_torgny {
    private UserClass userClass;

    @Before
    public void setUp() {
        userClass = new UserClass();
    }

    @Test
    public void setA() {
        userClass.setA(42);

        String r = userClass.getUserId();

        assertEquals("423", r);
    }

    @Test
    public void setB() {
    }

    @Test
    public void getUserId() {
        String r = userClass.getUserId();

        assertEquals("03", r);
    }
}