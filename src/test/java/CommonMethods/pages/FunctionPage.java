package CommonMethods.pages;

import CommonMethods.pagefactory.Base;
import CommonMethods.utils.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

import static CommonMethods.pagefactory.Annotations.driver;

public class FunctionPage extends Base {
    @FindBy(css = "#SearchBox17")
    private WebElement txtSearchbox;
    @FindBy(css = ".highlighted.highlighted-211")
    private WebElement btnFunction;
    @FindBy(xpath = "(//div[@class='ms-TooltipHost root-288'])[8]")
    private WebElement txtEdit;
    @FindBy(xpath = "//button[@title='Bearbeiten']")
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
    @FindBy(xpath = "(//button[contains(@class,'ms-ComboBox-CaretDown-button')])[1]")
    private WebElement comboBoxOrganisation;
    //css = "div.ms-ComboBox-container:nth-child(1)>div"
    // @FindBy(css = "div.ms-ComboBox-container:nth-child(1) input")
    //private WebElement comboBoxOrganizationEinheit;
    @FindBy(css = "div.ms-ComboBox-container:nth-child(2) input")
    private WebElement comboBoxRole;
    @FindBy(xpath = "//div[@data-list-index='6']")
    private WebElement comboBoxOrg103;
    @FindBy(xpath = "//span[text()='Lesen']")
    private WebElement cbbRoleLesen;
    @FindBy(xpath = "(//div[@class='ms-List-page'])[2]")
    private WebElement functionRoleList;
    @FindBy(xpath = "//button[@title='Hinzufügen']")
    private WebElement btnHinzufugen;
    @FindBy(xpath = "(//div[@role='radio'])[5]")
    private WebElement functionCheckBox;
    @FindBy(xpath = "//button[@title='Löschen']")
    private WebElement btnLoschen;
    @FindBy(css = "span.ms-Dialog-action:nth-child(1)")
    private WebElement confirmLoschen;
    @FindBy(xpath = "(//input[@type='text'])[2]")
    private WebElement chooseEndDatum;
   @FindBy(xpath = "(//div[starts-with(@class,'ms-Stack root')])[4]")
   private WebElement datePickerControl;
    @FindBy(css = "span.ms-Dialog-action:nth-child(1)")
    private WebElement btnUbernehmen;
    @FindBy(css = "span.ms-Dialog-action:nth-child(1)")
    private WebElement clickUbernehmen;
    @FindBy(xpath = "//span[contains(text(),'Speichern')]")
    private WebElement clickSpeichern;
    @FindBy(xpath = "//span[contains(text(),'Unbeschränkt gültig')]")
    private WebElement unbeschranktGultig;
    @FindBy(xpath = "//span[contains(text(),'Benutzerdefiniert')]")
    private WebElement benutzerDefiniert;
    @FindBy(xpath = "//span[contains(text(),'Aktuelle Woche')]")
    private WebElement aktuelleWoche;
    @FindBy(xpath = "//span[contains(text(),'Aktueller Monat')]")
    private WebElement aktuellerMonat;
    @FindBy(xpath = "//span[contains(text(),'Nächste Woche')]")
    private WebElement nächsteWoche;
    @FindBy(xpath = "//span[contains(text(),'Nächste Woche')]")
    private WebElement nächsterMonat;
    @FindBy(xpath = "//div[contains(text(),'123@123.de')]")
    private WebElement userNameVerify;
    @FindBy(css = ".ms-Dropdown")
    private WebElement gultigkeitArea;
    @FindBy(css = ".ms-Suggestions-itemButton")
    private WebElement clickOnUser;
    @FindBy(xpath = "//input[@aria-haspopup='listbox']")
    private WebElement addUserInput;
    @FindBy(css = ".ms-Modal-scrollableContent")
    private WebElement functionUserAddPanel;
    @FindBy(css = ".ms-Panel-main")
    private WebElement functionEditPanel;
    @FindBy(xpath = "//i[@data-icon-name='Filter']")
    private WebElement filterIcon;
    @FindBy(xpath = "//input[@type='text']")
    private WebElement stichwortFilternField;
    @FindBy(css = ".ms-List-page")
    private WebElement filteredList;
    @FindBy(xpath = "//i[@data-icon-name='ChevronRight']")
    private WebElement breadcrumbIcon;
    @FindBy(xpath = "//span[contains(text(), 'Neue Zuweisung')]")
    private WebElement functionNeueZuweisung;
    @FindBy(xpath = ".//button[@role='option']")
    private List<WebElement> listOfTimeAssignments;
    @FindBy(xpath = "//button[@role='menuitemcheckbox']")
    private List <WebElement> listOfOrganizationStruktur;
    @FindBy(xpath = "(//button[contains(@class,'ms-ContextualMenu-link')])[4]")
    private WebElement clickBreadcrumb;
    @FindBy(css = ".ms-Persona-details")
    private WebElement newCreatedAssignment;
    @FindBy(css = ".Toastify")
    private WebElement notificationPanel;
    @FindBy(xpath = "(//span[@class='css-333'])[2]")
    private WebElement anzahlMitglieder;
    @FindBy(xpath = "(//span[@class='css-333'])[4]")
    private WebElement letzteAktualizierung;

