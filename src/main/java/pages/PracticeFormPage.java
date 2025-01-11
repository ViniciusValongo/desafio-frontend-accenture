package pages;

import attributes.PracticeFormAttributes;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.nio.file.Paths;

public class PracticeFormPage {
    private WebDriver driver;
    Actions actions = new Actions(driver);

    @FindBy(css = PracticeFormAttributes.FIRST_NAME_INPUT)
    WebElement firstNameInput;

    @FindBy(css = PracticeFormAttributes.LAST_NAME_INPUT)
    WebElement lastNameInput;

    @FindBy(css = PracticeFormAttributes.EMAIL_INPUT)
    WebElement emailInput;

    @FindBy(css = PracticeFormAttributes.GENDER_MALE_RADIO)
    WebElement genderMaleRadio;

    @FindBy(css = PracticeFormAttributes.PHONE_INPUT)
    WebElement phoneInput;


    @FindBy(css = PracticeFormAttributes.FILE_UPLOAD_INPUT)
    WebElement fileUploadInput;

    @FindBy(css = PracticeFormAttributes.CURRENT_ADDRESS_INPUT)
    WebElement currentAddressInput;

    @FindBy(css = PracticeFormAttributes.SUBMIT_BUTTON)
    WebElement submitButton;

    @FindBy(id = PracticeFormAttributes.POPUP)
    WebElement popup;

    public PracticeFormPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillForm() {
        firstNameInput.sendKeys("John");
        lastNameInput.sendKeys("Doe");
        emailInput.sendKeys("john.doe@example.com");
        genderMaleRadio.click();
        phoneInput.sendKeys("1234567890");



        actions.sendKeys(Keys.PAGE_DOWN).perform();


        String relativePath = "src/test/resources/uploads/testfile.txt";
        String absolutePath = Paths.get(relativePath).toAbsolutePath().toString();
        fileUploadInput.sendKeys(absolutePath);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        currentAddressInput.sendKeys("123 Main St, Anytown, USA");

    }

    public void submitForm() {
        submitButton.click();
    }

    public boolean isPopupDisplayed() {
        return popup.isDisplayed();
    }

    public void closePopup() {
        popup.click();
    }
}
