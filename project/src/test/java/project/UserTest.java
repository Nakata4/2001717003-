package project;

import org.junit.Test;

public class UserTest {

	@Test
	public void testUsername() {	
		User test = new User();
		String result = test.username("first_name", "last_name"); 
	}
}