    public WebElement getNewCreatedAssignment() {
        BrowserUtils.waitFor(3);
        System.out.println(newCreatedAssignment.getText());
        return newCreatedAssignment;
    }
    public WebElement getNotificationPanel() {
        BrowserUtils.waitFor(3);
        System.out.println(notificationPanel.getText());
        return notificationPanel;
    }
    public void getClickBreadcrumb() {
        BrowserUtils.waitFor(3);
        BrowserUtils.clickWithJS(clickBreadcrumb);
    }
    public String getListOfOrganizationStruktur() {
        BrowserUtils.waitFor(5);
        StringBuilder actualStruktur = new StringBuilder();
        for (WebElement breadcrumb : listOfOrganizationStruktur) {
            actualStruktur.append(breadcrumb.getText()).append(", ");
            System.out.println(breadcrumb.getText());
        }
        return actualStruktur.toString().trim();
    }
    public boolean getListOfTimeAssignments(String[] expectedValues) {
        BrowserUtils.waitFor(2);

        for (String expectedValue : expectedValues) {
            boolean found = false;
            for (WebElement option : listOfTimeAssignments){
                if (option.getText().equals(expectedValue)){
                    found = true;
                    break;
                }
            }
            if (!found){
                return false;
            }
        }
       return true;
    }
    public void getChooseEndDatum(String endDatumAuswahlen) {
        chooseEndDatum.sendKeys(endDatumAuswahlen);
        BrowserUtils.waitFor(2);
        Assert.assertTrue(getButtonUbernehmen().isEnabled());
    }
    public WebElement getBtnEdit() {
        BrowserUtils.waitFor(2);
        btnEdit.click();
        return btnEdit;
    }
    public void setBreadcrumbIcon(){
        BrowserUtils.waitFor(2);
        breadcrumbIcon.click();
    }
    public void setFilterIcon(){
        BrowserUtils.waitFor(2);
        filterIcon.click();
    }
    public void setStichwortFilternField(String stichwort){
        BrowserUtils.waitFor(5);
        stichwortFilternField.sendKeys(stichwort);
    }
    public WebElement filteredList(){
        BrowserUtils.waitFor(5);
        if (filteredList.isDisplayed()) {
            System.out.println(filteredList.getText());
        }
        return filteredList;
    }
    public WebElement getUnbeschranktGultig() {
        BrowserUtils.waitFor(2);
        unbeschranktGultig.click();

        return unbeschranktGultig;
    }
    public void setBenutzerDefiniert(){
        BrowserUtils.waitFor(2);

        benutzerDefiniert.click();
    }
    public void setAktuelleWoche() {
        BrowserUtils.waitFor(2);
        aktuelleWoche.click();
    }
    public void setAktuellerMonat(){
        BrowserUtils.waitFor(2);
        aktuellerMonat.click();
    }
    public void setNächsteWoche(){
        BrowserUtils.waitFor(2);
        nächsteWoche.click();
    }
    public void setNächsterMonat(){
        BrowserUtils.waitFor(2);
        nächsterMonat.click();
    }
    public WebElement getDatePickerControl(){
        return datePickerControl;
    }
    public void  selectBenutzer(String AddUser)
    {
        addUserInput.sendKeys(AddUser);
        BrowserUtils.waitForVisibility(userNameVerify, 4);
        clickOnUser.click();
    }
    public void setGultigkeitArea() {
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(gultigkeitArea);
    }
    public void clickUbernehmenButton(){
        BrowserUtils.waitFor(2);
        clickUbernehmen.click();
    }
    public WebElement getButtonUbernehmen() {
        BrowserUtils.waitFor(2);
       // btnUbernehmen.click();
        return btnUbernehmen;
    }
    public void clickSpeichernButton(){
        BrowserUtils.waitFor(4);
        clickSpeichern.click();
    }
    public WebElement getFunctionEditPanel() {
        return functionEditPanel;
    }
    public WebElement getUserNameVerify() {
        return userNameVerify;
    }
    public void clickNeuZuweisung() {
        BrowserUtils.waitFor(2);
        functionNeueZuweisung.click();
    }
    public WebElement getFunctionUserAddPanel() {

        return functionUserAddPanel;
    }

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
    public void confirmLöschenButton() {
        confirmLoschen.click();
    }
    public void functionCheckBoxClick() {
        BrowserUtils.waitFor(3);
        functionCheckBox.click();
    }
    public WebElement getBtnLoschen() {
        BrowserUtils.waitFor(3);
        return btnLoschen;
    }
    public void buttonLöschenMainBar() {
        BrowserUtils.waitFor(2);
        btnLoschen.click();
    }
    public WebElement getFunctionRoleList() {
        BrowserUtils.waitForVisibility(functionRoleList, 4);
        return functionRoleList;
    }
    public WebElement getBtnHinzufugen() {
        BrowserUtils.waitFor(3);
        if (btnHinzufugen.isEnabled()){
            btnHinzufugen.click();
        }
        return btnHinzufugen;
    }
    public WebElement getcomboBoxOrg103() {
        BrowserUtils.waitFor(3);
        BrowserUtils.clickWithJS(comboBoxOrg103);
        comboBoxOrg103.click();
        return comboBoxOrg103;
    }
    public WebElement getCbbRoleLesen() {
        BrowserUtils.waitFor(3);
        cbbRoleLesen.click();
        return cbbRoleLesen;
    }
    public WebElement getBtnCreateFunction() {return btnCreateFunction;}
    public void clickHinzufugenBtn() {
        btnHinzufugen.click();
        // BrowserUtils.waitForVisibility(functionPanel,5);
        BrowserUtils.waitFor(3);
    }
    public void selectCbb(WebElement cbb, WebElement cbbOption) {
        cbb.click();
        BrowserUtils.clickWithJS(cbb);
        BrowserUtils.waitForVisibility(cbbOption, 4);
        cbbOption.click(); // Seçeneği tıkla
        System.out.println("Selected option: " + cbbOption.getText()); // Print the selected one

    }
    public void selectOrganisation(WebElement cbbOption) {
        selectCbb(comboBoxOrganisation, cbbOption);
    }
    public void selectRole(WebElement cbbOption) {
        selectCbb(comboBoxRole, cbbOption);
    }
    public WebElement getListTable() {return listTable;}
    public WebElement getCompactTable() {return compactTable;}
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
        controlledClick(listMenu, listPanel);
        BrowserUtils.waitForVisibility(listPanel, 2);
        BrowserUtils.waitForVisibility(listPanel, 7);
        if (compactView.isEnabled()) {
            compactView.click();
            BrowserUtils.waitForVisibility(compactTable, 7);
        }
    }
    public void controlledClick(WebElement element, WebElement control) {
        try {
            BrowserUtils.waitForClickability(element, 3);
            if (element.isEnabled()) {
                element.click();
            }

        } catch (Exception ex) {
            System.out.println("Can not click element: " + ex.getMessage());
            element.click();
        }
        BrowserUtils.waitForVisibility(control, 4);
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

