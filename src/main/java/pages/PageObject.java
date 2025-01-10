package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;




public class PageObject {

    private final WebDriver driver;

    public PageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarSite(String url) {
        driver.get(url);

    }

    public void enter() {
        Actions act = new Actions(driver);
        act.sendKeys(Keys.ENTER).build().perform();
    }
}
