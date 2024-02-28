package CommonMethods.pages;

import CommonMethods.pagefactory.Base;
import CommonMethods.utils.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

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

    @FindBy(css = "div.ms-Modal-scrollableContent")
    private WebElement functionPanel;

    @FindBy(css = "span.ms-Dialog-action>button")
    private WebElement btnCreateFunction;

    @FindBy(css = "div.ms-ComboBox-container:nth-child(1)>div")
    private WebElement cbbOrganisation;

    @FindBy(css = "div.ms-ComboBox-container:nth-child(2) input")
    private WebElement cbbRole;

    @FindBy(xpath = "//span[text()='103']")
    private WebElement cbbOrg103;

    @FindBy(xpath = "//span[text()='Lesen']")
    private WebElement cbbRoleLesen;

    @FindBy(xpath = "//button[@title='Hinzufügen']")
    private WebElement btnHinzufugen;

    public WebElement getBtnHinzufugen() {
        BrowserUtils.waitFor(2);
        return btnHinzufugen;
    }

    public WebElement getCbbOrg103() {
        BrowserUtils.waitForVisibility(cbbOrg103,5);
        return cbbOrg103;
    }

    public WebElement getCbbRoleLesen() {
        BrowserUtils.waitForVisibility(cbbRoleLesen,5);
        return cbbRoleLesen;
    }

    public WebElement getBtnCreateFunction() {
        return btnCreateFunction;
    }
    
    public void clickHinzufugenBtn()
    {
        btnHinzufugen.click();
        // BrowserUtils.waitForVisibility(functionPanel,5);
        BrowserUtils.waitFor(6);
    }

    public void selectCbb(WebElement cbb, WebElement cbbOption)
    {
        cbb.click();
        BrowserUtils.clickWithJS(cbb);
        BrowserUtils.waitForVisibility(cbbOption,4);
        WebElement element = cbbOption;
        element.click();
        System.out.println(element.getText());
        BrowserUtils.waitFor(4);
    }

    public void selectOrganisation(WebElement cbbOption)
    {
        selectCbb(cbbOrganisation, cbbOption);
    }

    public void selectRole(WebElement cbbOption)
    {
       selectCbb(cbbRole, cbbOption);
    }

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
        BrowserUtils.waitFor(2);
        if (btnFunction.isEnabled()) {
            btnFunction.click();
            BrowserUtils.waitForVisibility(mainMenuBar, 10);
        }
    }


}

