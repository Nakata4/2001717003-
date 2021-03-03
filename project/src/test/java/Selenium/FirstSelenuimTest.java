package Selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class FirstSelenuimTest {
    WebDriver driver;
    Model model;

    @BeforeEach
    void setUp() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        model = new Model(driver);
    }

    /**
     * Validates search result and the main header of the page
     */
    @Test
    public void testSeatTest() {

        final String expectedURL = "https://en.wikipedia.org/wiki/Filmi";

        model.navigateToMain();
        model.setSearchValue("");
        model.clickSearchButton();

        final String result = driver.getCurrentUrl();
        WebElement header = model.getHeaderElement();

        assertAll(
                () -> {
                    assertEquals(expectedURL, result);
                },
                () -> {
                    assertEquals("\"", header.getText());
                }
        );
    }

    /**
     * Validates that search result pahe is not empty
     */
    @Test
    public void testTicketTest() {

        model.navigateToMain();
        model.setSearchValue("");
        model.clickSearchButton();
        List<WebElement> products = model.getListWithProducts();
        assertFalse(products.isEmpty());
    }

    /**
     * Validates the first product title and price
     */
    @Test
    public void testFilm() {

        model.navigateToMain();
        model.setSearchValue("");
        model.clickSearchButton();

        List<WebElement> products = model.getListWithProducts();
        WebElement hrefFirst = products.get(0);

        driver.get(hrefFirst.getAttribute("href"));

        WebElement price = driver.findElement(By.cssSelector("#product-price span"));
        WebElement title = driver.findElement(By.cssSelector("h1.product-item-headline"));


        assertAll(
                () -> {
                    assertEquals("", title.getText());
                },
                () -> {
                    assertEquals("5$ ", price.getText());
                }
        );
    }

    /**
     * Validates that the there are products after filter has been applied
     *
     * @throws InterruptedException
     */
    @Test
    public void testLogin() throws InterruptedException {

        model.navigateToMain();
        model.setSearchValue("");
        model.clickSearchButton();

        //WebDriverWait wait = new WebDriverWait(driver, 10);
        //WebElement filterByladies = wait.until(ExpectedConditions.elementToBeClickable(By.id("dropdown-kids_all")));
        //filterByladies.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("$('#dropdown-ladies_all').trigger('click');");


        List<WebElement> productListing = driver.findElements(By.cssSelector("a.item-link"));

        assertFalse(productListing.isEmpty());
    }

    /**
     * Validates Favorites functionality
     */
    @Test
    public void testUser() {

        model.navigateToMain();
        model.setSearchValue("");
        model.clickSearchButton();

        List<WebElement> productListing = driver.findElements(By.cssSelector("a.item-link"));

        for (int i = 0; i <= 2; i++) {
            WebElement item = productListing.get(i);
            WebElement favoritesButton = item.findElement(By.cssSelector(".js-favorite"));
            favoritesButton.click();
        }

        driver.get("https://en.wikipedia.org/wiki/Filmi");
        List<WebElement> favoites = driver.findElements(By.cssSelector("ul li article"));

        assertEquals(3, favoites.size());
    }

    /**
     * Closes the connection
     */
    @AfterEach
    void tearDown() {
        driver.close();
    }

}
