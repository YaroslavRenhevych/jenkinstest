package com.renh.testing;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@Categories.IncludeCategory(Main.class)
@SuiteClasses({AppTest.class, Test2.class})
public class CategoryTests {
	
}
