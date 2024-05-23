package CommonMethods.tests.Gruppen;

import CommonMethods.pagefactory.POManager;
import CommonMethods.utils.Config;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

public class US009_Groups_Menu_Upload extends POManager {
    @Test
    @Description("23336 Groups_Menu_Upload")
    @Severity(SeverityLevel.NORMAL)
    public void TC01_Groups_Menu_Upload(){
        getGruppenPage().openBrowser(Config.getProperty("url"));
        getGruppenPage().writeSearchText("Gruppen");
        getGruppenPage().clickGruppenBtn();
        getGruppenPage().clickGroupUpload();
        getGruppenPage().uploadFile("C:\\Users\\a365t_regz\\Documents\\Upload.xlsx");
    }
}
