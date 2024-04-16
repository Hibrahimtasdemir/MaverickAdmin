package CommonMethods.tests.Funktionen;

import CommonMethods.pagefactory.POManager;
import CommonMethods.utils.Config;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US011_Function_Content_Role_Filter extends POManager {

    @Test(description = "23299 Function_Content_Role_Filter" )
    public void TC_001_Function_Content_Organizational_Filter(){

        getFunctionPage().openBrowser(Config.getProperty("url"));;
        getFunctionPage().writeSearchText("Funktionen");
        getFunctionPage().clickFunctionBtn();
        getFunctionPage().setFilterIcon();
        getFunctionPage().clickRolleFiltern();
        getFunctionPage().clickCheckBoxRolle();
        Assert.assertTrue(getFunctionPage().getContentWrapper().isDisplayed(),  "Content wrapper for roles should be displayed");
    }
}
