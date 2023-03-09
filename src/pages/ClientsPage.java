package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

    /*
    This Class contains Locators for ClientPage.
    */
    public class ClientsPage {
    WebDriver driver;
    public ClientsPage(WebDriver driver) {
        this.driver=driver;
    }
    // Locator for CRM Link
    By crmLink = By.xpath("//*[@id=\"side-menu\"]/li/a/span");
    // Locator for Client Link
    By clientLink = By.xpath("//*[@id=\"client_menu\"]/a");
    By createNewClientLink = By.xpath("//*[@id=\"clients\"]/div[1]/div/div[1]/table/tbody/tr/td[1]/a");
    By firstName = By.id("firstName");
    By lastName = By.id("lastName");
    By gender = By.name("Gender");
    By type = By.name("Type");
    By dateField = By.id("dob");
    By address = By.id("address1");
    By suburb = By.id("suburb");
    By state = By.name("State");
    By postCode = By.name("PostCode");
    By saveNewClient = By.id("btnSaveNewClient");
    By searchBox = By.xpath("//*[@id=\"clients\"]/div[1]/div/div[3]/div/button/div/div/div");
    By searchQuery = By.xpath("//*[@id=\"clients\"]/div[1]/div/div[3]/div/div/div[1]/input");
    By inputText = By.xpath("//*[@id=\"clients\"]/div[1]/div/div[3]/div/div/div[1]/input");
    By searchResults = By.xpath("//*[@id=\"bs-select-1-0\"]");
    By clientDetailsFirstNameLink = By.xpath("//*[@id=\"tableData\"]/tbody/tr[1]/td[2]/a");
    By clientsDetailsFirstName = By.xpath("//*[@id=\"page-wrapper\"]/div/div[1]/div[1]/h1");
    public WebElement getCrmLink() {
        return driver.findElement(crmLink);
    }
    public WebElement getClientLink() {
        return driver.findElement(clientLink);
    }
    public WebElement getCreateNewClientLink() {
        return driver.findElement(createNewClientLink);
    }
    public WebElement getFirstName() {
        return driver.findElement(firstName);
    }
    public WebElement getLastName() {
        return driver.findElement(lastName);
    }
    public WebElement getGender() {
        return driver.findElement(gender);
    }
    public WebElement getType() {
        return driver.findElement(type);
    }
    public WebElement getDateField() {
        return driver.findElement(dateField);
    }
    public WebElement getAddress() {
        return driver.findElement(address);
    }
    public WebElement getSuburb() {
        return driver.findElement(suburb);
    }
    public WebElement getState() {
        return driver.findElement(state);
    }
    public WebElement getPostCode() {
        return driver.findElement(postCode);
    }
    public WebElement getSearchBox() {
        return driver.findElement(searchBox);
    }
    public WebElement getSearchQuery() {
        return driver.findElement(searchQuery);
    }
    public WebElement getInputBox() {
        return driver.findElement(inputText);
    }
    public WebElement getSaveNewClient() {
        return driver.findElement(saveNewClient);
    }
    public WebElement getSearchResults() {
        return driver.findElement(searchResults);
    }
    public WebElement getClientDetailsFirstNameLink() {
        return driver.findElement(clientDetailsFirstNameLink);
    }
    public WebElement getClientsDetailsFirstName() {
        return driver.findElement(clientsDetailsFirstName);
    }
}

