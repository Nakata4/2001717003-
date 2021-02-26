package Selenium;

import selenium.WebDriver;
import selenium.SeleniumDriver;

public class SeleniumDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.selenium.driver", "C:\\Downloads\\seleniumdriver")
		WebDriver driver = new SeleniumDriver();
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("Nakata4olov@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.className(Fire)).click();
		Thread.sleep(2000);
		String at = driver.getTitle();
		String et = "facebook";
		if(at.equalsIgnoreCase(et))
		{
			System.out.println("Test OK");
		}
		else
		{
			System.out.println("Test Bad");
		}
	}
}
