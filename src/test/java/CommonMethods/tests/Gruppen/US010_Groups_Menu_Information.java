package CommonMethods.tests.Gruppen;

import CommonMethods.pagefactory.POManager;
import CommonMethods.utils.Config;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US010_Groups_Menu_Information extends POManager {
    @Test
    @Description("23338 Groups_Menu_Information")
    @Severity(SeverityLevel.NORMAL)
    public void TC01_Groups_Menu_Information(){
        getGruppenPage().openBrowser(Config.getProperty("url"));
        getGruppenPage().writeSearchText("Gruppen");
        getGruppenPage().clickGruppenBtn();
        getGruppenPage().clickFilterIcon();
        String searchString = "GroupT";
        for (char c :searchString.toCharArray()){
            getGruppenPage().keywordFilter(c);
        }
        getGruppenPage().clickFirstCheckBox();
        getGruppenPage().getEditButton();
        getGruppenPage().clickInfoButton();
        Assert.assertTrue(getGruppenPage().getGroupInfoPanel().isDisplayed());

    }
}
