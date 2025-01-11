package steps;

import factory.WebDriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.AlertFrameWindowsPage;
import pages.BrowserWindowsPage;
import pages.HomePage;
import pages.NewWindowsPage;

public class BrowserWindowsSteps {
    private final WebDriver driver = WebDriverFactory.getDriver();
    private final HomePage hp = new HomePage(driver);
    private final BrowserWindowsPage bw = new BrowserWindowsPage(driver);
    private final AlertFrameWindowsPage afw = new AlertFrameWindowsPage(driver);
    private final NewWindowsPage nwp = new NewWindowsPage(driver);

    @Given("entro na página inicial do site DemoQA")
    public void queEstouNaPaginaInicialDoSiteDemoQA() {
        driver.get("https://demoqa.com/");
    }
    @And("escolho a opção alerts, frames e windowns")
    public void escolhoAOpcaoAlertsFramesEWindowns() {
        hp.clickAlertFramesEWindowsMenu();
    }

    @And("navego até o submenu Browser Windows")
    public void navegoAteOSubmenuBrowserWindows() {
        afw.clickBrowserWindows();
    }

    @And("seleciono new Windows")
    public void selecionoNewWindows() {
        bw.clickBrowserWindows();
    }

    @When("verifico se foi aberta uma nova janela")
    public void verificoSeFoiAbertaUmaNocaJanela() {
        bw.changeWindow();
    }

    @And("valido a mensagem")
    public void validoAMensagem() {
        nwp.validateMessage();
    }

    @Then("fecho a nova janela")
    public void fechoANovaJanela() {
        WebDriverFactory.quitDriver();
    }

}
