package pages;


import attributes.SortableAttributes;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SortablePage {
    private WebDriver driver;

    public SortablePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = SortableAttributes.SORTABLE_SUBMENU)
    WebElement sortableSubmenu;

    @FindBy(css = SortableAttributes.SORTABLE_ITEMS)
    List<WebElement> sortableItems;


    public void clickSortableSubmenu() {
        sortableSubmenu.click();
    }

    public void reorderListInAscendingOrder() {
        Actions actions = new Actions(driver);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.withTimeout(Duration.ofSeconds(10));

        for (WebElement item : sortableItems) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", item);
        }
        for (int i = 0; i < sortableItems.size(); i++) {
            for (int j = 0; j < sortableItems.size() - i - 1; j++) {
                WebElement source = sortableItems.get(j);
                WebElement target = sortableItems.get(j + 1);
                actions.dragAndDrop(source, target).perform();
            }
        }
    }
}
