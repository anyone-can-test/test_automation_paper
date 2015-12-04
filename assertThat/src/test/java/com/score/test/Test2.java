package com.score.test;

import static org.fest.assertions.api.Assertions.*;
import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;


public class Test2
{


	@Test
	public void testA() {
       assertThat("hello").contains("goodbye");
	}
	
	@Test
	public void testB() {

	   assertTrue("hello".contains("goodbye"));
	}

}
