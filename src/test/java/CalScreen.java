import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalScreen {
    AndroidDriver driver;
    public CalScreen (AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    public String calculateSeries(String series) {
        for (int i = 0; i < series.length(); i++) {
            char ch = series.charAt(i);
            if (ch == '+') {
                driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
            } else if (ch == '-') {
                driver.findElement(By.id("com.google.android.calculator:id/op_sub")).click();
            } else if (ch == '*') {
                driver.findElement(By.id("com.google.android.calculator:id/op_mul")).click();
            } else if (ch == '/') {
                driver.findElement(By.id("com.google.android.calculator:id/op_div")).click();
            } else if (Character.isDigit(ch)) {
                driver.findElement(By.id("com.google.android.calculator:id/digit_" + ch)).click();
            }
        }
        driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
        return driver.findElement(By.id("com.google.android.calculator:id/result_final")).getText();

    }
}

