package CommonMethods.pagefactory;

import CommonMethods.utils.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Annotations {
    public  static WebDriver driver;

    @BeforeMethod
    public void beforeMethod()
    {
        driver = Driver.getDriver();

    }

    @AfterMethod
    public void afterMethod()
    {
        Driver.closeDriver();
    }
}
