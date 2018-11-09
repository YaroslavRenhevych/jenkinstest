package com.renh.testing;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.Suite;

@Category(Main.class)
public class AppTest extends Assert {
    
	//@Rule
	//public final Timeout timeout = new Timeout(1000);
	
    @Test(/*timeout=1000,*/ expected = RuntimeException.class)
    public void test1() throws InterruptedException
    {
    	
    	System.out.println("		test1");
    	Thread.sleep(1500l);
    	if(true)
    		throw new RuntimeException("exception");
        assertTrue( true );
    }
    @Test
    public void test2() throws InterruptedException {
    	Thread.sleep(1500l);
    	System.out.println("     		test2");
    }
    
    
    @Before
	public void before() {
		System.out.println("	before()");
	}
    @After
    public void after() {
    	System.out.println("	after");
    }
    
    @BeforeClass
    public static void beforeClass() {
    	System.out.println("beforeClass()");
    }
    
    @AfterClass
    public static void afterClass() {
    	System.out.println("afterClass()");
    }
}