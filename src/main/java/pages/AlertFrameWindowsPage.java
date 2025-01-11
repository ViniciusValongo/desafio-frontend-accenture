package pages;

import attributes.AlertFrameWindowsAttributes;
import attributes.PracticeFormAttributes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertFrameWindowsPage {

    private WebDriver driver;
    public AlertFrameWindowsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = AlertFrameWindowsAttributes.BROWSER_WINDOWS)
    WebElement browserWindowns;

    public void clickBrowserWindows() {
        browserWindowns.click();
    }

}
