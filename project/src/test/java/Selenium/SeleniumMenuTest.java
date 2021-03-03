package Selenium;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Selenium.SdiPageModel;

public class SeleniumMenuTest {
	
	/**
	 * Instance of WebDriver class 
	 */
	WebDriver driver;
	
	/**
	 * Instance of SdiPageModel class
	 */
	SdiPageModel sdiPageModel;
	
	/**
	 * Set chrome driver path
	 */
	@BeforeClass
	public static void setupClass() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	}
	
	/**
	 * Before each test initialize new instance of ChromeDriver class and SdiPageModel class
	 */
	@Before
	public void setup() {
		driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		sdiPageModel = new SdiPageModel(driver);
	}
	
	/**
	 * Check the side menu text
	 */
	@Test
	public void checkMenuText() {
		sdiPageModel.navigateToMain();
		final String result = sdiPageModel.getMenuText();
		assertEquals("МЕНЮ", result);
	}
	
	/**
	 * Check if body class changes to "menu-open" after clicking the menu button.
	 */
	@Test
	public void checkBodyClassPropertyAfterMenuClick() {
		sdiPageModel.navigateToMain();
		final String result = sdiPageModel.getBodyClassAfterMenuClick();
		assertEquals("menu-open", result);
	}
	
	/**
	 * Check if SDI club link in side menu opens a page with link to "partners discount"
	 * and if this link leads to the right URL.
	 */
	@Test
	public void checkSdiPartnersDiscountLink() {
		sdiPageModel.navigateToMain();
		sdiPageModel.clickSdiClubMenuItem();
		sdiPageModel.clickSdiPartnersDiscountLink();
		
		final String expectedURL = "https://www.sdi.bg/klubna-karta-sdi/partniori/";
		final String result = driver.getCurrentUrl();
		
		assertEquals(expectedURL, result);
	}
	
	/**
	 * Check if Western Union link in side menu leads to Western Union page URL
	 */
	@Test
	public void checkWesternUnionPageURL() {
		sdiPageModel.navigateToMain();
		sdiPageModel.clickWesternUnionMenuItem();
		
		final String expectedURL = "https://www.sdi.bg/western-union/";
		final String result = driver.getCurrentUrl();
		
		assertEquals(expectedURL, result);
	}
	
	/**
	 * Click menu button and enter a word in search input.
	 * Check if clicking the search button leads to correct URL and if search phrase appears in
	 * search page span.
	 */
	@Test
	public void checkSearchResult() {
		sdiPageModel.navigateToMain();
		sdiPageModel.setSearchValue("пловдив");
		sdiPageModel.clickSearchButton();
		
		final String expectedURL = "https://www.sdi.bg/search/";
		final String result = driver.getCurrentUrl();
		
		assertEquals(expectedURL, result);
		
		WebElement searchResultText = sdiPageModel.getSearchTitleSpan();
		assertEquals("пловдив", searchResultText.getText());
	}
	
	/**
	 * After each test close the WebDriver instance
	 */
	@After
	public void after() {
		driver.close();
	}
}
