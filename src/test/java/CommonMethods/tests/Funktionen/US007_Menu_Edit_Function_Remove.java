package CommonMethods.tests.Funktionen;

import CommonMethods.pagefactory.POManager;
import CommonMethods.utils.Config;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US007_Menu_Edit_Function_Remove extends POManager {

    @Severity(SeverityLevel.CRITICAL)
    @Description("Test for removing a user from the function")
    @Test(description = "23051 Functions_Menu_Edit Function: Remove User(s)")
    public void TC01_Edit_Function_Remove_User(){

        getFunctionPage().openBrowser(Config.getProperty("url"));
        getFunctionPage().writeSearchText("Funktionen");
        getFunctionPage().clickFunctionBtn();

        getFunctionPage().setFunctionCheckBoxForRemove();
        getFunctionPage().getBtnEdit();
        getFunctionPage().getMemberAndUpdate();
        getFunctionPage().btnsecondLoschen();

        getFunctionPage().clickSpeichernButton();
        Assert.assertTrue(getFunctionPage().getNotificationPanel().isDisplayed());

        getFunctionPage().getBtnEdit();
        getFunctionPage().getMemberAndUpdate();

        getFunctionPage().clickNeuZuweisung();
        getFunctionPage().selectBenutzer("123@123.de");
        getFunctionPage().setGultigkeitArea();
        getFunctionPage().setAktuellerMonat();
        getFunctionPage().clickUbernehmenButton();
        getFunctionPage().clickSpeichernButton();


    }
}
