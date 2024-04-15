import org.testng.Assert;
import org.testng.annotations.Test;

public class CalTestRunner extends Setup{
    @Test(priority = 1,description = "do addition")
    public void doSeries(){
        CalScreen calScreen =new CalScreen(driver);
        int actualResult = Integer.parseInt(calScreen.calculateSeries("50+10-20*2+10/2"));
        int expectedResult = 25;
        Assert.assertEquals(actualResult,expectedResult);
    }
}
