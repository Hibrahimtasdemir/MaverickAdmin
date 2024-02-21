package CommonMethods.tests;

import CommonMethods.pagefactory.POManager;
import CommonMethods.utils.Config;
import CommonMethods.utils.BrowserUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewFunction extends POManager {



    @Test(description = "Test to verify showing functions")
    public void TC001_Functions_Show_Functions() {

        getHomePage()
                .openBrowser(Config.getProperty("url"));
        getHomePage()
                .writeSearchText("Funktionen");
        getHomePage()
                .clickFunctionBtn();
        Assert.assertTrue(getHomePage().getListTable().isDisplayed());
        getHomePage()
                .selectCompactView();
        Assert.assertTrue(getHomePage().getCompactTable().isDisplayed());








//
//        driver.findElement(By.cssSelector("#SearchBox17")).sendKeys("Funktionen");
//        driver.findElement(By.cssSelector(".highlighted.highlighted-211")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("(//div[@class='ms-TooltipHost root-288'])[8]")).click();
//
//        driver.findElement(By.xpath("(//button[@title='Bearbeiten'])[2]")).click();
//
//        driver.findElement(By.xpath("(//button[@type='button'])[24]")).click();


    }

}
