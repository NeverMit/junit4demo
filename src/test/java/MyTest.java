import org.junit.*;

public class MyTest {
    @BeforeClass
    public static void beforeClass(){
        System.out.println("@BeforeClass : beforeClass()");
    }
    @Before
    public void before(){
        System.out.println("@Before : before()");
    }
    @Test
    public void test(){
        System.out.println("@Test : test()");
    }
    @Test
    public void test2(){
        System.out.println("@Test : test2()");
    }
    @After
    public void after(){
        System.out.println("@After : after()");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("@AfterClass : afterClass()");
    }
}
