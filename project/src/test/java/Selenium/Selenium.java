  
package Selenium;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.Test;
import org.junit.jupiter.api.RepeatedTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selenium {

    //== constants ==
    private static final String ADDRESS = "https://en.wikipedia.org/wiki/Filmi";


    //== fields ==
    private final WebDriver driver;

    @FindBy(id = "search")
    WebElement searchFormInputField;

    @FindBy(name = "submit")
    WebElement searchFormSubmitElement;
    //== constructors ==
    public Selenium(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //== public methods ==
    public void navigateToPuPage() {
        this.driver.get(ADDRESS);
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
    @Test                                                 
    public void LoginTest() { 
    	//define the url
    			driver.get("https://en.wikipedia.org/wiki/Filmi");	
    			
    	                             //maximize the window
    			driver.manage().window().maximize();
    			
    	                             //delete the cookies saved
    			driver.manage().deleteAllCookies();			
    			
    			//get the title of the webpage
    			String pageTitle = driver.getTitle();							 
    			System.out.println("The title of this page is ===> " +pageTitle);
    								
    			//enter the locator of username and clear the input field before entering any value
    			driver.findElement(By.id("txtUsername")).clear();	

    	                              //enter the username			
    			driver.findElement(By.id("txtUsername")).sendKeys("Admin");		
    			
    			//enter the locator of password and clear the input field
    			driver.findElement(By.id("txtPassword")).clear();
    			
    			//enter the value of password
    			driver.findElement(By.id("txtPassword")).sendKeys("admin123");		 			
    			
    			//enter the locator of login button and click
    			driver.findElement(By.id("btnLogin")).click();   			  			
    				
    	        //search an employee by providing the name,role and status
    	        driver.findElement(By.linkText("Admin")).click();
    				
    	        driver.findElement(By.xpath("//input[@id = 'searchSystemUser_userName']")).clear();
    	         driver.findElement(By.xpath("//input[@id = 'searchSystemUser_userName']")).sendKeys("Chris Evans");
    				
    	}  
    @Test
    public void demo() {
        WebDriver driver = RunEnvironment.getWebDriver();
        driver.get("https://en.wikipedia.org/wiki/Filmi");
        String homeUrl = driver.findElement(By.cssSelector("div#logo> a#logo_image ")).getAttribute("href");
        assertEquals(homeUrl, "https://en.wikipedia.org/wiki/Filmi");
    }
    			
    		@AfterClass
    		public void tearDown() {
    		driver.quit();
    			}		
   	  }
 



