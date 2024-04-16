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
        Assert.assertTrue(getFunctionPage().getBearbeitenUndLöschenDisplay().isDisplayed());
        getFunctionPage().getBtnEdit();
    }
}
