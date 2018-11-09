package com.renh.testing;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class TheoryTest {
	@DataPoints
	public static int[] data = new int[]{1,2,3};
	
	@Theory
	public void test(int a, int b, int c) {
		System.out.println("a="+a+"  b="+b+"  c="+c);
	}
	
	
	@DataPoint
	public static int[] onedata = new int[] {1,2,3};
	
	@Theory
	public void test2(int[] arr) {
		System.out.println(arr);
	}
}
