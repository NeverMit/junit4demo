import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
@RunWith(DataProviderRunner.class)
public class DataProviderTest {
    @DataProvider
    public static Object[][] data(){
        return new Object[][]{
                {1,1,2},
                {2,2,4},
                {2,3,4}
        };
    }
    @Test
    @UseDataProvider("data")
    public void test(int v1,int v2,int v3){
        Calculator c =new Calculator();
        Assert.assertSame(v3,c.sum(v1,v2));
    }
}
