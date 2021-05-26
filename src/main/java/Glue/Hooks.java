package Glue;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Hooks {
    public RemoteWebDriver driver;

    public RemoteWebDriver Brower(){
        DesiredCapabilities desire1 = new DesiredCapabilities();


        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        System.out.println(System.getProperty("browser name"));
        driver= new ChromeDriver(desire1);
        driver.manage().window().maximize();
        return driver;
    }
}
