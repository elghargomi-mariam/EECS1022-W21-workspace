package junit_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Counter;

public class CounterTest {

	@Test
	public void test_0_Counter() {
		Counter c = new Counter();
		int actual = c.getValue();
		int expexted = 0;
		String error = String.format(
				"\n creating object  failed  Returned value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expexted);
		assertEquals(error, expexted, actual);
		
	}

	@Test
	public void test_1_CounterInt() {
		// constructor object from Counter class with value equal to 5
		Counter c = new Counter(5);
		int actual = c.getValue();
		int expexted = 5;
		String error = String.format(
				"\n creating object failed  Returned value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expexted);
		assertEquals(error, expexted, actual);
	}
	
	@Test
	public void test_2_GetValue() {
		Counter c = new Counter(7);
		
		int actual = c.getValue();
		int expexted = 7;
		String error = String.format(
				"\n creating object failed  Returned value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expexted);
		assertEquals(error, expexted, actual);
	}
	
	@Test
	public void test_4_SetValue() {
		Counter c = new Counter(7);
		c.setValue(9);
		int actual = c.getValue();
		int expexted = 9;
		String error = String.format(
				"\n Test Set tValue failed  Returned value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expexted);
		assertEquals(error, expexted, actual);
	}
	
	@Test
	public void test_5_Incr() {
		Counter c = new Counter(17);
		c.incr();
		int actual = c.getValue();
		int expexted = 18;
		String error = String.format(
				"\n Test increment  failed  Returned value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expexted);
		assertEquals(error, expexted, actual);
	}
	@Test
	public void test_6_IncrbyValue() {
		Counter c = new Counter();
		c.incrbyValue(3);
		int actual = c.getValue();
		int expexted =3;
		String error = String.format(
				"\n Test increment  failed  Returned value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expexted);
		assertEquals(error, expexted, actual);
	}
	
	@Test
	public void test_7_Decr() {
		Counter c = new Counter(6);
		c.decr();
		int actual = c.getValue();
		int expexted = 5;
		String error = String.format(
				"\n Test decrement  failed  Returned value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expexted);
		assertEquals(error, expexted, actual);
	}
	
	@Test
	public void test_8_DecrbyValue() {
		Counter c = new Counter(6);
		c.decrbyValue(5);
		int actual = c.getValue();
		int expexted = 1;
		String error = String.format(
				"\n Test decrement failed  Returned value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expexted);
		assertEquals(error, expexted, actual);
	}

	@Test
	public void test_81_DecrbyValue() {
		Counter c = new Counter(16);
		c.decrbyValue(9);
		int actual = c.getValue();
		int expexted = 7;
		String error = String.format(
				"\n Test decrement failed  Returned value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expexted);
		assertEquals(error, expexted, actual);
	}

	

	@Test
	public void test_9_ToString() {
		Counter c = new Counter(75);
		String actual = c.toString();
		String expexted = "(Counter is 75)";
		String error = String.format(
				"\n Test toString failed  Returned string ( %s ) " + " but correct string is ( %s ). \n",
				actual, expexted);
		assertTrue(error, expexted.equals(actual));
	}
	

}
