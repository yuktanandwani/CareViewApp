package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

    /*
    This Class contains Locators for LoginPage.
    */
   public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver=driver;
    }
    // Locator for Username
    By userName = By.id("txtUsername");
    // Locator for Password
    By password = By.id("txtPassword");
    By login = By.id("btnLogin");
    public WebElement getUserName() {
        return driver.findElement(userName);
    }
    public WebElement getPassword() {
        return driver.findElement(password);
    }
    public WebElement loginButton() {
        return driver.findElement(login);
    }
}
