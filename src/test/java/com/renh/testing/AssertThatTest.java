package com.renh.testing;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class AssertThatTest extends Assert {
	
	@Test()
	public void isTest() {
		this.assertThat("hello", CoreMatchers.is("hello"));
	}
	
	@Test
	public void testContainsString() {
		this.assertThat("hello", CoreMatchers.containsString("ll"));
	}
	
	@Test
	public void testTheInstanceInteger() {
		Integer i1 = 127;
		Integer i2 = 127;
		this.assertThat(i1, CoreMatchers.theInstance(i2));
	}
	
	@Test
	public void testTheInstanceLong() {
		Long l1 = 127l;
		Long l2 = 127l;
		this.assertThat(l1, CoreMatchers.theInstance(l2));
	}
	/*@Test
	public void testTheInstanceDouble() {
		Double d1 = 1.0;
		Double d2 = 1.0;
		this.assertThat(d1, CoreMatchers.theInstance(d2));
	}
	@Test
	public void testTheInstanceFloat() {
		Float f1 = 1.0f;
		Float f2 = 1.0f;
		this.assertThat(f1, CoreMatchers.theInstance(f2));
	}*/
}
