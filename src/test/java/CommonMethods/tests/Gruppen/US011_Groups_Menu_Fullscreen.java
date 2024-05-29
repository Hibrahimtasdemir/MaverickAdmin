package CommonMethods.tests.Gruppen;

import CommonMethods.pagefactory.POManager;
import CommonMethods.utils.Config;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US011_Groups_Menu_Fullscreen extends POManager {
    @Test
    @Description("23339 Groups_Menu_Fullscreen")
    @Severity(SeverityLevel.NORMAL)
    public void TC01_Groups_Menu_Fullscreen(){

        getGruppenPage().openBrowser(Config.getProperty("url"));
        getGruppenPage().writeSearchText("Gruppen");
        getGruppenPage().clickGruppenBtn();
        Assert.assertTrue(getGruppenPage().getBlueRibbon().isDisplayed());
        Assert.assertTrue(getGruppenPage().getSideBar().isDisplayed());
        getGruppenPage().group_Fullscreen_Button();
        Assert.assertFalse(getGruppenPage().isSideBarDisplayed());
        getGruppenPage().group_Fullscreen_Button();
        Assert.assertTrue(getGruppenPage().getBlueRibbon().isDisplayed());
        Assert.assertTrue(getGruppenPage().getSideBar().isDisplayed());
    }
}
