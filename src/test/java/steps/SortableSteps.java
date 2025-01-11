package steps;

import factory.WebDriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.SortablePage;

public class SortableSteps {
    private final WebDriver driver = WebDriverFactory.getDriver();
    private final HomePage hp = new HomePage(driver);
    private final SortablePage sp = new SortablePage(driver);

    @Given("que estou na página inicial do site DemoQA")
    public void queEstouNaPaginaInicialDoSiteDemoQA() {
        driver.get("https://demoqa.com/");
    }

    @When("eu navego até o submenu Sortable em Interactions")
    public void euNavegoAteOSubmenuSortableEmInteractions() {
        hp.clickInteractionsMenu();
        sp.clickSortableSubmenu();
    }

    @Then("eu organizo os elementos na lista em ordem crescente")
    public void euOrganizoOsElementosNaListaEmOrdemCrescente() {
        sp.reorderListInAscendingOrder();

    }


}
