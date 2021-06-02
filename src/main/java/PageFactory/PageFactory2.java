package PageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class PageFactory2 {
    public PageFactory2(RemoteWebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.TAG_NAME, using ="button")
    List<WebElement> btns;

    public void acceptCookies()
    {
        for (int i=0;i< btns.size();i++)
        {
            if(btns.get(i).getText().contains("I Accept"))
            {
                btns.get(i).click();
                break;
            }
        }
    }

    @FindBy(how = How.TAG_NAME, using = "a")
    List<WebElement> links;

    @FindBy(how = How.TAG_NAME, using = "div")
    List<WebElement> div;

    public void clk_NBAstore(){
        for (int i=0;i<div.size();i++){
            if(div.get(i).getAttribute("class").contains("nbap-nav__store-logo"))
            {
                div.get(i).click();
                break;
            }
        }
    }

    public void change_tab(RemoteWebDriver driver, int tab)
    {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tab-1));
    }

    public WebElement we_link(String word){
        WebElement ele = null;
        for (int i=0;i<links.size();i++)
        {
            if (links.get(i).getText().contains(word)) {
                ele = links.get(i);
                break;
            }
        }
        return ele;
    }

    public void clk_we(WebElement we){
        we.click();
    }

    @FindBy(how =How.TAG_NAME, using = "img")
    List<WebElement> img;

    public WebElement listProducts(int itemNo){
        List<WebElement> items = new ArrayList<>();
        for (int i=0;i<img.size();i++){
            if(img.get(i).getAttribute("class").contains("product-image stateful-image"))
            {
                items.add(img.get(i));
            }
        }
        return items.get(itemNo);
    }

    public WebElement we_btn(String intext){
        WebElement ele = null;
        for (int i=0;i<btns.size();i++){
            if(btns.get(i).getText().contains("Add"))
            {
                 ele = btns.get(i);
                 break;
            }
        }
        return ele;
    }

    @FindBy(how = How.TAG_NAME, using = "span")
    List<WebElement> span;

    public WebElement we_span(String word){
        WebElement ele =null;
        for (int i=0;i< span.size();i++)
        {
            if (span.get(i).getText().contains(word))
            {
                ele = span.get(i);
                break;
            }
        }
        return ele;
    }

    @FindBy(how = How.TAG_NAME, using = "form")
    List<WebElement> forms;

    public String shippingValidation_check(String error_id)
    {
        String error = null;
        for (int i=0;i<div.size();i++)
        {
            if(div.get(i).getAttribute("id").contains(error_id))
            {
                error = div.get(i).getText();
                break;
            }
        }
        return error;

    }

    @FindBy(how = How.TAG_NAME, using = "input")
    List<WebElement> inputs;

    public void sk_ShiipingForm(String info, String field){
        for (int i=0;i<inputs.size();i++)
        {
            if(inputs.get(i).getAttribute("field").contains(field))
            {
                System.out.println("work");
                inputs.get(i).sendKeys(info);
                inputs.get(i).sendKeys(Keys.ENTER);
                break;
            }
        }
    }

    @FindBy(how = How.TAG_NAME, using = "select")
    List<WebElement> selects;

    public WebElement we_select(String word){
        WebElement ele = null;
        for (int i=0;i<selects.size();i++)
        {
            if(selects.get(i).getAttribute("id").contains(word))
            {
                ele = selects.get(i);
                System.out.println("work");
            }
        }
        return ele;
    }
}
