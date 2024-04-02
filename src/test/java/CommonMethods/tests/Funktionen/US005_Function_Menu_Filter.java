package CommonMethods.tests.Funktionen;

import CommonMethods.pagefactory.POManager;
import CommonMethods.utils.Config;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US005_Function_Menu_Filter extends POManager {
    @Test(description = "23292 Functions_Menu_Filter")
    public void TC001_Menu_Filter(){
        getFunctionPage().openBrowser(Config.getProperty("url"));;
        getFunctionPage().writeSearchText("Funktionen");
        getFunctionPage().clickFunctionBtn();
        getFunctionPage().setFilterIcon();
        getFunctionPage().setStichwortFilternField("U");
        Assert.assertTrue(getFunctionPage().filteredList().isDisplayed());

    }
}
