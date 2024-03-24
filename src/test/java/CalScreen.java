import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalScreen {
    @FindBy (id = "com.google.android.calculator:id/op_add")
    WebElement btnPlus;
    @FindBy(id = "com.google.android.calculator:id/op_sub")
    WebElement btnSubtraction;
    @FindBy (id = "com.google.android.calculator:id/op_div")
    WebElement btnDiv;
    @FindBy(id = "com.google.android.calculator:id/op_mul")
    WebElement btnMultiple;
    @FindBy(id = "com.google.android.calculator:id/eq")
    WebElement btnEq;
    @FindBy (id = "com.google.android.calculator:id/result_final")
    WebElement textField;
    AndroidDriver driver;
    public CalScreen (AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    public String doSeries(int a,int b,int c,int d){
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+b)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+a)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+a)).click();
        btnDiv.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+b)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+a)).click();
        btnMultiple.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+c)).click();
        btnSubtraction.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+b)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+a)).click();
        btnPlus.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+d)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+a)).click();
        btnEq.click();
        return textField.getText();
    }
}
