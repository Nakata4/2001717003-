package project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginTest {
	
		public WebDriver driver;

			
		@Before
		public void setUp() {
			System.setProperty("webdriver.chrome.driver", "\"https://en.wikipedia.org/wiki/Filmi\"");
			driver = new ChromeDriver();  
		}
		
		
		@org.junit.Test
		public void LoginTest() throws IOException {
                          
		//define the url
		driver.get("https://en.wikipedia.org/wiki/Filmi");	
		
                             //maximize the window
		driver.manage().window().maximize();
		
                             //delete the cookies saved
		driver.manage().deleteAllCookies();

                             
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
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
		
                             //downcast the driver to access TakesScreenshot method
		TakesScreenshot ts = (TakesScreenshot)driver;

                             //capture screenshot as output type FILE
		File file = ts.getScreenshotAs(OutputType.FILE);
		
		//save the screenshot taken in destination path
		FileUtils.copyFile(file, new File("./ScreenShot_Folder/Test1_Login.png"));
		System.out.println("the login page screenshot is taken");
		
		
		//enter the locator of login button and click
		driver.findElement(By.id("btnLogin")).click();
		
			
			
         //wait for the page to load
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			
        //search an employee by providing the name,role and status
        driver.findElement(By.linkText("Admin")).click();
			
        driver.findElement(By.xpath("//input[@id = 'searchSystemUser_userName']")).clear();
         driver.findElement(By.xpath("//input[@id = 'searchSystemUser_userName']")).sendKeys("Chris Evans");
			
        Select selectRole = new Select(driver.findElement(By.id("searchSystemUser_userType")));
        selectRole.selectByVisibleText("Admin");
        driver.findElement(By.id("searchSystemUser_employeeName_empName")).clear();
        driver.findElement(By.id("searchSystemUser_employeeName_empName")).sendKeys("Test 1");
			
        Select selectStatus = new Select (driver.findElement(By.id("searchSystemUser_status")));
        selectStatus.selectByVisibleText("Enabled");
        driver.findElement(By.id("searchBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
       TakesScreenshot ts1 = (TakesScreenshot)driver;
       File file1 = ts.getScreenshotAs(OutputType.FILE);
			
       FileUtils.copyFile(file1, new File("./ScreenShot_Folder/Test2_SearchUser.png"));
	System.out.println("the userStatus screenshot is taken");
			
}
		
	@After
	public void tearDown() {
	driver.quit();
		}		
}

