
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GitDemo01ClassTest {
    private GitDemo01Class myObject;

    @Before
    public void setUp() throws Exception {
        System.out.println("Before - SetUp executed");
        myObject = new GitDemo01Class();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After - tearDown executed");
    }

    @Test
    public void test_Tony() {
        GitDemo01Class myObject = new GitDemo01Class();
        System.out.println("Fantastiskt");
    }

    @Test
    public void test_alwayszero_normalCase() {
        int result= myObject.alwayszero(10, 5);
        assertTrue(result==0);
    }

    @Test
    public void test_alwayszero_normalCase2() {
        int result= myObject.alwayszero(99, 0);
        assertTrue(result==0);
    }
    @Test
    public void test_lady_hiccups(){
        GitDemo01Class diafragm =new GitDemo01Class ();
        int result= diafragm.alwayszero(42, 43);
        assertTrue(result==0);

    }

    @Test
    public void test_alwayszero_normalCase3() {
        int result= myObject.alwayszero(33, 33);
        assertTrue(result==0);
    }

    @Test
    public void shahzad() {
        GitDemo01Class myObject =new GitDemo01Class ();
        int result= myObject.alwayszero(33, 33);
        assertTrue(result==0);
    }
    @Test
    public void test_Daniel() {
        GitDemo01Class myObject =new GitDemo01Class ();
        int result= myObject.alwayszero(33, 33);
        assertTrue(result==0);
    }


