package CommonMethods.pages;

import CommonMethods.pagefactory.Base;
import CommonMethods.utils.BrowserUtils;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static CommonMethods.pagefactory.Annotations.driver;

public class BenutzerPage extends Base {
    @FindBy(css = "#SearchBox17")
    private WebElement txtSearchbox;
    @FindBy(css = ".highlighted.highlighted-211")
    private WebElement btnBenutzer;
    @FindBy(xpath = "//button[@aria-label='Vollbildschirm']")
    private WebElement btnFullScreen;
    @FindBy(css = "#commandBarContainer")
    private WebElement mainMenuBar;
    @FindBy(xpath = "//div[@data-focuszone-id='FocusZone2']")
    private WebElement blueRibbon;
    @FindBy(css = "#contentContainer")
    private WebElement sideBar;
    @FindBy(xpath = "//div[contains(@class,'headerInvisible')]")
    private WebElement blueRibbonControlElement;
    @FindBy(css = ".navbarContent")
    private List<WebElement> sideBarControlElement;
    @FindBy(css = ".ms-BaseButton-menuhost")
    private WebElement listeOptionMenu;
    @FindBy(xpath = "(//button[@role='menuitem'])[2]")
    private WebElement userListBtn;
    @FindBy(xpath = "(//button[@role='menuitemcheckbox'])[2]")
    private WebElement clickKompakte;
    @FindBy(css = ".ms-List-cell")
    private List<WebElement> list;
    public List<WebElement> getList() {
        BrowserUtils.takeScreenshot("Kompakte");
        System.out.println("Print the elements" + list.size());
        return list;
    }
    public void openBrowser(String url) {
        driver.get(url);
        BrowserUtils.waitFor(4);
    }
    public WebElement getBlueRibbonControlElement() {
//        BrowserUtils.waitForVisibility(blueRibbonControlElement,10);
        BrowserUtils.waitFor(5);
        return blueRibbonControlElement;
    }
    public boolean isSideBarDisplayed() {
//        BrowserUtils.waitForVisibility(sideBarControlElement,10);
        BrowserUtils.waitFor(2);
        if (sideBarControlElement.size() == 0) // bu element yoktur
        {
            return false;
        } else {
            return true;
        }
    }

    public void writeSearchText(String searchText) {
        txtSearchbox.click();
        txtSearchbox.sendKeys(searchText);
    }

    public void clickBenutzerBtn() {
        BrowserUtils.waitFor(2);
        if (btnBenutzer.isEnabled()) {
            btnBenutzer.click();
            BrowserUtils.waitForVisibility(mainMenuBar, 10);
        }
    }
    public WebElement getBlueRibbon() {
        BrowserUtils.waitFor( 3);
        return blueRibbon;
    }
    public WebElement getSideBar() {
        BrowserUtils.waitForVisibility(sideBar, 3);
        return sideBar;
    }
/*
    To click on the list of the right side of the blue ribbon on the top.
 */
    public WebElement getListeOptionMenu() {
        BrowserUtils.waitFor( 5);
        return listeOptionMenu;
    }
    public WebElement getClickKompakte() {
        BrowserUtils.waitForVisibility(clickKompakte, 4);
        clickKompakte.click();
        return clickKompakte;
    }

    public WebElement getUserListBtn() {
        BrowserUtils.waitFor( 4);
        userListBtn.click();
        return userListBtn;
    }

    /**
     * User click Fullscreen button
     */
    @Step("User clicks Full Screen Button")
    public void user_Fullscreen_Button() {
        BrowserUtils.waitFor(2);
        btnFullScreen.click();
    }


}

