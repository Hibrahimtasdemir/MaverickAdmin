package CommonMethods.pages;

import CommonMethods.pagefactory.Base;
import CommonMethods.utils.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static CommonMethods.pagefactory.Annotations.driver;

public class GruppenPage extends Base {

    /*
    The locator for "Hinzufügen" and "+Neu" for adding
     */
    @FindBy(xpath = "//button[@title='Hinzufügen']")
    private WebElement btnHinzufugen;
    @FindBy(xpath = "//span[text()='Erstellen']")
    private WebElement createGroupScreen;
    @FindBy(css = "#commandBarContainer")
    private WebElement mainMenuBar;
    @FindBy(css = "#SearchBox17")
    private WebElement txtSearchbox;
    @FindBy(css = ".highlighted.highlighted-211")
    private WebElement btnGruppen;
    @FindBy(xpath = "(//input[@type='text'])[1]")
    private WebElement createGroupName;
    @FindBy(xpath = "//span[text()='Erstellen']")
    private WebElement btnErstellen;
    @FindBy(xpath = "//input[@role='combobox']")
    private WebElement gruppenMitglieder;
    @FindBy(xpath = "(//span[text()='A365T_REGZ'])[1]")
    private WebElement selectedMitglieder;
    public WebElement getBtnHinzufügen() {
        BrowserUtils.waitFor(4);
        return btnHinzufugen;
    }
    public WebElement getSelectedMitglieder() {
        return selectedMitglieder;
    }
    public void selectedMitglieder(){
        BrowserUtils.waitForClickability(selectedMitglieder, 2);
        selectedMitglieder.click();
    }
    public void gruppenMitgliederField(String gruppenMitgliederName){
        BrowserUtils.waitFor(3);
        gruppenMitglieder.click();
        gruppenMitglieder.sendKeys(gruppenMitgliederName);

    }
    public void clickHinzufügenBtn (){
        btnHinzufugen.click();
        BrowserUtils.waitFor(3);
    }

    public WebElement getCreateGroupScreen() {
        return createGroupScreen;
    }

    public void writeSearchText(String searchText) {
        txtSearchbox.click();
        txtSearchbox.sendKeys(searchText);
    }
    public void clickErstellenBtn(){
        BrowserUtils.waitFor(2);
        if (btnErstellen.isEnabled()){
            btnErstellen.click();
            System.out.println("Erstellen button is enabled");
        }else {
            System.out.println("Erstellen button disabled");
        }
    }
    public void clickGruppenBtn() {
        BrowserUtils.waitFor(2);
        if (btnGruppen.isEnabled()) {
            btnGruppen.click();
            BrowserUtils.waitForVisibility(mainMenuBar, 10);
        }
    }

    public void enterGroupName(String searchText) {
        createGroupName.click();
        BrowserUtils.waitForVisibility(createGroupName, 3);
        createGroupName.sendKeys(searchText);
    }

    public void openBrowser(String url){
        driver.get(url);
        BrowserUtils.waitFor(4);
    }
}
