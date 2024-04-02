package CommonMethods.tests.Funktionen;

import CommonMethods.pagefactory.POManager;
import CommonMethods.utils.Config;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_006_Function_Breadcrumb extends POManager {

    @Test(description = "23296 Functions_Breadcrumb_Navigation")
    public void TC001_Breadcrumb_Navigation(){

        getFunctionPage().openBrowser(Config.getProperty("url"));;
        getFunctionPage().writeSearchText("Funktionen");
        getFunctionPage().clickFunctionBtn();
        getFunctionPage().setBreadcrumbIcon();
        String actualStruktur = getFunctionPage().getListOfOrganizationStruktur();
        String[] expectedStruktur = {"Benutzer", "Funktionen", "Rollen", "Gruppen", "Organisationseinheiten", "Synchronisierung"};
        for (String expected : expectedStruktur) {
            Assert.assertTrue(actualStruktur.contains(expected), "Breadcrumb value " + expected + "' is missing in the list.");
        }
        getFunctionPage().getClickBreadcrumb();
    }
}
