import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GitDemo01ClassTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("Before - SetUp executed");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After - tearDown executed");
    }

    @Test
    public void test_alwayszero_normalCase() {
        GitDemo01Class myObject =new GitDemo01Class ();
        int result= myObject.alwayszero(10, 5);
        assertTrue(result==0);
    }

    @Test
    public void test_alwayszero_normalCase2() {
        GitDemo01Class myObject =new GitDemo01Class ();
        int result= myObject.alwayszero(99, 0);
        assertTrue(result==0);
    }

    @Test
    public void test_alwayszero_normalCase3() {
        GitDemo01Class myObject =new GitDemo01Class ();
        int result= myObject.alwayszero(33, 33);
        assertTrue(result==0);
    }

    @Test
    public void testAddNormalCase(){
        GitDemo01Class myObject = new GitDemo01Class();
        int result = myObject.add(1890, 4);
        assertTrue(result == 1894);
    }
}