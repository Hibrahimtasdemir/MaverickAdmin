package CommonMethods.tests.Funktionen;

import CommonMethods.pagefactory.POManager;
import CommonMethods.utils.Config;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US010_Function_Content_Organinizational_Filter extends POManager {

    @Test(description = "23299 Function_Content Organizational_Filter" )
        public void TC_001_Function_Content_Organizational_Filter(){

        getFunctionPage().openBrowser(Config.getProperty("url"));
        getFunctionPage().writeSearchText("Funktionen");
        getFunctionPage().clickFunctionBtn();
        getFunctionPage().setFilterIcon();
        getFunctionPage().clickOrganizationEinheitFiltern();
        getFunctionPage().clickCheckBoxOrganizationEinheit();
        Assert.assertTrue(getFunctionPage().getContentWrapper().isDisplayed(),  "Content wrapper for organizational units should be displayed");
    }


}
