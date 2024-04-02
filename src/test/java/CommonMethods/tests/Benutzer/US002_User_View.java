package CommonMethods.tests.Benutzer;

import CommonMethods.pagefactory.POManager;
import CommonMethods.utils.Config;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US002_User_View extends POManager {

    @Test(description = "To test to verify user view Kompakt or Liste")

    public void TC_01_USerView_Kompakt_Liste(){

        getBenutzerPage()
                .openBrowser(Config.getProperty("url"));
        getBenutzerPage()
                .writeSearchText("Benutzer");
        getBenutzerPage()
                .clickBenutzerBtn();
        getBenutzerPage()
                .getUserListBtn();
        Assert.assertTrue(getBenutzerPage().getListeOptionMenu().isDisplayed());
        getBenutzerPage()
                .getClickKompakte();
        getBenutzerPage()
                .getList();
        getBenutzerPage()
                .getUserListBtn();
        Assert.assertTrue(getBenutzerPage().getListeOptionMenu().isDisplayed());

    }
}
