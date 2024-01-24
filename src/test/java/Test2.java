import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Test2 {
    @Test
    public void test1(){
        System.out.println("Test2 test1()");
    }
    @Test
    @Ignore
    public void test2(){
        System.out.println("Test2 test2()");
    }
    @Test
    public void xTest(){
        System.out.println("Test2 xTest()");
    }
    @Test(timeout = 1)
    public void test3(){
        System.out.println("Test2 test3()");
    }
    @Test(expected = NullPointerException.class)
    public void testException(){
        throw new NullPointerException();
    }

}
