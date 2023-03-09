package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

/*
TestBase Class for Drivers instantiation
*/
public class TestBase {
    protected WebDriver driver;
    public WebDriver getDriver(){
        if (driver == null){
            String path = System.getProperty("user.dir");
            System.setProperty("webdriver.chrome.driver", path + "\\drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            return driver;
        } else {
            return driver;
        }
    }

}



