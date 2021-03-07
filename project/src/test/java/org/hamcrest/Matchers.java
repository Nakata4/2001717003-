package org.hamcrest;

import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Test;


class HamcrestExampleTests {

    @Test
    void test() {
        boolean a = true;
        boolean b = true;

        assertThat(a, equalTo(b));
        assertThat(a, is(equalTo(b)));
        assertThat(a, is(b));
    }

	private Matcher is(boolean b) {
		return null;
	}

	private Matcher is(Matcher equalTo) {		
		return null;
	}

	private Matcher equalTo(boolean b) {
		return null;
	}

}
