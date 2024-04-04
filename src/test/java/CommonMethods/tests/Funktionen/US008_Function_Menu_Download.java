package CommonMethods.tests.Funktionen;

import CommonMethods.pagefactory.POManager;
import CommonMethods.utils.Config;
import CommonMethods.utils.OutUtils;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static CommonMethods.utils.Driver.getDriver;

public class US008_Function_Menu_Download extends POManager {

    @Test(description = "23292 Functions_Menu_Download")
    public void TC001_Menu_Download(){

        getFunctionPage().openBrowser(Config.getProperty("url"));
        getFunctionPage().writeSearchText("Funktionen");
        getFunctionPage().clickFunctionBtn();
        Assert.assertTrue(getFunctionPage().getMainMenuBar().isDisplayed());
        getFunctionPage().functionCheckBoxClick();
        Assert.assertTrue(getFunctionPage().setBtnHerunterladen().isEnabled());
        getFunctionPage().setBtnHerunterladen();



    }
}
