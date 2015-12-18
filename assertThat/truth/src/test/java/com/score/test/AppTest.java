package com.score.test;

import org.junit.Test;
import java.util.Arrays;
import static com.google.common.truth.Truth.*;
import static com.google.common.truth.TruthJUnit.assume;


public class AppTest 
{


	@Test
	public void testA() {
       assertThat("hello").contains("goodbye");
	}


	@Test
	public void test2() {
		boolean a = false;
		assertThat(a).isTrue();
	}

	@Test
	public void test3() {
		boolean a = false;
		assertThat(a).named("hasError()").isTrue();
	}

	@Test
	public void test4() {
		boolean a = false;
		assert_().withFailureMessage("My arbitrary custom message").that(a).named("hasError()").isTrue();
	}


	@Test
	public void aa() {
		boolean a = false;
		
		// this tests will be reported as Skipped.
		assume().that(a).isTrue();
	}
}
