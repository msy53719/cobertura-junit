package com.coverage.core.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.coverage.core.Add;

public class AddTest {
	@Test
	public void addTest() {
		Add add = new Add();
		assertEquals(9, add.addOne(1, 8));
	}
}
