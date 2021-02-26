package Selenium;

import static junit.framework.Assert.assertTrue;

import org.opentest4j.selenium.WebDriver;

public class FirstTest
{
	public void driverIsTheKing()
	{	
	WebDriver driver = new HtmlUnitDriver();
	driver.get("http://www.compendiumdev.co.uk/selenium");
	assertTrue(driver.getTitle().startsWith("Selenium Ximplified"));
	}
}
