package pages;

import attributes.FormsAttributes;
import attributes.HomeAttributes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    HomeAttributes hp = new HomeAttributes();
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = HomeAttributes.INTERACTIONS_MENU)
    WebElement interactionsMenu;

    public void clickInteractionsMenu() {
        interactionsMenu.click();
    }


    @FindBy(xpath = HomeAttributes.FORMS_MENU)
    WebElement formsMenu;

    public void clickFormsMenu() {
        formsMenu.click();
    }

    @FindBy(xpath = HomeAttributes.ALERTS_FRAMES_WINDOWS_MENU)
    WebElement alertFramesWindowns;

    public void clickAlertFramesEWindowsMenu() {
        alertFramesWindowns.click();
    }


}
