package project;

import org.junit.Test;

public class SeatTest {

	@Test
	public void testSeat() {
		double RandomSeatNumber = Math.random() * 5;
        System.out.println("RandomSeatNumber = " + RandomSeatNumber);
        int randomSeat = (int)RandomSeatNumber;
        System.out.println("randomSeat = " + randomSeat);
	}

}
