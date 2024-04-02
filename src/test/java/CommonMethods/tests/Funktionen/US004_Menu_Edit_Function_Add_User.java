package CommonMethods.tests.Funktionen;

import CommonMethods.pagefactory.POManager;
import CommonMethods.utils.Config;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US004_Menu_Edit_Function_Add_User extends POManager {

    @Test(description = "23049 Functions_Menu_Edit Function: Add User(s)")
    public void TC_001_Menu_Edit_Function_Add_User() {

        getFunctionPage().openBrowser(Config.getProperty("url"));;
        getFunctionPage().writeSearchText("Funktionen");
        getFunctionPage().clickFunctionBtn();
        getFunctionPage().functionCheckBoxClick();
        getFunctionPage().getBtnEdit();
        Assert.assertTrue(getFunctionPage().getFunctionEditPanel().isDisplayed());

        getFunctionPage().clickNeuZuweisung();
        Assert.assertTrue(getFunctionPage().getFunctionUserAddPanel().isDisplayed());

        getFunctionPage().selectBenutzer("123@123.de");
        getFunctionPage().setGultigkeitArea();
        String[] expectedValues = {"Unbeschränkt gültig", "Benutzerdefiniert", "Aktuelle Woche",
                "Aktueller Monat", "Nächste Woche", "Nächster Monat"};
        Assert.assertTrue(getFunctionPage().getListOfTimeAssignments(expectedValues), "One or more of the expected values are not available.");

        getFunctionPage().getUnbeschranktGultig();
        getFunctionPage().setGultigkeitArea();
        getFunctionPage().setBenutzerDefiniert();
        Assert.assertTrue(getFunctionPage().getDatePickerControl().isDisplayed());

        getFunctionPage().setGultigkeitArea();
        getFunctionPage().setAktuelleWoche();
        Assert.assertTrue(getFunctionPage().getButtonUbernehmen().isEnabled());
        Assert.assertTrue(getFunctionPage().getDatePickerControl().isDisplayed());

        getFunctionPage().setGultigkeitArea();
        getFunctionPage().setAktuellerMonat();
        Assert.assertTrue(getFunctionPage().getButtonUbernehmen().isEnabled());
        Assert.assertTrue(getFunctionPage().getDatePickerControl().isDisplayed());

        getFunctionPage().setGultigkeitArea();
        getFunctionPage().setNächsteWoche();
        Assert.assertTrue(getFunctionPage().getButtonUbernehmen().isEnabled());
        Assert.assertTrue(getFunctionPage().getDatePickerControl().isDisplayed());

        getFunctionPage().setGultigkeitArea();
        getFunctionPage().setNächsterMonat();
        Assert.assertTrue(getFunctionPage().getButtonUbernehmen().isEnabled());
        Assert.assertTrue(getFunctionPage().getDatePickerControl().isDisplayed());

        getFunctionPage().setGultigkeitArea();
        getFunctionPage().setBenutzerDefiniert();
        getFunctionPage().getChooseEndDatum("31.12.2024");
        getFunctionPage().clickUbernehmenButton();
        Assert.assertTrue(getFunctionPage().getFunctionUserAddPanel().isDisplayed());

        getFunctionPage().clickSpeichernButton();
        Assert.assertTrue(getFunctionPage().getNotificationPanel().isDisplayed());

        getFunctionPage().getBtnEdit();
        Assert.assertTrue(getFunctionPage().getNewCreatedAssignment().isDisplayed());

    }
}
