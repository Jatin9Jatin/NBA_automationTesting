package StepDefination;

import PageFactory.PageFactory2;
import Glue.Hooks;;
import Utility.WaitTime;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static Utility.Constants.*;

public class StepDef2 {
    RemoteWebDriver driver;
    Hooks hook = new Hooks();
    PageFactory2 store;
    WaitTime wait = new WaitTime();


    @Given("^launching on homepage$")
    public void launchingOnHomepage2() {
        driver = hook.Brower();
        store = new PageFactory2(driver);
        driver.get(NBAsite);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        store.acceptCookies();
    }

    @Given("launch nba store")
    public void launchNbaStore() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        store.clk_NBAstore();
        store.change_tab(driver,2);
    }

    @When("Select a tshirt")
    public void selectATshirt() {

        System.out.println(driver.getCurrentUrl());
        WebElement ele = store.we_link("HATS");
        wait.ExecuteClickable(driver, ele);
        store.clk_we(ele);
        WebElement show_all = store.we_link("View all teams");
        wait.ExecuteClickable(driver, show_all);
        store.clk_we(show_all);
        WebElement team = store.we_link("Toronto Raptors");
        wait.ExecuteClickable(driver, team);
        store.clk_we(team);
        WebElement item = store.listProducts(0);
        store.clk_we(item);
    }

    @And("buy the item")
    public void buyTheItem() {

        driver.navigate().refresh();
        WebElement add_to_card = store.we_btn("Add");
        store.clk_we(add_to_card);
        WebElement apply = store.we_span("Apply");
        wait.ExcuteVisiblity(driver, apply);
        WebElement checkout = store.we_span("Checkout");
        store.clk_we(checkout);
        WebElement continueCheckout = store.we_span("Continue Checkout");
        store.clk_we(continueCheckout);
        Assert.assertEquals(store.shippingValidation_check("errorFirst Name"), Form_BlankError);
        Assert.assertEquals(store.shippingValidation_check("errorLast Name"), Form_BlankError);
        Assert.assertEquals(store.shippingValidation_check("errorEmail"), Form_BlankError);
        Assert.assertEquals(store.shippingValidation_check("errorPhone"), Form_BlankError);
        Assert.assertEquals(store.shippingValidation_check("errorAddress 1"), Form_BlankError);
        Assert.assertEquals(store.shippingValidation_check("errorPostal Code"), Form_BlankError);
        Assert.assertEquals(store.shippingValidation_check("errorCity"), Form_BlankError);

        store.sk_ShiipingForm("Karan", "FIRST_NAME");
        store.sk_ShiipingForm("Kumar", "LAST_NAME");
        store.sk_ShiipingForm("karankumar0078900@gmail.com", "EMAIL");
        store.sk_ShiipingForm("4-3840 av Linton ", "ADDRESS_1");
        store.sk_ShiipingForm("5146065869", "PHONE");
        // store.sk_ShiipingForm("H3S1T3", "ZIPCODE");
        // store.sk_ShiipingForm("Montreal", "CITY");

        Select province = new Select(store.we_select("state"));
        province.selectByVisibleText("Quebec");
        store.clk_we(continueCheckout);
    }

    //t2

    @Given("^launching on nba homepage$")
    public void launchingOnNbaHomepage2() {
        driver = hook.Brower();
        store = new PageFactory2(driver);
        driver.get(NBAsite);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        store.acceptCookies();

    }

    @Given("landing on nba store")
    public void launchOnNbaStore() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        store.clk_NBAstore();
        store.change_tab(driver,2);
    }

    @When("Select a item from product listing")
    public void selectAItemFromProductListing() {

        System.out.println(driver.getCurrentUrl());
        WebElement ele = store.we_link("HATS");
        wait.ExecuteClickable(driver, ele);
        store.clk_we(ele);
        WebElement show_all = store.we_link("View all teams");
        wait.ExecuteClickable(driver, show_all);
        store.clk_we(show_all);
        WebElement team = store.we_link("Toronto Raptors");
        wait.ExecuteClickable(driver, team);
        store.clk_we(team);
        WebElement item = store.listProducts(0);
        store.clk_we(item);
    }

    @And("buy the selected item in the cart")
    public void buyTheSelectedItemInTheCart() {

        driver.navigate().refresh();
        WebElement add_to_card = store.we_btn("Add");
        store.clk_we(add_to_card);
        WebElement apply = store.we_span("Apply");
        wait.ExcuteVisiblity(driver, apply);
        WebElement checkout = store.we_span("Checkout");
        store.clk_we(checkout);
        WebElement continueCheckout = store.we_span("Continue Checkout");
        store.clk_we(continueCheckout);
        Assert.assertEquals(store.shippingValidation_check("errorFirst Name"), Form_BlankError);
        Assert.assertEquals(store.shippingValidation_check("errorLast Name"), Form_BlankError);
        Assert.assertEquals(store.shippingValidation_check("errorEmail"), Form_BlankError);
        Assert.assertEquals(store.shippingValidation_check("errorPhone"), Form_BlankError);
        Assert.assertEquals(store.shippingValidation_check("errorAddress 1"), Form_BlankError);
        Assert.assertEquals(store.shippingValidation_check("errorPostal Code"), Form_BlankError);
        Assert.assertEquals(store.shippingValidation_check("errorCity"), Form_BlankError);
    }

    @Then("validating and closing the browser")
    public void validatingAndClosingTheBrowser() {
        System.out.println("Test Passed, Done");
        driver.quit();
    }

  //current




    //practice

    @Given("reaching last checkpoint")
    public void reachingLastCheckpoint() {
        driver = hook.Brower();
        store = new PageFactory2(driver);
        driver.get("https://www.nbastore.ca/toronto-raptors/mens-new-era-black-toronto-raptors-official-team-color-9fifty-snapback-adjustable-hat/t-92368673+p-030479910273+z-8-995137264?_ref=p-DLP:m-GRID:i-r0c1:po-1");

    }

    @When("current test")
    public void currentTest() throws InterruptedException {
        driver.navigate().refresh();
        WebElement add_to_card = store.we_btn("Add");
        store.clk_we(add_to_card);
        Thread.sleep(2000);
        WebElement checkout = store.we_span("Checkout");
        store.clk_we(checkout);
        WebElement continueCheckout = store.we_span("Continue Checkout");
        store.clk_we(continueCheckout);
        Assert.assertEquals(store.shippingValidation_check("errorFirst Name"), Form_BlankError);
        Assert.assertEquals(store.shippingValidation_check("errorLast Name"), Form_BlankError);
        Assert.assertEquals(store.shippingValidation_check("errorEmail"), Form_BlankError);
        Assert.assertEquals(store.shippingValidation_check("errorPhone"), Form_BlankError);
        Assert.assertEquals(store.shippingValidation_check("errorAddress 1"), Form_BlankError);
        Assert.assertEquals(store.shippingValidation_check("errorPostal Code"), Form_BlankError);
        Assert.assertEquals(store.shippingValidation_check("errorCity"), Form_BlankError);

        store.sk_ShiipingForm("Karan", "FIRST_NAME");
        store.sk_ShiipingForm("Kumar", "LAST_NAME");
        store.sk_ShiipingForm("karankumar0078900@gmail.com", "EMAIL");
        store.sk_ShiipingForm("4-3840 av Linton ", "ADDRESS_1");
        store.sk_ShiipingForm("5146065869", "PHONE");
       // store.sk_ShiipingForm("H3S1T3", "ZIPCODE");
       // store.sk_ShiipingForm("Montreal", "CITY");

        Select province = new Select(store.we_select("state"));
        province.selectByVisibleText("Quebec");
        store.clk_we(continueCheckout);

    }

    //T3

    @When("^open story number (.*?) and copying link$")
    public void openStoryNumberAndCopyingLink(int num) {
        store.closeNewsletter();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        store.clk_we(store.we_link("All Stories"));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        store.clk_we(store.we_article(num));

    }

    //T3

    @And("open TV broardcast tab")
    public void openTVBroardcastTab() {
        store.closeNewsletter();
        store.clk_we(store.we_link("Schedule"));
    }

    @When("^Select team (.*?)$")
    public void selectTeam(String team) {
        store.clk_we(store.we_span("Select Team"));
        store.clk_we(store.we_span(team));

    }

    @And("^Select date (.*?)$")
    public void selectDate(String date) {
        store.gameScore_date(date);
    }
}
