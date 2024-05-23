package CommonMethods.tests.Gruppen;

import CommonMethods.pagefactory.POManager;
import CommonMethods.utils.Config;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

public class US006_Groups_Menu_Download extends POManager {
    @Test
    @Description("23335 Groups_Menu_Download")
    @Severity(SeverityLevel.CRITICAL)
    public void TC01_Group_Menu_Download(){

        getGruppenPage().openBrowser(Config.getProperty("url"));
        getGruppenPage().writeSearchText("Gruppen");
        getGruppenPage().clickGruppenBtn();
        getGruppenPage().buttonGroupDownload();
        getGruppenPage().downloadNotificationMessage();
    }
}
