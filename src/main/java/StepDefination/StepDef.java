package StepDefination;


import Glue.Hooks;
import PageFactory.PageFactory_main;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import static Utility.Constants.*;

public class StepDef {
    public PageFactory_main home;
    public RemoteWebDriver driver;
    Hooks hook = new Hooks();

    @Given("launching NBA site")
    public void launching_NBA_site() {
        driver = hook.Brower();
        home = new PageFactory_main(driver);
        driver.get(NBAsite);

    }

    @When("cookies accepted")
    public void cookiesAccepted() throws InterruptedException {
        Thread.sleep(1000);
        home.acceptCookies();
    }

    @And("close newsletter")
    public void closeNewsletter() throws InterruptedException {
        Thread.sleep(2000);
        home.closeNewsletter();
    }

    @When("NBA top-left icon clicked")
    public void nba_top_left_icon_clicked() throws InterruptedException {
        Thread.sleep(2000);
        home.clkNba_siteIcon();
        Assert.assertEquals(driver.getCurrentUrl(),NBAcaURL);

    }

    @Then("finish")
    public void finish() {
        System.out.println("Test Passed, Done");
    }

    //T2

    @When("lauching first story in all stories")
    public void lauchingFirstStoryInAllStories() {
    }
}
