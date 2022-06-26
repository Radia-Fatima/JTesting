package jtest;

import static org.junit.Assert.*;

import org.junit.Test;

public class squareTest {

	@Test
	public void test() {
	Jclass obj = new Jclass();
	int output = obj.square(3);
	assertEquals(9 ,output);
	}

}
