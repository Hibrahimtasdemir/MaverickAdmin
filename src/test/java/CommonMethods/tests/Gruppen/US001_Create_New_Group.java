package CommonMethods.tests.Gruppen;

import CommonMethods.pagefactory.POManager;
import CommonMethods.utils.Config;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class US001_Create_New_Group extends POManager {

    @Test
    @Description("23055 Groups_Create New Group")
    @Severity(SeverityLevel.CRITICAL)
    public void TC001_Groups_Create_New_Group(){

        getGruppenPage().openBrowser(Config.getProperty("url"));
        getGruppenPage().writeSearchText("Gruppen");
        getGruppenPage().clickGruppenBtn();
        Assert.assertTrue(getGruppenPage().getBtnHinzufügen().isDisplayed());
        System.out.println("Button Hinzufügen was displayed");
        getGruppenPage().clickHinzufügenBtn();
        Assert.assertTrue(getGruppenPage().getGroupCreateScreen().isDisplayed());
        Assert.assertTrue(getGruppenPage().getCreateButtonDisabled().getAttribute("class").contains("is-disabled"));
       // String groupName = "GroupTest" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        String groupName = "GroupTest11" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        getGruppenPage().enterGroupName(groupName);
        getGruppenPage().gruppenMitgliederField("A365T_REGZ");
        Assert.assertTrue(getGruppenPage().getSelectedMitglieder().isDisplayed());
        getGruppenPage().selectedMitglieder();
        getGruppenPage().clickCreateButton();
        getGruppenPage().getNotificationPanel();




    }
}
