package CommonMethods.tests.Funktionen;

import CommonMethods.pagefactory.POManager;
import CommonMethods.utils.Config;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US001_Show_Functions extends POManager {


    /**
     * 23047 Functions_Show Functions
     * Open browser the url
     * Search text in text box
     * Click function button
     * Verify list table whether displayed or not
     * Click "Kompakt" icon on the right side of the command bar
     * Verify list table whether displayed or not

     * 1-Click the "Liste" icon on the right side of the command bar
     * 2-Select "Kompakt" from the options menu
     * 3-Click the   icon again and select "Liste" from the options menu
     */
    @Test(description = "Test to verify showing functions")
    public void TC001_Functions_Show_Functions() {

        getFunctionPage()
                .openBrowser(Config.getProperty("url"));
        getFunctionPage()
                .writeSearchText("Funktionen");
        getFunctionPage()
                .clickFunctionBtn();
        Assert.assertTrue(getFunctionPage().getListTable().isDisplayed());

        getFunctionPage()
                .selectCompactView();
        Assert.assertTrue(getFunctionPage().getCompactTable().isDisplayed());



    }

}
