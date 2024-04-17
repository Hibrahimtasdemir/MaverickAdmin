package CommonMethods.tests.Funktionen;

import CommonMethods.pagefactory.POManager;
import CommonMethods.utils.Config;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US012_Function_Content_Drop_Down_List extends POManager {

    @Test(description = "23323 Function_Content_Drop_Down_List" )
    public void TC01_Function_Content_Drop_Down_List(){

        getFunctionPage().openBrowser(Config.getProperty("url"));;
        getFunctionPage().writeSearchText("Funktionen");
        getFunctionPage().clickFunctionBtn();
        getFunctionPage().setFunctionCheckBoxForDropdown();
        getFunctionPage().setFunctionDropdown();
        Assert.assertTrue(getFunctionPage().getBearbeitenUndLoschenDisplay().isDisplayed());
        getFunctionPage().getBtnEdit();
        Assert.assertTrue(getFunctionPage().getFunctionEditPanel().isDisplayed());
        getFunctionPage().clickNeuZuweisung();
        getFunctionPage().selectBenutzer("123@123.de");
        getFunctionPage().setGultigkeitArea();
        getFunctionPage().setAktuelleWoche();
        Assert.assertTrue(getFunctionPage().getButtonUbernehmen().isEnabled());
        Assert.assertTrue(getFunctionPage().getDatePickerControl().isDisplayed());
        getFunctionPage().clickUbernehmenButton();
       // getFunctionPage().setClickAbbrechen();
        getFunctionPage().btnsecondLoschen();
        getFunctionPage().clickSpeichernButton();

    }
}
