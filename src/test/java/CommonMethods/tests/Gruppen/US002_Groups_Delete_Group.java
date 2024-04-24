package CommonMethods.tests.Gruppen;

import CommonMethods.pagefactory.POManager;
import CommonMethods.utils.Config;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US002_Groups_Delete_Group extends POManager {

    @Test
    @Description  ("23055 Groups_Create New Group")
    @Severity(SeverityLevel.CRITICAL)
    public void TC001_Groups_Delete_Group(){
        getGruppenPage().openBrowser(Config.getProperty("url"));
        getGruppenPage().writeSearchText("Gruppen");
        getGruppenPage().clickGruppenBtn();
        Assert.assertTrue(getGruppenPage().getBtnLoschen().getAttribute("aria-disabled").contains("true"));
        getGruppenPage().clickFilterIcon();
        getGruppenPage().StichwortFilternField("G");
        getGruppenPage().StichwortFilternField("r");
        getGruppenPage().StichwortFilternField("o");
        getGruppenPage().StichwortFilternField("u");
        getGruppenPage().StichwortFilternField("p");
        getGruppenPage().StichwortFilternField("T");
        getGruppenPage().clickFirstCheckBox();
        Assert.assertTrue(getGruppenPage().getBtnLoschen().isEnabled());
       // getGruppenPage().selectAndClickGroupName("GroupTest");
        getGruppenPage().clickLöschenButtonMainBar();
        Assert.assertTrue(getGruppenPage().getButtonLöschenEnabled().isEnabled());
        Assert.assertTrue(getGruppenPage().getButtonAbbrechenEnabled().isEnabled());
        getGruppenPage().clickLöschenButton();
        Assert.assertTrue(getFunctionPage().getNotificationPanel().isDisplayed());

    }
}
