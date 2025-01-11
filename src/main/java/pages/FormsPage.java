package pages;

import attributes.BrowserWindowsAttributes;
import attributes.FormsAttributes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormsPage {
    private WebDriver driver;

    public FormsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = FormsAttributes.PRACTICE_FORM_SUBMENU)
    WebElement practiceFormSubbmenu;

    public void clickPracticeFormSubmenu() {
        practiceFormSubbmenu.click();
    }

}
