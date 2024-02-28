package CommonMethods.tests.Benutzer;

import CommonMethods.pagefactory.POManager;
import CommonMethods.utils.Config;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US001_User_Fullscreen extends POManager {

    @Test(description = "Test to verify showing fullscreen of user page")
    public void TC001_User_FullScreen() {

        getBenutzerPage()
                .openBrowser(Config.getProperty("url"));
        getBenutzerPage()
                .writeSearchText("Benutzer");
        getBenutzerPage()
                .clickFunctionBtn();

        Assert.assertTrue(getBenutzerPage().getBlueRibbon().isDisplayed());
        Assert.assertTrue(getBenutzerPage().getSideBar().isDisplayed());

        getBenutzerPage()
                .user_Fullscreen_Button();
        Assert.assertFalse(getBenutzerPage().isSideBarDisplayed());
        //Assert.assertTrue(getBenutzerPage().getBlueRibbonControlElement().isDisplayed()); //TODO: js ile coz

        getBenutzerPage()
                .user_Fullscreen_Button();
        Assert.assertTrue(getBenutzerPage().getBlueRibbon().isDisplayed());
        Assert.assertTrue(getBenutzerPage().getSideBar().isDisplayed());


    }
}
