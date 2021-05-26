package StepDefination;


import Glue.Hooks;
import PageFactory.PageFactory_main;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import static Utility.Constants.NBAsite;

public class StepDef {
    public PageFactory_main pagefactory;
    public RemoteWebDriver driver;
    Hooks hook = new Hooks();

    @Given("launching NBA site")
    public void launching_NBA_site() {
        driver = hook.Brower();
        pagefactory = new PageFactory_main(driver);
        driver.get(NBAsite);

    }

    @When("test")
    public void test() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("finish")
    public void finish() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
