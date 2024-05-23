package CommonMethods.pages;

import CommonMethods.pagefactory.Base;
import CommonMethods.utils.BrowserUtils;
import CommonMethods.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static CommonMethods.pagefactory.Annotations.driver;

public class GruppenPage extends Base {

    /*
    The locator for "Hinzufügen" and "+Neu" for adding
     */
    @FindBy(xpath = "//button[@title='Hinzufügen']")
    private WebElement btnHinzufugen;
    /*
    This Css Locator is for the screen of creating a group
     */
    @FindBy(css = "div.ms-Modal-scrollableContent")
    private WebElement groupCreateScreen;
    /*
    This element gives us the main bar which includes "Neu", Bearbeiten, "Löschen", "Herunterladen, "Hochladen"
     */
    @FindBy(css = "#commandBarContainer")
    private WebElement mainMenuBar;
    /*
    This locator provides CSS for "Navigation durchsuchen" to enter any data
     */
    @FindBy(css = "#SearchBox17")
    private WebElement txtSearchbox;
    /*
    This element is for clicking Gruppen after entering any data in search box
     */
    @FindBy(css = ".highlighted.highlighted-211")
    private WebElement btnGruppen;
    /*
    This element gives us the locator when you want to enter the data in "Gruppenname"
     */
    @FindBy(xpath = "(//input[@type='text'])[1]")
    private WebElement createGroupName;
    /*
    The locator for "Erstellen" button when you want to create a new group
     */
    @FindBy(css = "span.ms-Dialog-action:nth-child(1)")
    private WebElement createButton;
    /*
      This locater is just used when "Erstellen" button is in disabled mode
    */
    @FindBy(css = "button.ms-Button.ms-Button--primary.is-disabled")
    private WebElement createButtonDisabled;
    /*
    This locator is for entering a data in "Gruppenmitglieder"
     */
    @FindBy(xpath = "//input[@role='combobox']")
    private WebElement gruppenMitglieder;

    //This is for selecting the user from the list
    @FindBy(xpath = "(//span[text()='A365T_REGZ'])[1]")
    private WebElement selectedMitglieder;

