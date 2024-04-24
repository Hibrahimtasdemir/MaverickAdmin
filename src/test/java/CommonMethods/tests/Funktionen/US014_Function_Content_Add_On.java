package CommonMethods.tests.Funktionen;

import CommonMethods.pagefactory.POManager;
import CommonMethods.utils.Config;
import org.testng.annotations.Test;

public class US014_Function_Content_Add_On extends POManager {

    @Test(description = "23301 Function_Content_Add_On" )
    public void TC_001_Function_Content_Add_On(){

        getFunctionPage().openBrowser(Config.getProperty("url"));;
        getFunctionPage().writeSearchText("Funktionen");
        getFunctionPage().clickFunctionBtn();
        getFunctionPage().clickHinzugefugtAmSortieren();
        getFunctionPage().clickAbsteigenSortieren();
        getFunctionPage().clickHinzugefugtAmSortieren();
        getFunctionPage().clickAufsteigenSortieren();
    }
}
