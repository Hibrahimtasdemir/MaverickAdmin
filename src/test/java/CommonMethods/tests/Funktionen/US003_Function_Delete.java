package CommonMethods.tests.Funktionen;

import CommonMethods.pagefactory.POManager;
import CommonMethods.utils.Config;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US003_Function_Delete extends POManager {

    @Test(description = "23052 Functions_Delete_Functions")
    public void TC001_Function_Delete(){

        getFunctionPage().openBrowser(Config.getProperty("url"));
        getFunctionPage().writeSearchText("Funktionen");
        getFunctionPage().clickFunctionBtn();
        Assert.assertTrue(getFunctionPage().getBtnLöschen().getAttribute("aria-disabled").contains("true"));
        getFunctionPage().functionCheckBoxClick();
        Assert.assertTrue(getFunctionPage().getBtnLöschen().isEnabled());
        getFunctionPage().buttonLöschenMainBar();
        getFunctionPage().confirmLöschenButton();

    }
}
