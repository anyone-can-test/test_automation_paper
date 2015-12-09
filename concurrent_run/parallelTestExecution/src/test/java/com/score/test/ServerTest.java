package com.score.test;

import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.Rule;


public class ServerTest
{

	@Rule 
   	public TestName testname = new TestName();

	@Test
	public void test1() {
		printTestname();
		process();
	}
	
	@Test
	public void test2() {
		printTestname();
		process();
	}

	@Test
	public void test3() {
		printTestname();
		process();
	}

	@Test
	public void test4() {
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
