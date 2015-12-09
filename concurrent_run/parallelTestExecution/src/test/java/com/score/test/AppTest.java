package com.score.test;

import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.Rule;


public class AppTest 
{

	@Rule 
   	public TestName testname = new TestName();

	@Test
	public void testA() {
		printTestname();
		process();
	}
	
	@Test
	public void testB() {
		printTestname();
		process();
	}

	@Test
	public void testC() {
		printTestname();
		process();
	}

	@Test
	public void testD() {
		printTestname();
		process();
	}

	void printTestname() {
		System.out.println(testname.getMethodName() + " executed.");
	
	}

	// fake test
	void process() {
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
		}
	}	
}
