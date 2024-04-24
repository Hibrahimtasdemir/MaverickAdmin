package CommonMethods.pages;

import CommonMethods.pagefactory.Base;
import CommonMethods.utils.BrowserUtils;
import CommonMethods.utils.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.support.FindBy;

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
    @FindBy(css = ".Toastify")
    private WebElement notificationPanel;
    @FindBy(xpath = "//i[@data-icon-name='Filter']")
    private WebElement filterIcon;
    @FindBy(css = "input.ms-TextField-field")
    private WebElement stichwortFilternArea;

    public void stichwortFilternField(String groupName) {
        BrowserUtils.waitFor(5);
        stichwortFilternArea.sendKeys(groupName);
       // JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("arguments[0].value='GroupTest';", stichwortFilternArea);

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
            BrowserUtils.waitForVisibility(mainMenuBar, 10);
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
