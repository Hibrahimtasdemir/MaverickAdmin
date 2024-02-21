package CommonMethods.pages;

import CommonMethods.pagefactory.Base;
import CommonMethods.utils.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static CommonMethods.pagefactory.Annotations.driver;

public class FunctionPage extends Base {

    @FindBy(css = "#SearchBox17")
    private WebElement txtSearchbox;

    @FindBy(css = ".highlighted.highlighted-211")
    private WebElement btnFunction;

    @FindBy(xpath = "(//div[@class='ms-TooltipHost root-288'])[8]")
    private WebElement txtEdit;

    @FindBy(xpath = "(//button[@title='Bearbeiten'])[2]")
    private WebElement btnEdit;

    @FindBy(xpath = "(//button[@type='button'])[24]")
    private WebElement btnUser;

    @FindBy(css = "#commandBarContainer")
    private WebElement mainMenuBar;

    @FindBy(xpath = "//*[text()='Liste']")
    private WebElement listMenu;

    @FindBy(css = "ul.ms-ContextualMenu-list")
    private WebElement listPanel;

    @FindBy(xpath = "//li[@role='presentation'][1]")
    private WebElement listView;

    @FindBy(xpath = "//li[@role='presentation'][2]")
    private WebElement compactView;

    @FindBy(css = "div.ms-DetailsList")
    private WebElement listTable;

    @FindBy(css = "div.ms-DetailsList.ms-DetailsList--Compact")
    private WebElement compactTable;

    public WebElement getListTable() { return listTable; }

    public WebElement getCompactTable() {
        return compactTable;
    }

    public void selectListView() {
        listMenu.click();
        BrowserUtils.waitForVisibility(listPanel, 2);

        if (listView.isEnabled()) {
            listView.click();
            BrowserUtils.waitForVisibility(listTable, 7);
        }

    }

    public void openBrowser(String url) {
        driver.get(url);
        BrowserUtils.waitFor(4);
    }

    public void selectCompactView() {

        // BrowserUtils.clickWithJS(listMenu);
        controlledClick(listMenu,listPanel);
        BrowserUtils.waitForVisibility(listPanel, 2);

        BrowserUtils.waitForVisibility(listPanel, 7);
        if (compactView.isEnabled()) {
            compactView.click();
            BrowserUtils.waitForVisibility(compactTable, 7);
        }

    }

    public void controlledClick(WebElement element, WebElement control)
    {
        try
        {
            BrowserUtils.waitForClickability(element,3);
            if (element.isEnabled())
            {
                element.click();
            }

        }
        catch (Exception ex)
        {
            System.out.println("Can not click element: " + ex.getMessage());
            element.click();
        }
        BrowserUtils.waitForVisibility(control,4);
    }


    public void writeSearchText(String searchText) {
        txtSearchbox.click();
        txtSearchbox.sendKeys(searchText);
    }

    public void clickFunctionBtn() {
        if (btnFunction.isEnabled()) {
            btnFunction.click();
            BrowserUtils.waitForVisibility(mainMenuBar, 10);
        }
    }


}

