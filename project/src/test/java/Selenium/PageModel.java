package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *  Page object Model
 * @author Nasko
 *
 */
public class PageModel {
	
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
	 * Main div
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
	public PageModel(final WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * Navigate to domain
	 */
	public void navigateToMain() {
		driver.get("https://en.wikipedia.org/wiki/Filmi");		
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
	 * Click the link after clicking the menu
	 */
	public void clickSdiClubMenuItem() {
		menuTab.click();
		navigationMenuUnorderedList.findElements(By.tagName("li")).get(4).findElement(By.tagName("a")).click();
	}
	
	/**
	 * Click the partners discount link in Club page.
	 */
	public void clickSdiPartnersDiscountLink() {
		sdiClubMainDiv.findElements(By.tagName("p")).get(3).findElement(By.tagName("strong")).findElement(By.tagName("a")).click();
	}
	
	
}
