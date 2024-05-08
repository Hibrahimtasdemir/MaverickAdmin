package CommonMethods.tests.Gruppen;

import CommonMethods.pagefactory.POManager;
import CommonMethods.utils.Config;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

public class US004_Groups_Edit_Group_Remove_Assignment extends POManager {
    @Test
    @Description("23058 Groups_Edit_Group_Remove_Assignment")
    @Severity(SeverityLevel.CRITICAL)
    public void TC01_Group_Edit_Group_Remove_Assignment(){

        getGruppenPage().openBrowser(Config.getProperty("url"));
        getGruppenPage().writeSearchText("Gruppen");
        getGruppenPage().clickGruppenBtn();
        getGruppenPage().clickFilterIcon();
        getGruppenPage().stichwortFilternField("G");
        getGruppenPage().stichwortFilternField("r");
        getGruppenPage().stichwortFilternField("o");
        getGruppenPage().stichwortFilternField("u");
        getGruppenPage().stichwortFilternField("p");
        getGruppenPage().stichwortFilternField("T");
        getGruppenPage().clickFirstCheckBox();
        getGruppenPage().getEditButton();
        getGruppenPage().clickGroupPanelBenutzer();
        getGruppenPage().getAssignmentList();
        getGruppenPage().buttonLöschenAssignment();
        getGruppenPage().getAssignmentList();
        getGruppenPage().clickSpeichernButton();
        getGruppenPage().getNotificationPanel();
    }
}
