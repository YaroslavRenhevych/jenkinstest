package com.renh.testing;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//@RunWith(Suite.class)
public class TestOrder {
	
	
	
	//@Test
	public void b() {
		System.out.println("b");
	}
	
	//@Test
	public void a() {
		System.out.println("a");
	}
	
	//@Test
	public void c() {
		System.out.println("c");
	}
}
