package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * SDI Page object Model
 * @author Boyan
 *
 */
public class SdiPageModel {
	
	/**
	 * Selenium WebDriver instance
	 */
	private WebDriver driver;
	
	/**
	 * Menu link with id menu-toggle
	 */
	@FindBy(id = "menu-toggle")
	WebElement menuTab;
	
	/**
	 * Body tag
	 */
	@FindBy(tagName = "body")
	WebElement body;
	
	/**
	 * Side menu list
	 */
	@FindBy(id = "full-navigation")
	WebElement navigationMenuUnorderedList;
	
	/**
	 * Side menu search input
	 */
	@FindBy(id = "side-menu-search")
	WebElement searchInput;
	
	/**
	 * Main div of "SDI Club" page
	 */
	@FindBy(className = "mobile-page-body")
	WebElement sdiClubMainDiv;
	
	/**
	 * Side menu form containing input and button
	 */
	@FindBy(id = "search")
	WebElement searchForm;
	
	/**
	 * Span where search phrase appears after redirect
	 */
	@FindBy(id = "gtm-search-query")
	WebElement searchTitleSpan;
	
	/**
	 * Constructor initialize an instance of Wikipedia Page object Model
	 * 
	 * @param driver
	 */
	public SdiPageModel(final WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * Navigate to SDI domain
	 */
	public void navigateToMain() {
		driver.get("https://www.sdi.bg/");		
	}
	
	/**
	 * Get the text of menu link
	 * @return String
	 */
	public String getMenuText() {
		return menuTab.findElement(By.tagName("span")).getText();
	}
	
	/**
	 * Get the value of class attribute of body after menu click
	 * @return String
	 */
	public String getBodyClassAfterMenuClick() {
		menuTab.click();
		return body.getAttribute("class");
	}
	
	/**
	 * Click Western Union link after clicking the menu
	 */
	public void clickWesternUnionMenuItem() {
		menuTab.click();
		navigationMenuUnorderedList.findElements(By.tagName("li")).get(3).findElement(By.tagName("a")).click();
	}
	
	/**
	 * Set search phrase in search input after clicking the menu
	 * @param searchValue
	 */
	public void setSearchValue(String searchValue) {
		menuTab.click();
		searchInput.clear();
		searchInput.sendKeys(searchValue);
	}
	
	/**
	 * Click the search button
	 */
	public void clickSearchButton() {
		searchForm.findElement(By.tagName("button")).click();
	}
	
	/**
	 * Target the span element where search phrase appears after search
	 * @return WebElement
	 */
	public WebElement getSearchTitleSpan() {
		return this.searchTitleSpan;
	}
	
	/**
	 * Click the "SDI Club" link after clicking the menu
	 */
	public void clickSdiClubMenuItem() {
		menuTab.click();
		navigationMenuUnorderedList.findElements(By.tagName("li")).get(4).findElement(By.tagName("a")).click();
	}
	
	/**
	 * Click the partners discount link in SDI Club page.
	 */
	public void clickSdiPartnersDiscountLink() {
		sdiClubMainDiv.findElements(By.tagName("p")).get(3).findElement(By.tagName("strong")).findElement(By.tagName("a")).click();
	}
	
	
}
