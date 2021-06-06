package StepDefination;

import PageFactory.PageFactory2;
import Glue.Hooks;;
import Utility.WaitTime;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
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

    @When("Select a hat")
    public void selectAHat() {

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
    }



  //current




    //practice

    @Given("reaching last checkpoint")
    public void reachingLastCheckpoint() {
        driver = hook.Brower();
        store = new PageFactory2(driver);
        driver.get("https://www.nbastore.ca/toronto-raptors/mens-new-era-black-toronto-raptors-official-team-color-9fifty-adjustable-snapback-hat/t-14927562+p-5805523872193+z-9-638360131?_ref=p-DLP:m-GRID:i-r0c0:po-0");

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
}
