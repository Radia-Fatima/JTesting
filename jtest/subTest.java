package jtest;

import static org.junit.Assert.*;

import org.junit.Test;

public class subTest {

	@Test
	public void test() {
		Jclass obj2 = new Jclass();
		int output = obj2.sub(9, 7);
		assertEquals(2 ,output);
		
	}

}
