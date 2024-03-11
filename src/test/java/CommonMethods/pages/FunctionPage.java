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
    private WebElement comboBoxOrganisation;

  // @FindBy(css = "div.ms-ComboBox-container:nth-child(1) input")
    //private WebElement comboBoxOrganizationEinheit;

    @FindBy(css = "div.ms-ComboBox-container:nth-child(2) input")
    private WebElement comboBoxRole;

    @FindBy(xpath = "//div[@data-list-index='6']")
    private WebElement comboBoxOrg103;

    @FindBy(xpath = "//span[text()='Lesen']")
    private WebElement cbbRoleLesen;
    //(//button[@type='button'])[25]

    @FindBy(xpath = "(//div[@class='ms-List-page'])[2]")
    private WebElement functionRoleList;
    @FindBy(xpath = "//button[@title='Hinzufügen']")
    private WebElement btnHinzufugen;

   @FindBy(xpath = "(//div[@role='radio'])[5]")
   private WebElement functionCheckBox;
   @FindBy(xpath = "//button[@title='Löschen']")
    private WebElement btnLöschen;
   @FindBy(css = "span.ms-Dialog-action:nth-child(1)")
   private WebElement confirmLöschen;

    public WebElement getComboBoxRole() {
        BrowserUtils.waitFor(2);
        comboBoxRole.click();
        return comboBoxRole;
    }
    public WebElement getComboBoxOrganisation() {
        BrowserUtils.waitFor(2);
        comboBoxOrganisation.click();
        return comboBoxOrganisation;
    }
    public void confirmLöschenButton(){
        confirmLöschen.click();
    }
    public void functionCheckBoxClick(){

        BrowserUtils.waitFor( 3);
        functionCheckBox.click();
    }
    public WebElement getBtnLöschen() {
        BrowserUtils.waitFor(3);
        return btnLöschen;
    }
    public void buttonLöschenMainBar(){
        BrowserUtils.waitFor(2);
        btnLöschen.click();
    }
    public WebElement getFunctionRoleList() {
        BrowserUtils.waitForVisibility(functionRoleList, 4);
        return functionRoleList;
    }
    public WebElement getBtnHinzufugen() {
        BrowserUtils.waitFor(3);
        btnHinzufugen.click();
        return btnHinzufugen;
    }

    public WebElement getcomboBoxOrg103() {
        BrowserUtils.waitFor(3);
        BrowserUtils.clickWithJS(comboBoxOrg103);
        comboBoxOrg103.click();
        return comboBoxOrg103;
    }

    public WebElement getCbbRoleLesen() {
        BrowserUtils.waitFor(5);
        cbbRoleLesen.click();
        return cbbRoleLesen;
    }

    public WebElement getBtnCreateFunction() {
        return btnCreateFunction;
    }
    
    public void clickHinzufugenBtn()
    {
        btnHinzufugen.click();
        // BrowserUtils.waitForVisibility(functionPanel,5);
        BrowserUtils.waitFor(3);
    }

    public void selectCbb(WebElement cbb, WebElement cbbOption) {
        cbb.click();
        BrowserUtils.clickWithJS(cbb);
        BrowserUtils.waitForVisibility(cbbOption, 4);
        cbbOption.click(); // Seçeneği tıkla
        System.out.println("Selected option: " + cbbOption.getText()); // Seçilen seçeneği yazdır

    }

    public void selectOrganisation(WebElement cbbOption)


    {
        selectCbb(comboBoxOrganisation, cbbOption);
    }
    public void selectRole(WebElement cbbOption)

    {
       selectCbb(comboBoxRole, cbbOption);
    }
    public WebElement getListTable()

    { return listTable; }

    public WebElement getCompactTable()
    {
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

