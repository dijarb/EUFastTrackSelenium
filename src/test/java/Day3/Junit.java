package Day3;

import org.junit.*;

public class Junit {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("At the beginning of the class");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("At the end of the class");
    }

    @Before
    public void before(){
        System.out.println("run before every test");
    }

    @After
    public void after(){
        System.out.println("run after every test");
    }

    @Test
    public void test1(){
        System.out.println("test 1");
    }

    @Test
    public void test2(){
        System.out.println("test 2");
    }

    @Ignore
    @Test
    public void test3(){
        System.out.println("test 3");
    }
}