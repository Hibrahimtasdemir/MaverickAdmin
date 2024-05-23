package CommonMethods.tests.Gruppen;

import CommonMethods.pagefactory.POManager;
import CommonMethods.utils.Config;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US007_Groups_Configure_Modules extends POManager {
    @Test
    @Description("23069 Group Configure Modules: Inherited modules")
    @Severity(SeverityLevel.CRITICAL)
    public void TC01_Group_Configure_Module(){

        getGruppenPage().openBrowser(Config.getProperty("url"));
        getGruppenPage().writeSearchText("Gruppen");
        getGruppenPage().clickGruppenBtn();
        getGruppenPage().clickFilterIcon();
        String searchString = "GroupT";
        for (char c :searchString.toCharArray()){
            getGruppenPage().keywordFilter(c);
        }
        getGruppenPage().clickFirstCheckBox();
        getGruppenPage().getEditButton();
        getGruppenPage().clickGroupPanelModule();
        Assert.assertTrue(getGruppenPage().getModuleConfigurationArea().isDisplayed());
        getGruppenPage().clickVerebteModuleEinstellung();
        getGruppenPage().clickSpeichernButton();
        getGruppenPage().getNotificationPanel();

    }
}
