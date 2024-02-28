package CommonMethods.tests.Funktionen;

import CommonMethods.pagefactory.POManager;
import CommonMethods.utils.Config;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US002_Menu_Create_New_Function extends POManager {

    @Test(description = "23048 Functions_Menu_Create new Function")
    public void TC001_Menu_New_Creation() {

        getFunctionPage()
                .openBrowser(Config.getProperty("url"));
        getFunctionPage()
                .writeSearchText("Funktionen");
        getFunctionPage()
                .clickFunctionBtn();

        Assert.assertTrue(getFunctionPage().getBtnHinzufugen().isEnabled());

        getFunctionPage()
                .clickHinzufugenBtn();

        Assert.assertTrue(
                getFunctionPage()
                        .getBtnCreateFunction().getAttribute("class").contains("is-disabled"));

        getFunctionPage()
                .selectOrganisation(getFunctionPage().getCbbOrg103());

        getFunctionPage()
                .selectRole(getFunctionPage().getCbbRoleLesen());

        Assert.assertTrue(getFunctionPage().getBtnCreateFunction().getAttribute("class").contains("is-disabled"));


    }
}
