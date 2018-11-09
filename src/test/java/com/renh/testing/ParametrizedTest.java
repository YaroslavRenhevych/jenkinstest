package com.renh.testing;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParametrizedTest extends Assert {
	
	@Parameters
	public static Collection<Object[]> parameters() {
		return Arrays.asList(new Object[][] {
			{1,1,"hello"}, {2,4,"world"}, {3,9,"!"}
		});
	}
	
	private int base;
	private int result;
	
	public ParametrizedTest(int base, int result,String msg) {
		System.out.println("msg="+msg);
		this.base = base;
		this.result = result;
	}
	
	@Test
	public void testSquare() {
		assertEquals(base*base, result);
	}
}
