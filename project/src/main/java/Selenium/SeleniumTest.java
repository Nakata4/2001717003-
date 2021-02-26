package Selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SeleniumTest {
	private SeleniumTest selenium;
	
	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 8080, "chrome");
		selenium.start();
	}
	
	private void start() {
		// TODO Auto-generated method stub
	}			

	@Test
	public void testSelenium() throws Exception{
		selenium.open();
		selenium.type();
		selenium.click();
		assertTrue(selenium.isTextPresent(""));
	}
	
	private boolean isTextPresent(String string) {
		// TODO Auto-generated method stub
		return false;
	}


	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
		

}
