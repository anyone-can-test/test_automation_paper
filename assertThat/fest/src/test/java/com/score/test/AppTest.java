package com.score.test;

import static org.fest.assertions.api.Assertions.*;
import org.junit.Test;
import java.util.Arrays;


public class AppTest 
{


	@Test
	public void testA() {
       assertThat("hello").contains("goodbye");
	}
	
	@Test
	public void testB() {

       String[] list = {"hello", "goodbye", "bye", "you", "hello"};
       assertThat(list).as("All should be unique.").doesNotHaveDuplicates();
	}

	@Test
	public void testC() {
       String[] actual = {"hello", "goodbye", "bye", "you"};
       String[] expected = {"hello", "goodbye", "bye", "me"};
       assertThat(actual).containsAll(Arrays.asList(expected));
	}

 
	@Test
	public void testD() {
       String[] list = {"hello", "goodbye", "bye", "me"};
	   assertThat(Arrays.asList(list)).hasSize(4).contains("bye").doesNotContain("me");
	}
}
