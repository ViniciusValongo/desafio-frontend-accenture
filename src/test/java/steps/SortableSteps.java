package steps;

import factory.WebDriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.SortablePage;

public class SortableSteps {
    WebDriver driver;
    HomePage homePage;
    SortablePage sortablePage;

    @Given("que estou na página inicial do site DemoQA")
    public void queEstouNaPaginaInicialDoSiteDemoQA() {
        driver = WebDriverFactory.getDriver();
        driver.get("https://demoqa.com/");
        homePage = new HomePage(driver);
    }

    @When("eu navego até o submenu Sortable em Interactions")
    public void euNavegoAteOSubmenuSortableEmInteractions() {
        sortablePage = new SortablePage(driver);
        sortablePage.clickSortableSubmenu();
    }

    @Then("eu organizo os elementos na lista em ordem crescente")
    public void euOrganizoOsElementosNaListaEmOrdemCrescente() throws InterruptedException {
        sortablePage.reorderListInAscendingOrder();
        WebDriverFactory.quitDriver();
    }


}
