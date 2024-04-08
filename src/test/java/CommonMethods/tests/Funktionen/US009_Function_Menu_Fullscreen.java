package CommonMethods.tests.Funktionen;

import CommonMethods.pagefactory.POManager;
import CommonMethods.utils.Config;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US009_Function_Menu_Fullscreen extends POManager {

    @Test(description = "23294 Functions_Menu_Fullscreen)")
    public void TC_Function_Menu_Fullscreen(){

        getFunctionPage().openBrowser(Config.getProperty("url"));
        getFunctionPage().writeSearchText("Funktionen");
        getFunctionPage().clickFunctionBtn();
        Assert.assertTrue(getFunctionPage().getBlueRibbon().isDisplayed());
        Assert.assertTrue(getFunctionPage().getSideBar().isDisplayed());
        getFunctionPage().function_Fullscreen_Button();
        Assert.assertFalse(getBenutzerPage().isSideBarDisplayed());
        getFunctionPage().function_Fullscreen_Button();
        Assert.assertTrue(getFunctionPage().getBlueRibbon().isDisplayed());
        Assert.assertTrue(getFunctionPage().getSideBar().isDisplayed());

    }
}
