package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Model {

    private WebDriver driver;

    @FindBy(id = "main-search")
    WebElement searchInput;

    @FindBy(className = "menu__search_submit")
    WebElement searchButton;

    @FindBy(className = "products-listing")
    WebElement productListing;

    /**
     * Constructor Model
     *
     * @param driver
     */
    public Model(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Navivate main
     */
    public void navigateToMain() {
        driver.get("https://en.wikipedia.org/wiki/Filmi");
    }

    /**
     * String 
     *
     * @param searchValue String
     */
    public void setSearchValue(String searchValue) {
        searchInput.clear();
        searchInput.sendKeys(searchValue);
    }

    /**
     * Send click
     */
    public void clickSearchButton() {
        searchButton.click();
    }

    /**
     * Search
     *
     * @return WebElement 
     */
    public WebElement getHeaderElement() {
        return driver.findElement(By.tagName("h1"));
    }

    /**
     * Searches 
     *
     * @return List with WebElement objects
     */
    public List<WebElement> getListWithProducts() {
        return productListing.findElements(By.className("item-link"));
    }
}
