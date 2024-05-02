package CommonMethods.tests.Gruppen;

import CommonMethods.pagefactory.POManager;
import CommonMethods.utils.Config;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US003_Group_Edit_Group_Add_Users extends POManager {
    @Test
    @Description("23056 Groups_Edit_Group_Add_Users")
    @Severity(SeverityLevel.CRITICAL)
    public void TC01_Group_Edit_Add_User(){
        getGruppenPage().openBrowser(Config.getProperty("url"));
        getGruppenPage().writeSearchText("Gruppen");
        getGruppenPage().clickGruppenBtn();
        getGruppenPage().clickFilterIcon();
        getGruppenPage().stichwortFilternField("G");
        getGruppenPage().stichwortFilternField("r");
        getGruppenPage().stichwortFilternField("o");
        getGruppenPage().stichwortFilternField("u");
        getGruppenPage().stichwortFilternField("p");
        getGruppenPage().stichwortFilternField("T");
        getGruppenPage().clickFirstCheckBox();
        getGruppenPage().getEditButton();
        Assert.assertTrue(getGruppenPage().getGroupPanelNavigation().isDisplayed());
        getGruppenPage().clickGroupPanelBenutzer();
        getGruppenPage().clickGroupBenutzerNeuZuweisung();
        Assert.assertTrue(getGruppenPage().getBenutzerHinzufügenDisplay().isDisplayed());
        getGruppenPage().selectBenutzer("123@123.de");
        getGruppenPage().setGultigkeitArea();
        String[] expectedValues = {"Unbeschränkt gültig", "Benutzerdefiniert", "Aktuelle Woche",
                "Aktueller Monat", "Nächste Woche", "Nächster Monat"};
        Assert.assertTrue(getFunctionPage().getListOfTimeAssignments(expectedValues), "One or more of the expected values are not available.");
        getGruppenPage().getUnbeschranktGultig();
        getGruppenPage().setGultigkeitArea();
        getFunctionPage().setBenutzerDefiniert();
        Assert.assertTrue(getGruppenPage().getDatePickerControl().isDisplayed());

        getGruppenPage().setGultigkeitArea();
        getGruppenPage().setAktuelleWoche();
        Assert.assertTrue(getGruppenPage().getButtonUbernehmen().isEnabled());
        Assert.assertTrue(getGruppenPage().getDatePickerControl().isDisplayed());

        getGruppenPage().setGultigkeitArea();
        getGruppenPage().setAktuellerMonat();
        Assert.assertTrue(getGruppenPage().getButtonUbernehmen().isEnabled());
        Assert.assertTrue(getGruppenPage().getDatePickerControl().isDisplayed());

        getGruppenPage().setGultigkeitArea();
        getGruppenPage().setNächsteWoche();
        Assert.assertTrue(getGruppenPage().getButtonUbernehmen().isEnabled());
        Assert.assertTrue(getGruppenPage().getDatePickerControl().isDisplayed());

        getGruppenPage().setGultigkeitArea();
        getGruppenPage().setNächsterMonat();
        Assert.assertTrue(getGruppenPage().getButtonUbernehmen().isEnabled());
        Assert.assertTrue(getGruppenPage().getDatePickerControl().isDisplayed());

        getGruppenPage().setGultigkeitArea();
        getGruppenPage().setBenutzerDefiniert();
        getGruppenPage().getChooseEndDatum("31.12.2024");
        getGruppenPage().clickUbernehmenButton();
        Assert.assertTrue(getGruppenPage().getGroupUserAddPanel().isDisplayed());

        getGruppenPage().clickSpeichernButton();
        Assert.assertTrue(getGruppenPage().getNotificationPanel().isDisplayed());


    }
}
