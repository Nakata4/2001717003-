package project;

public class TicketTest 
{
	public void test1() {
		String answer = TicketTest.addTicket("2$", "seat 5");
		assertEquals(answer, "no");
	}

}
