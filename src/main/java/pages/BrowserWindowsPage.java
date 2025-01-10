package pages;

import attributes.AlertFrameWindowsAttributes;
import attributes.BrowserWindowsAttributes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrowserWindowsPage {

    WebDriver driver;
    public BrowserWindowsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = BrowserWindowsAttributes.NEW_WINDOWS)
    WebElement newWindow;

    public void clickBrowserWindows() {
        newWindow.click();
    }
    public void changeWindow(){
        String mainWindowHandle = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(mainWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }

}
