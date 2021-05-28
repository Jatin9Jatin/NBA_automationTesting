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
            }
        }
    }

    @FindBy( how = How.CLASS_NAME, using="nbap-nav__svg")
    WebElement NBA_siteIcon;

    public void clkNba_siteIcon(){
        NBA_siteIcon.click();
    }




}
