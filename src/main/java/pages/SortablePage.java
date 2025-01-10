package pages;


import attributes.SortableAttributes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SortablePage {

    WebDriver driver;

    @FindBy(xpath = SortableAttributes.SORTABLE_SUBMENU)
    WebElement sortableSubmenu;

    @FindBy(css = SortableAttributes.SORTABLE_ITEMS)
    List<WebElement> sortableItems;

    public SortablePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickSortableSubmenu() {
        sortableSubmenu.click();
    }

    public void reorderListInAscendingOrder() {
        Actions actions = new Actions(driver);

        for (int i = 0; i < sortableItems.size(); i++) {
            for (int j = 0; j < sortableItems.size() - i - 1; j++) {
                WebElement source = sortableItems.get(j + 1);
                WebElement target = sortableItems.get(j);
                actions.dragAndDrop(source, target).perform();
            }
        }
    }
}