    //This locator will select the first checkbox of the list
    @FindBy(xpath = "(//div[@role='checkbox'])[1]")
    private WebElement firstCheckboxForDelete;
    @FindBy(xpath = "//button[@title='Löschen']")
    private WebElement btnLoschen;
    @FindBy(css = "span.ms-Dialog-action:nth-child(2)")
    private WebElement buttonAbbrechenEnabled;
    @FindBy(css = "span.ms-Dialog-action:nth-child(1)")
    private WebElement buttonLöschenEnabled;
    @FindBy(css = "span.ms-Dialog-action:nth-child(1)")
    private WebElement clickLöschen;
    @FindBy(xpath = "(//button[@title='Löschen'])[2]")
    private WebElement btnLoschenAssignment;
    @FindBy(css = ".Toastify")
    private WebElement notificationPanel;
    @FindBy(xpath = "//i[@data-icon-name='Filter']")
    private WebElement filterIcon;
    @FindBy(css = "input.ms-TextField-field")
    private WebElement stichwortFilternArea;
    @FindBy(xpath = "//button[@title='Bearbeiten']")
    private WebElement buttonEdit;
    @FindBy(css = ".ms-Panel-navigation")
    private WebElement groupPanelNavigation;
    @FindBy(xpath = "(//span[contains(@class,'ms-Pivot-text')])[2]")
    private WebElement groupPanelBenutzer;
    @FindBy(xpath = "(//span[contains(@class,'ms-Pivot-text')])[1]")
    private WebElement groupPanelGruppen;
    @FindBy(xpath = " (//span[contains(@class,'ms-Pivot-text')])[3]")
    private WebElement groupModuleTab;
    @FindBy(xpath = "//span[contains(text(),'Neue Zuweisung')]")
    private WebElement groupNeuZuweisung;
    @FindBy(xpath = "//input[@aria-haspopup='listbox']")
    private WebElement addUserInput;
    @FindBy(css = ".ms-Modal-scrollableContent")
    private WebElement benutzerHinzufügenDisplay;
    @FindBy(xpath = "//div[contains(text(),'123@123.de')]")
    private WebElement userNameVerify;
    @FindBy(css = ".ms-Suggestions-itemButton")
    private WebElement clickOnUser;
    @FindBy(css = ".ms-Dropdown")
    private WebElement gultigkeitArea;
    @FindBy(xpath = "//button[@role='option']")
    private List<WebElement> listOfTimeAssignments;
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
    @FindBy(xpath = "(//div[starts-with(@class,'ms-Stack root')])[4]")
    private WebElement datePickerControl;
    @FindBy(xpath = "(//input[@type='text'])[3]")
    private WebElement chooseEndDatum;
    @FindBy(css = "span.ms-Dialog-action:nth-child(1)")
    private WebElement clickUbernehmen;
    @FindBy(css = "span.ms-Dialog-action:nth-child(1)")
    private WebElement btnUbernehmen;
    @FindBy(xpath = "//span[contains(text(),'Speichern')]")
    private WebElement clickSpeichern;
    @FindBy(css = ".ms-Modal-scrollableContent")
    private WebElement groupUserAddPanel;
    @FindBy(css = "div.ms-BasePicker-text input.ms-BasePicker-input")
    private WebElement addGroupInput;
    @FindBy(xpath = "//div[contains(text(),'120 Lesen')]")
    private WebElement groupNameVerify;
    @FindBy(css = ".ms-Suggestions-itemButton")
    private WebElement clickOnGroup;
    @FindBy(xpath = "//div[contains(@class, \"ms-Stack headerSubText\")]/span[contains(@class, \"css-\")]")
    private WebElement lastUpdate;
    @FindBy(css ="span.ms-MessageBar-innerText > span")
    private WebElement exportFileNotificationMessage;
    @FindBy(xpath = "//button[@title='Herunterladen']")
    private WebElement buttonGroupDownload;
    @FindBy(xpath = "(//div[contains (@class,'ms-ScrollablePane--contentContainer')])[2]")
    private WebElement moduleConfigurationArea;
    @FindBy(css = "button.ms-Toggle-background[role='switch'][data-testid='defaultModulesToggle']")
    private WebElement buttonVerebteModul;
    @FindBy(xpath = "//span[contains(text(), 'GroupT')]")
    private List <WebElement> filteredNameList;
    @FindBy(xpath = "//button[@title='Hochladen']")
    private WebElement buttonGroupUpload;
    @FindBy(xpath = "//i[@data-icon-name='info']")
    private WebElement infoButton;
    @FindBy(css = ".ms-Modal-scrollableContent")
    private WebElement groupInfoPanel;

    public WebElement getGroupInfoPanel() {
        BrowserUtils.waitFor(2);
        System.out.println(groupInfoPanel.getText());
        return groupInfoPanel;
    }
    public void clickInfoButton(){
        BrowserUtils.waitFor(2);
        infoButton.click();
    }
    public void clickGroupUpload(){
        BrowserUtils.waitFor(2);
        buttonGroupUpload.click();
    }
    public void uploadFile(String filePath){
        BrowserUtils.waitFor(2);
        buttonGroupUpload.sendKeys(filePath);
    }
    public List<WebElement> getFilteredNameList() {
        BrowserUtils.waitFor(2);
        System.out.println(filteredNameList.size());
        return filteredNameList;
    }
    public List<WebElement> searchPartialName(String partialName){

        List<WebElement> matchingElements = new ArrayList<>();
        for (WebElement element : filteredNameList){
            if (element.getText().contains(partialName)){
                matchingElements.add(element);
            }
        }
        return matchingElements;
    }
    public void clickVerebteModuleEinstellung(){
        BrowserUtils.waitFor(2);
        buttonVerebteModul.click();
    }
    public WebElement getModuleConfigurationArea() {
        return moduleConfigurationArea;
    }
    public void buttonGroupDownload(){
        BrowserUtils.waitFor(2);
        buttonGroupDownload.click();
    }
    public void downloadNotificationMessage(){
        BrowserUtils.waitFor(5);
        System.out.println(exportFileNotificationMessage.getText());
        if (exportFileNotificationMessage.getText().equals("Der Export war erfolgreich")){
            System.out.println("Test passed");
        }else{
            System.out.println("Download failed");
        }
    }
    public WebElement theLastViewAfterUpdate(){
        BrowserUtils.waitFor(3);
        String lastUpdatedText = lastUpdate.getText();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        LocalDateTime currentTime = LocalDateTime.now();
        String currentDateTime = currentTime.format(formatter);

        if (lastUpdatedText.equals(currentDateTime)){
            System.out.println("Last update matches the current date and time");
        }else {
            System.out.println("it does not match");
        }
        return lastUpdate;
    }
    public void selectGroup(String AddGroup){
        addGroupInput.sendKeys(AddGroup);
        BrowserUtils.waitForVisibility(groupNameVerify, 3);
        System.out.println(groupNameVerify.getText());
        clickOnGroup.click();
    }

