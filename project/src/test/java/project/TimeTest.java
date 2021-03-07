package project;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class TimeTest {

    @Test
    public void testMillis() {
        Time time = Time.millis(123);
        assertThat(time.timeUnit(), equals(TimeUnit.MILLISECONDS));
        assertThat(time.howLong(), equals(123));
        assertThat(time.toString(), equals("millis(123)"));
    }

	@Test
    public void testSeconds() {
        Time time = Time.secs(456);
        assertThat(time.timeUnit(), equals(TimeUnit.SECONDS));
        assertThat(time.howLong(), equals(456));
        assertThat(time.toString(), equals("seconds(456)"));
    }

    @Test
    public void testMins() {
        Time time = Time.mins(789);
        assertThat(time.timeUnit(), equals(TimeUnit.MINUTES));
        assertThat(time.howLong(), equals(789));
        assertThat(time.toString(), equals("mins(789)"));

    }
    private void assertThat(String string, boolean equals) {
		// TODO Auto-generated method stub
		
	}

	private void assertThat(int howLong, boolean equals) {
		// TODO Auto-generated method stub
		
	}

	private void assertThat(TimeUnit timeUnit, boolean equals) {
		// TODO Auto-generated method stub
		
	}
}
