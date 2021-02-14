package junit_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.ArrayUtilities;

public class TestArrayUtilities {

	@Test
	public void test1() {
		int [] input = {2, 3, 4, 5};
		int[] expected = {2, 5, 9, 14};
		int[] result = ArrayUtilities.getIntermediateSums(input);
		assertArrayEquals(expected, result);
	}
	@Test
	public void test2() {
		int [] input = {};
		int[] expected = {};
		int[] result = ArrayUtilities.getIntermediateSums(input);
		assertArrayEquals(expected, result);
	}
}
