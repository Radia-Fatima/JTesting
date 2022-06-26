package jtest;

import static org.junit.Assert.*;

import org.junit.Test;

public class addTest {

	@Test
	public void test() {
		Jclass obj1 = new Jclass();
		int output = obj1.add(3 ,5);
		assertEquals(8 ,output);
		
	}

}
