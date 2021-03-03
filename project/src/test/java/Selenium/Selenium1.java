  
package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selenium1 {

    //== constants ==
    private static final String PU_ADDRESS = "https://en.wikipedia.org/wiki/Filmi";


    //== fields ==
    private final WebDriver driver;

    @FindBy(id = "search")
    WebElement searchFormInputField;

    @FindBy(name = "submit")
    WebElement searchFormSubmitElement;
    //== constructors ==
    public Selenium1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //== public methods ==
    public void navigateToPuPage() {
        this.driver.get(PU_ADDRESS);
    }


    public void setSearchValue(String searchValue) {
        this.searchFormInputField.clear();
        this.searchFormInputField.sendKeys(searchValue);
    }

    public void submitSearchForm() {
        this.searchFormSubmitElement.click();
    }

    public String getPageTittle() {
        return this.driver.getTitle();
    }

    public WebElement findElementById(String elementId) {
        return this.driver.findElement(By.id(elementId));
    }



}
