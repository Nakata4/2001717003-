package project;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SeatTest {
	@Test
	public void testFreePlace() {
          PlaceService service=new PlaceService();
          assertTrue(service.isPlaceFree(new Place(5,1)));
	}

}
