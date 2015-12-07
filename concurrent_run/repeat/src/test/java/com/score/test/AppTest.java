package com.score.test;


import com.google.code.tempusfugit.concurrency.ConcurrentRule;
import com.google.code.tempusfugit.concurrency.ConcurrentTestRunner;
import com.google.code.tempusfugit.concurrency.RepeatingRule;
import com.google.code.tempusfugit.concurrency.annotations.Concurrent;
import com.google.code.tempusfugit.concurrency.annotations.Repeating;

import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.Rule;
import org.junit.runner.RunWith;

@RunWith(ConcurrentTestRunner.class)
public class AppTest 
{
    @Rule public RepeatingRule rule = new RepeatingRule();
	@Rule public ConcurrentRule concurrently = new ConcurrentRule();

	@Test
    @Concurrent (count = 5)
    @Repeating (repetition = 2)
	public void testA() {
		process();
		print();
	}

    static int i = 1;
	synchronized void print() {
		System.out.println((i++) + " times executed.");
	
	}

	// fake test
	void process() {
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
		}
	}	
}
