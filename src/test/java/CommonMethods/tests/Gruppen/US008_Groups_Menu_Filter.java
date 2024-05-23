package CommonMethods.tests.Gruppen;

import CommonMethods.pagefactory.POManager;
import CommonMethods.utils.Config;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class US008_Groups_Menu_Filter extends POManager {
    @Test
    @Description("23337 Groups_Menu_Filter")
    @Severity(SeverityLevel.NORMAL)
    public void TC01_Groups_Menu_Filter(){
        getGruppenPage().openBrowser(Config.getProperty("url"));
        getGruppenPage().writeSearchText("Gruppen");
        getGruppenPage().clickGruppenBtn();
        getGruppenPage().clickFilterIcon();
        String searchString = "GroupT";
        for (char c :searchString.toCharArray()){
            getGruppenPage().keywordFilter(c);
        }
        List<WebElement> filteredNames = getGruppenPage().searchPartialName("GroupT");
        for (WebElement name : filteredNames) {
            System.out.println(name.getText());
        }


    }
}
