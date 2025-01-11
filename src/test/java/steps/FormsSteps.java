package steps;

import factory.WebDriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.FormsPage;
import pages.HomePage;
import pages.PracticeFormPage;

public class FormsSteps {

    WebDriver driver = WebDriverFactory.getDriver("chrome");
    private final HomePage homePage = new HomePage(driver);
    private final FormsPage formsPage = new FormsPage(driver);
    private final PracticeFormPage practiceFormPage = new PracticeFormPage(driver);


    @Given("logo na página inicial do site DemoQA")
    public void queEstouNaPaginaInicialDoSiteDemoQA() {
        driver.get("https://demoqa.com/");
    }

    @When("eu navego até o submenu Practice Form em Forms")
    public void euNavegoAteOSubmenuPracticeFormEmForms() {
        homePage.clickFormsMenu();
        formsPage.clickPracticeFormSubmenu();
    }

    @When("preencho o formulário com valores aleatórios e faço o upload de um arquivo")
    public void preenchoOFormularioComValoresAleatoriosEFacoOUploadDeUmArquivo() {
        practiceFormPage.fillForm();
    }

    @When("submeto o formulário")
    public void submetoOFormulario() {
        practiceFormPage.submitForm();
    }

    @Then("um popup é exibido após o envio")
    public void umPopupEExibidoAposOEnvio() {
        assert practiceFormPage.isPopupDisplayed();
    }

    @Then("fecho o popup")
    public void fechoOPopup() {
        practiceFormPage.closePopup();
        driver.quit();
    }


}
