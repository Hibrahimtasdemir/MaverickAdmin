package CommonMethods.tests.Gruppen;

import CommonMethods.pagefactory.POManager;
import CommonMethods.utils.Config;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

public class US005_Groups_Edit_Group_Add_Group extends POManager {
    @Test
    @Description("23062 Groups_Edit_Group_Add_Group")
    @Severity(SeverityLevel.CRITICAL)
    public void TC01_Group_Edit_Group_Add_Group(){

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
        getGruppenPage().clickGroupPanelGruppen();
        getGruppenPage().clickGroupNeuZuweisung();
        getGruppenPage().getGroupUserAddPanel();
        getGruppenPage().selectGroup("120 Lesen");

    }
}
