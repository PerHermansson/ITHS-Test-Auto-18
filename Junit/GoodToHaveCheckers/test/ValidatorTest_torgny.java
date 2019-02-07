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

    @Before
    public void setUp() {
        validator = new Validator();
    }

    @Parameterized.Parameters
    public static Collection getParameters() {
        ArrayList<Object[]> arrayList = new ArrayList<>();
        arrayList.add(new Object[] {"simple@example.com", true});
        arrayList.add(new Object[] {"Abc.example.com", false});
        return arrayList;
    }

    @Test
    public void verifyEmail() {
        boolean result = validator.isValidEmail(address);

        assertEquals(expected, result);
    }
}