package StepDefination;


import Glue.Hooks;
import PageFactory.PageFactory_main;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

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
    public void cookiesAccepted() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        home.acceptCookies();
    }

    @And("close newsletter")
    public void closeNewsletter() throws InterruptedException {
        Thread.sleep(500);
        home.closeNewsletter();
    }

    @When("NBA top-left icon clicked")
    public void nba_top_left_icon_clicked() throws InterruptedException {
        Thread.sleep(2000);
        home.clkNba_siteIcon();
        Assert.assertEquals(driver.getCurrentUrl(),NBAcaURL);

    }

    @Then("^finish$")
    public void finish() {
        System.out.println("Test Passed, Done");
    }

    //T2

    @When("launching first story in all stories")
    public void launchingFirstStoryInAllStories() throws InterruptedException {
        Thread.sleep(1000);
        home.clk_AllStories();
        Thread.sleep(1000);
        home.clk_1stStory();
    }

    //T3

    @Given("^Getting on homepage$")
    public void gettingOnHomepage() throws InterruptedException {
        driver = hook.Brower();
        home = new PageFactory_main(driver);
        driver.get(NBAsite);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        home.acceptCookies();
        Thread.sleep(500);
        home.closeNewsletter();
    }

    @When("opening head to head")
    public void openingHeadToHead() throws InterruptedException {
        Thread.sleep(2000);
        home.clk_headToHead();
        Thread.sleep(2000);
        ArrayList<String> tab2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tab2.get(0));
    }

    //T4

    @When("opening nba store")
    public void openingNbaStore() throws InterruptedException {
        Thread.sleep(2000);
        home.clk_NBAstore();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
    }

    //T5

    @When("launching league pass")
    public void launchingLeaguePass() throws InterruptedException {
        Thread.sleep(2000);
        home.clk_leaguePass();
    }

    //T6

    @When("Changing language to french")
    public void changingLanguageToFrench() throws InterruptedException {
        Thread.sleep(1000);
        home.changeLangFrench();
    }

    @And("getting back to previous page")
    public void gettingBackToPreviousPage() throws InterruptedException {
        Thread.sleep(3000);
        driver.navigate().back();
        driver.navigate().refresh();
    }

    //T7


    @When("^Select state (.*?)$")
    public void selectStateTeam(String team) {
        Actions builder = new Actions(driver);
        builder.moveToElement(home.ele_inTextLink("Teams")).build().perform();
        home.clik_HPdropdownLinks(team);
    }

    @And("closing previous tab")
    public void closingPreviousTab() {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        driver.close();
    }

    //T8

    @When("^Choose (.*?)$")
    public void chooseCountry(String country) throws InterruptedException {
        Actions builder = new Actions(driver);
        builder.moveToElement(home.ele_inTextLink("Global")).build().perform();
        Thread.sleep(500);
        home.clik_HPdropdownLinks(country);
    }


    //T9

    @When("open team list")
    public void openTeamList(){
        home.clk_Teams();
    }


}
