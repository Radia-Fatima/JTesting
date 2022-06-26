package jtest;

import static org.junit.Assert.*;

import org.junit.Test;

public class sum {

	@Test
	public void test() {
		Jclass obj3 = new Jclass();
		int output = obj3.add(1, 7);
		assertEquals(8 ,output);
		
	}

}
