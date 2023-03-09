package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.ClientsPage;
import pages.LoginPage;
import java.util.concurrent.TimeUnit;

    /*
     This Test Class contains Automation Assessment - Careview
     */
    public class NewClientTest {
        WebDriver driver;
        @BeforeClass
        public void setUp() {
                String path = System.getProperty("user.dir");
                System.setProperty("webdriver.chrome.driver", path + "\\drivers\\chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        }
     /*
     Below Method performs following steps -
     1. Login to the website
     2. Navigate to CRM→ Clients
     3. Create a new Client
     4. After creating a new client verifying - you can search for the client in the CRM→ Clients screen by Name
     */
    @Test(description = "This Test Case creates new Client and verifies it")
    public void loginAndCreateNewClient() throws InterruptedException {

        driver.get("https://webapp-ae-automation-dev.azurewebsites.net/login");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        LoginPage loginPage = new LoginPage(driver);
        ClientsPage clientsPage = new ClientsPage(driver);

        WebElement userName = loginPage.getUserName();
        WebElement password = loginPage.getPassword();
        WebElement loginButton = loginPage.loginButton();

        userName.sendKeys("arun.kumar@careviewapp.com");
        password.sendKeys("Demo1234@");
        loginButton.click();
        clientsPage.getCrmLink().click();
        clientsPage.getClientLink().click();
        clientsPage.getCreateNewClientLink().click();

        clientsPage.getFirstName().sendKeys("Barack");
        clientsPage.getLastName().sendKeys("Obama");

        Select drpCountry = new Select(clientsPage.getGender());
        drpCountry.selectByVisibleText("Female");

        Select gender = new Select(clientsPage.getType());
        gender.selectByVisibleText("Client");

        WebElement dateField = clientsPage.getDateField();
        dateField.sendKeys("12/09/2022");

        WebElement Address = clientsPage.getAddress();
        Address.sendKeys("27 Whitehaven Crescent");

        WebElement Suburb = clientsPage.getSuburb();
        Suburb.sendKeys("Woolloongabba");

        Select state = new Select(clientsPage.getState());
        state.selectByVisibleText("QLD");

        clientsPage.getPostCode().sendKeys("4000");
        clientsPage.getSaveNewClient().click();
        clientsPage.getSearchBox().click();
        clientsPage.getSearchQuery().sendKeys("Barack");
        clientsPage.getInputBox().sendKeys(Keys.ENTER);
        clientsPage.getSearchResults().click();
        clientsPage.getClientDetailsFirstNameLink().click();
        String usernameText = clientsPage.getClientsDetailsFirstName().getText();
        Assert.assertEquals("Barack Obama", usernameText, "Both are not equal");
    }
        @AfterClass
        public void tearDown() {
            driver.quit();
        }
}

