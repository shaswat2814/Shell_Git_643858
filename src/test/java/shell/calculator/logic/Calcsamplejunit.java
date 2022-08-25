package shell.calculator.logic;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.junit.Assert;

public class Calcsamplejunit {
	
	Calcsample calc;
	
	@Before
	public void thisIsBeforeAnnotation() {
		calc = new Calcsample();
	}

	@Test
	public void validateAddition()
	{
		int expected = 30;
		int actual = calc.addition(10,20);
		Assert.assertEquals(expected,actual);
	}
	
	@Test
	public void validateSubtraction() {
		int expected = 5;
		int actual  = calc.subtraction(10, 5);
		Assert.assertEquals(expected,actual);
	}
	
	@After
	public void testDown() {
		
		System.out.println("Testcase is completed");
	}
	

}