    //Click everytime the first assignment in Gruppen-Benutzer to delete it
    public void buttonLöschenAssignment(){
        BrowserUtils.waitFor(2);
        Actions action = new Actions(driver);
        action.click(btnLoschenAssignment).build().perform();
    }
    public WebElement getAssignmentList() {
        BrowserUtils.waitFor(2);
        if (assignmentList.isDisplayed()){
            System.out.println(assignmentList.getText());
        }else {
            System.out.println("No any assignments in this group");
        }

        return assignmentList;
    }

    @FindBy(xpath = "(//div[@class='ms-List-page'])[2]"    )
    private WebElement assignmentList;

    public WebElement getGroupUserAddPanel() {
        BrowserUtils.waitFor(2);
        return groupUserAddPanel;
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
    public void clickUbernehmenButton() {
        BrowserUtils.waitFor(2);
        clickUbernehmen.click();
    }
    public void clickSpeichernButton() {
        BrowserUtils.waitFor(4);
        clickSpeichern.click();
    }

    public WebElement getButtonUbernehmen() {
        BrowserUtils.waitFor(2);
        // btnUbernehmen.click();
        return btnUbernehmen;
    }
    public void getChooseEndDatum(String endDatumAuswahlen) {
        chooseEndDatum.sendKeys(endDatumAuswahlen);
        BrowserUtils.waitFor(2);
        Assert.assertTrue(getButtonUbernehmen().isEnabled());
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
    public void setGultigkeitArea() {
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(gultigkeitArea);
    }

    public void selectBenutzer(String AddUser) {
        addUserInput.sendKeys(AddUser);
        BrowserUtils.waitForVisibility(userNameVerify, 4);
        clickOnUser.click();
    }
    public WebElement getBenutzerHinzufügenDisplay() {
        return benutzerHinzufügenDisplay;
    }

    public void clickGroupNeuZuweisung(){
        BrowserUtils.waitFor(2);
        groupNeuZuweisung.click();
    }
    public void clickGroupPanelBenutzer(){
        BrowserUtils.waitFor(2);
        groupPanelBenutzer.click();
    }
    public void clickGroupPanelGruppen(){
        BrowserUtils.waitFor(2);
        groupPanelGruppen.click();
    }
    public void clickGroupPanelModule(){
        BrowserUtils.waitFor(2);
        groupModuleTab.click();
    }
    public WebElement getGroupPanelNavigation() {
        BrowserUtils.waitFor(2);
        return groupPanelNavigation;
    }
    public WebElement getEditButton(){
        BrowserUtils.waitFor(2);
        buttonEdit.click();
        return buttonEdit;
    }

    public void stichwortFilternField(String stichwort) {
        BrowserUtils.waitFor(2);
        stichwortFilternArea.sendKeys(stichwort);
    }
    public void keywordFilter(char keyword){
        BrowserUtils.waitFor(2);
        stichwortFilternArea.sendKeys(String.valueOf(keyword));
    }
    public void clickFilterIcon() {
        BrowserUtils.waitFor(5);
        filterIcon.click();
    }
    public WebElement getNotificationPanel() {
        BrowserUtils.waitFor(4);
        System.out.println(notificationPanel.getText());
        return notificationPanel;
    }
    public void clickLöschenButton() {
        BrowserUtils.waitFor(2);
        clickLöschen.click();
    }
    public WebElement getButtonAbbrechenEnabled() {
        return buttonAbbrechenEnabled;
    }
    public WebElement getButtonLöschenEnabled() {
        return buttonLöschenEnabled;
    }
    /*
    This clicks the "Löschen" button on the main bar of "Gruppen"
     */
    public void clickLöschenButtonMainBar() {
        BrowserUtils.waitFor(3);
        btnLoschen.click();
    }
    /*
    This method is used to verify that the delete button is enabled or disabled
     */
    public WebElement getBtnLoschen() {
        BrowserUtils.waitFor(3);
        return btnLoschen;
    }
    /*
    This method is used to click the first checkbox in group content.
     */
    public void clickFirstCheckBox() {
        BrowserUtils.waitFor(6);
        firstCheckboxForDelete.click();
    }
    /*
    This method is used verify whether the "Erstelle" button is disabled
     */
    public WebElement getCreateButtonDisabled() {
        BrowserUtils.waitFor(2);
        return createButtonDisabled;
    }
    /*
    It returns whether the dialog window for creating group is displayed or not
     */
    public WebElement getGroupCreateScreen() {
        BrowserUtils.waitFor(2);
        return groupCreateScreen;
    }
    /*
    This method enables us to verify whether the selected user is displayed in the field of group creating
     */
    public WebElement getSelectedMitglieder() {
        BrowserUtils.waitFor(2);
        return selectedMitglieder;
    }
    /*
    This method clicks on the selected user from the list in the group creating
     */
    public void selectedMitglieder() {
        BrowserUtils.waitForClickability(selectedMitglieder, 2);
        selectedMitglieder.click();
    }
    /*
    This method enables us to send a value to field which we want to return
     */
    public void gruppenMitgliederField(String gruppenMitgliederName) {
        BrowserUtils.waitFor(3);
        gruppenMitglieder.click();
        gruppenMitglieder.sendKeys(gruppenMitgliederName);
    }
    /*
    It clicks on "Neu" in Gruppen
     */
    public void clickHinzufügenBtn() {
        BrowserUtils.waitFor(3);
        btnHinzufugen.click();
    }

    /*
    It returns whether the button "Neu" is displayed or not.
     */
    public WebElement getBtnHinzufügen() {
        BrowserUtils.waitFor(4);
        return btnHinzufugen;
    }

    /*
    This method sends a value to the "Navigation durchsuchen"
     */
    public void writeSearchText(String searchText) {
        txtSearchbox.click();
        txtSearchbox.sendKeys(searchText);
    }

    /*
    This method is used to click "Erstellen" button in creating group
     */
    public void clickCreateButton() {
        BrowserUtils.waitFor(2);
        if (createButton.isEnabled()) {
            createButton.click();
            System.out.println("Erstellen button is enabled");
        } else {
            System.out.println("Erstellen button disabled");
        }
    }

    /*
    It clicks the "Gruppen" after you write in navigation area
     */
    public void clickGruppenBtn() {
        BrowserUtils.waitFor(2);
        if (btnGruppen.isEnabled()) {
            btnGruppen.click();
            BrowserUtils.waitForVisibility(mainMenuBar, 5);
        }
    }

    public void enterGroupName(String groupName) {
        BrowserUtils.waitForVisibility(createGroupName, 3);
        createGroupName.clear();
        createGroupName.sendKeys(groupName);
    }

    public void openBrowser(String url) {
        driver.get(url);
        BrowserUtils.waitFor(4);
    }


}
