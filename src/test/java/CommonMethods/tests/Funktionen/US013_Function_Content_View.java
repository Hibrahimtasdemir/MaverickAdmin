package CommonMethods.tests.Funktionen;

import CommonMethods.pagefactory.POManager;
import CommonMethods.utils.Config;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US013_Function_Content_View extends POManager {

    @Test(description = "23303 Function_Content_View" )
    public void TC_001_Function_Content_View(){

        getFunctionPage().openBrowser(Config.getProperty("url"));
        getFunctionPage().writeSearchText("Funktionen");
        getFunctionPage().clickFunctionBtn();
        Assert.assertTrue(getFunctionPage().getFunctionPageContainer().isDisplayed());
        getFunctionPage().allFunctionsVisible();
        Assert.assertTrue(getFunctionPage().getFunctionHeaderWrapper().isDisplayed());
        Assert.assertTrue(getFunctionPage().getListTable().isDisplayed());
        getFunctionPage().selectCompactView();
        Assert.assertTrue(getFunctionPage().getCompactTable().isDisplayed());



    }
}
