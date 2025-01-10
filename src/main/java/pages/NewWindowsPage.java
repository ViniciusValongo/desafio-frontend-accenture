package pages;

import attributes.AlertFrameWindowsAttributes;
import attributes.NewWindowsAttributes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewWindowsPage {

    WebDriver driver;
    public NewWindowsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = NewWindowsAttributes.NEW_WINDOWS_OPEN)
    WebElement newWindowsOpen;

    public void validateMessage() {
        if (newWindowsOpen.getText().equals("This is a sample page")) {
            System.out.println("Mensagem validada com sucesso: " + newWindowsOpen.getText());
        } else {
            System.out.println("Mensagem não encontrada!");
        }
    }

}
