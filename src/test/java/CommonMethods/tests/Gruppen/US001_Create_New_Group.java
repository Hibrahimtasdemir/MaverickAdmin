package CommonMethods.tests.Gruppen;

import CommonMethods.pagefactory.POManager;
import CommonMethods.utils.Config;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US001_Create_New_Group extends POManager {

    @Test(description = "23055 Groups_Create New Group")
    public void TC001_Group_Create_New_Group(){


        getGruppenPage()
                .openBrowser(Config.getProperty("url"));
        getGruppenPage()
                .writeSearchText("Gruppen");
        getGruppenPage()
                .clickGruppenBtn();
        Assert.assertTrue(getGruppenPage().getBtnHinzufügen().isDisplayed());
        System.out.println("Button Hinzufügen was displayed");
        getGruppenPage()
                .clickHinzufügenBtn();
       Assert.assertTrue(getGruppenPage().getCreateGroupScreen().isDisplayed());
       Assert.assertFalse(getGruppenPage().getCreateGroupScreen().getAttribute("class").contains("is-disabled"));
       getGruppenPage()
               .enterGroupName("GroupTest");
       getGruppenPage()
               .gruppenMitgliederField("A365T_REGZ");
        Assert.assertTrue(getGruppenPage().getSelectedMitglieder().isDisplayed());
        getGruppenPage()
                .selectedMitglieder();
        getGruppenPage()
                .clickErstellenBtn();



    }
}
