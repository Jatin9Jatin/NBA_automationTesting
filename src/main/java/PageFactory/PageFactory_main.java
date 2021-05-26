package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageFactory_main {
    public PageFactory_main(RemoteWebDriver driver){ PageFactory.initElements(driver, this); }


}
