package PageFactory;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;
import java.util.List;

public class PageFactory_main {
    public PageFactory_main(RemoteWebDriver driver){ PageFactory.initElements(driver, this); }


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

    public void closeNewsletter()
    {
        for (int i=0;i< btns.size();i++)
        {
            if(btns.get(i).getAttribute("title").contains("Close"))
            {
                btns.get(i).click();
                break;
            }
        }
    }

    @FindBy( how = How.CLASS_NAME, using="nbap-nav__svg")
    WebElement NBA_siteIcon;

    public void clkNba_siteIcon(){
        NBA_siteIcon.click();
    }

    @FindBy(how = How.TAG_NAME, using = "a")
    List<WebElement> links;

    @FindBy(how = How.TAG_NAME, using = "div")
    List<WebElement> div;

    public void clk_AllStories(){
        for (int i=0;i< links.size();i++)
        {
            if(links.get(i).getText().contains("All Stories"))
            {
                links.get(i).click();
                break;
            }
        }

    }

    public void clk_1stStory(){
        for (int i=0;i<links.size();i++)
        {
            if(links.get(i).getAttribute("class").contains("card__link"))
            {
                links.get(i).click();
                break;

            }
        }
    }

    public void clk_headToHead(){
        for (int i=0;i<div.size();i++){
            if(div.get(i).getAttribute("class").contains("nbap-nav__head-to-head-logo"))
            {
               div.get(i).click();
               break;
            }
        }
    }

    public void clk_NBAstore(){
        for (int i=0;i<div.size();i++){
            if(div.get(i).getAttribute("class").contains("nbap-nav__store-logo"))
            {
                div.get(i).click();
                break;
            }
        }
    }

    public void clk_leaguePass(){
        for (int i=0;i<div.size();i++){
            if(div.get(i).getAttribute("class").contains("nbap-nav__leaguepass-logo"))
            {
                div.get(i).click();
                break;
            }
        }
    }

}
