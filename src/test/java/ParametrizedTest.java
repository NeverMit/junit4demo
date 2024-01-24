import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class ParametrizedTest {
    private final int v1;
    private final int v2;
    private final int v3;

    public ParametrizedTest(int v1, int v2, int v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    @Parameterized.Parameters
    public static Iterable<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {1,1,2},
                {2,2,4},
                {2,3,4}
        });
    }
    @Test
    public void test(){
        Calculator c =new Calculator();
        Assert.assertSame(v3,c.sum(v1,v2));
    }
}
