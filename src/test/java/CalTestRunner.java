import org.testng.Assert;
import org.testng.annotations.Test;

public class CalTestRunner extends Setup{
    @Test(priority = 1,description = "do addition")
    public void doSeries(){
        CalScreen calScreen =new CalScreen(driver);
        String value = calScreen.doSeries(0,1,5,6);
        System.out.println(value);
        Assert.assertEquals(value,"100");
    }
}
