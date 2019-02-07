
import static org.junit.Assert.*;

public class UserClassTest_attempt1 {

    @org.junit.Before
    public void setUp() throws Exception {
        System.out.println("---Before - SetUp executed");
    }


    @org.junit.After
    public void tearDown() throws Exception {
        System.out.println("---After- SetUp executed");
    }

    @org.junit.Test
    public void test_setA() {
        System.out.println("------test_setA");
    }

    @org.junit.Test
    public void test_setB() {
        System.out.println("------test_setB");
    }

    @org.junit.Test
    public void test_getUserId_Normal() {
        System.out.println("------test_getUserId_normal");
    }

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("--BeforeClass - setupClass");
        Thread.sleep(3000);
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("--AfterClass - tearDownClass");
        Thread.sleep(3000);
    }
}