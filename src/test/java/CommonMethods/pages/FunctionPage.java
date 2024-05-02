package CommonMethods.pages;

import CommonMethods.pagefactory.Base;
import CommonMethods.utils.BrowserUtils;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Browser;
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
    @FindBy(xpath = "//span[text()='Lesen']")
    private WebElement cbbRoleLesen;
    @FindBy(xpath = "(//div[@class='ms-List-page'])[2]")
    private WebElement functionRoleList;
    @FindBy(xpath = "//button[@title='Hinzufügen']")
    private WebElement btnHinzufugen;
    @FindBy(xpath = "(//div[@role='radio'])[10]")
    private WebElement functionCheckBox;
    @FindBy(xpath = "(//div[@role='radio'])[4]")
    private WebElement functionCheckBoxForRemove;
    @FindBy(xpath = "(//div[@role='radio'])[7]")
    private WebElement functionCheckBoxForDropdown;
    @FindBy(xpath = "(//i[@data-icon-name='MoreVertical'])[7]")
    private WebElement functionDropdown;
    @FindBy(xpath = "//button[@title='Löschen']")
    private WebElement btnLoschen;
    @FindBy(xpath = "(//button[@title='Löschen'])[2]")
    private WebElement btnLoschen2;
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
    @FindBy(xpath = "//span[contains(text(),'Nächster Monat')]")
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
    @FindBy(xpath = "//button[@role='menuitemc.ms-Modal-scrollableContentheckbox']")
    private List<WebElement> listOfOrganizationStruktur;
    @FindBy(xpath = "(//button[contains(@class,'ms-ContextualMenu-link')])[4]")
    private WebElement clickBreadcrumb;
    @FindBy(css = ".ms-Persona-details")
    private WebElement newCreatedAssignment;
    @FindBy(css = ".Toastify")
    private WebElement notificationPanel;
    @FindBy(css = ".ms-Panel-navigation")
    private WebElement memberAndUpdate;
    @FindBy(css = ".ms-Persona-details")
    private WebElement functionEmptyPanel;
    @FindBy(xpath = "//span[text()='Herunterladen']")
    private WebElement btnHerunterladen;
    @FindBy(xpath = "//div[@data-focuszone-id='FocusZone2']")
    private WebElement blueRibbon;
    @FindBy(css = "#contentContainer")
    private WebElement sideBar;
    @FindBy(xpath = "//button[@aria-label='Vollbildschirm']")
    private WebElement btnFullScreen;
    @FindBy(css = ".navbarContent")
    private List<WebElement> sideBarControlElement;
    @FindBy(xpath = "(//span[text()='Organisationseinheit'])[1]")
    private WebElement organizationEinheitFilter;
    @FindBy(xpath = "(//span[text()='Rolle'])[1]")
    private WebElement rolleFilter;
    @FindBy(xpath = "//i[@data-icon-name='CheckMark']")
    private List<WebElement> checkboxOrganizationEinheit;
    @FindBy(xpath = "//i[@data-icon-name='CheckMark']")
    private List<WebElement> checkboxRolle;
    @FindBy(css = ".ms-DetailsList-contentWrapper")
    private WebElement contentWrapper;
    @FindBy(xpath = "(//span[text()='Abbrechen'])[2]")
    private WebElement btnAbbrechen;
    @FindBy(css = "ul.ms-ContextualMenu-list")
    private WebElement BearbeitenUndLoschenDisplay;

    public void setClickAbbrechen() {
        BrowserUtils.waitFor(3);
        btnAbbrechen.click();
    }

    public WebElement getBearbeitenUndLoschenDisplay() {
        return BearbeitenUndLoschenDisplay;
    }

    public void setFunctionDropdown() {
        BrowserUtils.waitFor(2);
        functionDropdown.click();
    }

    public WebElement getContentWrapper() {
        BrowserUtils.waitFor(3);
        return contentWrapper;
    }

    public List<WebElement> clickCheckBoxRolle() {
        BrowserUtils.waitFor(2);
        for (WebElement checkbox : checkboxRolle) {
            checkbox.click();
        }
        return checkboxRolle;
    }

    public List<WebElement> clickCheckBoxOrganizationEinheit() {
        BrowserUtils.waitFor(3);
        for (WebElement checkbox : checkboxOrganizationEinheit) {
            checkbox.click();
        }
        return checkboxOrganizationEinheit;
    }
       /* for (int i = 0; i < 3 && i < checkboxOrganizationEinheit.size(); i++) {
            checkboxOrganizationEinheit.get(i).click();
            break;
            //return clickCheckBoxOrganizationEinheit(); // checkboxOrganizationEinheit.isEmpty() ? null : checkboxOrganizationEinheit.get(0);
        }*/


    public void clickRolleFiltern() {
        BrowserUtils.waitFor(2);
        rolleFilter.click();
    }

    public void clickOrganizationEinheitFiltern() {
        BrowserUtils.waitFor(2);
        organizationEinheitFilter.click();
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

    /**
     * User click Fullscreen button
     */
    @Step("User clicks Full Screen Button")
    public void function_Fullscreen_Button() {
        BrowserUtils.waitFor(2);
        btnFullScreen.click();
    }

    public WebElement getSideBar() {
        BrowserUtils.waitForVisibility(sideBar, 3);
        return sideBar;
    }

    public WebElement getBlueRibbon() {
        BrowserUtils.waitFor(3);
        return blueRibbon;
    }

    public WebElement getMainMenuBar() {
        return mainMenuBar;
    }

    public WebElement setBtnHerunterladen() {
        BrowserUtils.waitFor(2);
        btnHerunterladen.click();
        return btnHerunterladen;
    }

    public void setFunctionEmptyPanel() {
        BrowserUtils.waitFor(2);
        if (!functionEmptyPanel.isDisplayed()) {
            System.out.println("No assignment");
        }
    }

    public WebElement getMemberAndUpdate() {
        BrowserUtils.waitFor(2);
        System.out.println(memberAndUpdate.getText());
        return memberAndUpdate;
    }

    public void btnsecondLoschen() {
        BrowserUtils.waitFor(4);
        BrowserUtils.clickWithJS(btnLoschen2);
    }

    public WebElement getNewCreatedAssignment() {
        BrowserUtils.waitFor(4);
        System.out.println(newCreatedAssignment.getText());
        return newCreatedAssignment;
    }

    public WebElement getNotificationPanel() {
        BrowserUtils.waitFor(4);
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
            for (WebElement option : listOfTimeAssignments) {
                if (option.getText().equals(expectedValue)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
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
        BrowserUtils.waitFor(3);
        btnEdit.click();
        return btnEdit;
    }

    public void setBreadcrumbIcon() {
        BrowserUtils.waitFor(2);
        breadcrumbIcon.click();
    }

    public void setFilterIcon() {
        BrowserUtils.waitFor(5);
        filterIcon.click();
    }

    public void StichwortFilternField(String stichwort) {
        BrowserUtils.waitFor(10);
        stichwortFilternField.sendKeys(stichwort);
    }

    public WebElement filteredList() {
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

    public void setBenutzerDefiniert() {
        BrowserUtils.waitFor(2);

        benutzerDefiniert.click();
    }

    public void setAktuelleWoche() {
        BrowserUtils.waitFor(2);
        aktuelleWoche.click();
    }

    public void setAktuellerMonat() {
        BrowserUtils.waitFor(2);
        aktuellerMonat.click();
    }

    public void setNächsteWoche() {
        BrowserUtils.waitFor(2);
        nächsteWoche.click();
    }

    public void setNächsterMonat() {
        BrowserUtils.waitFor(2);
        nächsterMonat.click();
    }

    public WebElement getDatePickerControl() {
        return datePickerControl;
    }

    public void selectBenutzer(String AddUser) {
        addUserInput.sendKeys(AddUser);
        BrowserUtils.waitForVisibility(userNameVerify, 4);
        clickOnUser.click();
    }

    public void setGultigkeitArea() {
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(gultigkeitArea);
    }

    public void clickUbernehmenButton() {
        BrowserUtils.waitFor(2);
        clickUbernehmen.click();
    }

    public WebElement getButtonUbernehmen() {
        BrowserUtils.waitFor(2);
        // btnUbernehmen.click();
        return btnUbernehmen;
    }

    public void clickSpeichernButton() {
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

    /*
    Select the 10th checkbox in the function list
     */
    public void functionCheckBoxClick() {
        BrowserUtils.waitFor(3);
        functionCheckBox.click();
    }

    /*
    Select the 4th checkbox in the function list (for removing)
     */
    public void setFunctionCheckBoxForRemove() {
        BrowserUtils.waitFor(3);
        functionCheckBoxForRemove.click();
    }

    /*
     * Select the 7th function in the list (for dropdown)
     */
    public void setFunctionCheckBoxForDropdown() {
        BrowserUtils.waitFor(2);
        functionCheckBoxForDropdown.click();
    }

    public WebElement getBtnLoschen() {
        BrowserUtils.waitFor(3);
        return btnLoschen;
    }
    public void clickButtonLöschenMainBar() {
        BrowserUtils.waitFor(2);
        btnLoschen.click();
    }
    public WebElement getFunctionRoleList() {
        BrowserUtils.waitForVisibility(functionRoleList, 4);
        return functionRoleList;
    }
    public WebElement getBtnHinzufugen() {
        BrowserUtils.waitFor(3);
        if (btnHinzufugen.isEnabled()) {
            btnHinzufugen.click();
        }
        return btnHinzufugen;
    }
    public WebElement getCbbRoleLesen() {
        BrowserUtils.waitFor(3);
        cbbRoleLesen.click();
        return cbbRoleLesen;
    }
    public WebElement getBtnCreateFunction() {
        BrowserUtils.waitFor(2);
        if (btnCreateFunction.isEnabled()) {
            btnCreateFunction.click();
        }
        return btnCreateFunction;
    }
    public void selectCbb(WebElement cbb, WebElement cbbOption) {
        cbb.click();
        BrowserUtils.clickWithJS(cbb);
        BrowserUtils.waitForVisibility(cbbOption, 4);
        cbbOption.click(); // Seçeneği tıkla
        System.out.println("Selected option: " + cbbOption.getText()); // Print the selected one

    }

    public void selectOrganisation(WebElement cbbOption) {
        BrowserUtils.waitFor(3);
        selectCbb(comboBoxOrganisation, cbbOption);
    }

    public void selectRole(WebElement cbbOption) {
        BrowserUtils.waitFor(3);
        selectCbb(comboBoxRole, cbbOption);
    }

    public WebElement getListTable() {
        return listTable;
    }

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

    public WebElement getComboBoxOrganizationEinheit(String Einheit) {
        BrowserUtils.waitFor(5);
        comboBoxOrganizationEinheit.click();
        comboBoxOrganizationEinheit.sendKeys(Einheit);
        clickOrganization.click();
        return comboBoxOrganizationEinheit;
    }

    @FindBy(css = "div.ms-ComboBox-container:nth-child(1) input")
    private WebElement comboBoxOrganizationEinheit;

    public WebElement getSelectOrganization(String Role) {
        BrowserUtils.waitFor(5);
        selectOrganization.click();
        selectOrganization.sendKeys(Role);
        clickOrganization.click();
        return selectOrganization;
    }

    @FindBy(css = "div.ms-ComboBox-container:nth-child(2) input")
    private WebElement selectOrganization;
    @FindBy(css = ".ms-ComboBox-optionText")
    private WebElement clickOrganization;

    public WebElement getFunctionPageContainer() {

        return functionPageContainer;
    }

    @FindBy(css = "#detailsContainer")
    private WebElement functionPageContainer;

    @FindBy(css = ".ms-List-cell")
    private List<WebElement> allFunctions;
    public List<WebElement> allFunctionsVisible(){
        BrowserUtils.waitFor(2);
        if (allFunctions.size()>1) {
            System.out.println(allFunctions.size());
        }else {
            System.out.println("No functions found");
        }
        return allFunctions;
    }

    public WebElement getFunctionHeaderWrapper() {
        BrowserUtils.waitFor(2);

        System.out.println(functionHeaderWrapper.getText());
        return functionHeaderWrapper;
    }

    @FindBy(css = ".ms-DetailsList-headerWrapper")
    private WebElement functionHeaderWrapper;

    @FindBy(css = "ms-DetailsRow-cell")
    private List<WebElement> allRows;

    public void allRowsInLine(String[] rows){
        BrowserUtils.waitFor(5);
        for (String row : rows)
        for (WebElement option : allRows){
            if (option.getText().equals(row)){
                option.click();
                break;
            }
        }

    }
    @FindBy(xpath = "(//div[@role='radio'])[1]")
    private WebElement functionCheckBoxForCreate;

    public void functionCheckBoxForCreate(){
        BrowserUtils.waitFor(5);
        functionCheckBoxForCreate.click();
    }

    public WebElement getHinzugefügtAm() {
        BrowserUtils.waitFor(5);
        System.out.println(hinzugefügtAm.getText());
        return hinzugefügtAm;
    }

    @FindBy(xpath = "//span[contains(text(),'Hinzugefügt am')]")
    private WebElement hinzugefugtAmSortieren;

    public void clickHinzugefugtAmSortieren(){
        BrowserUtils.waitFor(3);
        hinzugefugtAmSortieren.click();
    }

    public WebElement getAscendingAndDescendingPanel() {
        BrowserUtils.waitFor(2);
        return AscendingAndDescendingPanel;
    }

    @FindBy(css = ".ms-ContextualMenu-list.is-open")
    private WebElement AscendingAndDescendingPanel;
    @FindBy(xpath = "(//div[@role='gridcell'])[4]")
    private WebElement hinzugefügtAm;


    @FindBy(css = "li.ms-ContextualMenu-item:nth-child(1)")
    private WebElement aufsteigenSortieren;
    public void clickAbsteigenSortieren(){
        BrowserUtils.waitFor(2);
        absteigenSortieren.click();
    }
    @FindBy(css = "li.ms-ContextualMenu-item:nth-child(2)")
    private WebElement absteigenSortieren;
    public void clickAufsteigenSortieren(){
        BrowserUtils.waitFor(2);
        aufsteigenSortieren.click();
    }


}
