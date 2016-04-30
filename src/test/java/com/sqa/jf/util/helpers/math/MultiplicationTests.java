/**
 *   File Name: MyMathTests.java<br>
 *
 *   Gajula Jayabhanu<br>

 *   Created: Apr 13, 2016
 *
 */

package com.sqa.jf.util.helpers.math;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sqa.jf.util.helpers.MyMath;

/**
 * MyMathTests //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Gajula Jayabhanu
 * @version 1.0.0
 * @since 1.0
 *
 */

// @RunWith(Parameterized.class)

public class MultiplicationTests {

	@DataProvider(name = "Multiplication Data")
	public static Object[][] getData() {
		Object[][] data = { { new double[] { 2.0, 3.0, 4.0, 2.0 }, 49 }, { new double[] { 2.0, 1.0, 5.0 }, 10.0 },
				{ new double[] { 3.0, 1.5 }, 4.5 }, { new double[] { 0.0, 5.0, 15.0, 10.0 }, 0.0 },
				{ new double[] { 1.0, 2.0, 2.5, 3.0, 6.0 }, 90.0 }, { new double[] { 1.5, 5.5, 0.0 }, 0.0 } };
		return data;
	}

	@Test(dataProvider = "Multiplication Data")
	public void testMultiplication(double[] numbers, double expectedResult) {
		double actualResult = MyMath.multNumbers(numbers);
		String numbersString = Arrays.toString(numbers);
		String errorMessage = String.format(
				"Error: The result of multiplying all numbers %s " + " is actually %.2f not expected.", numbersString,
				actualResult);
		String message = String.format("The result of multiplying all numbers %s " + " is %.2f.", numbersString,
				actualResult);
		System.out.println(message);

		// TestNG PArams: Actual, Expected, Delta, Message
		assertEquals(actualResult, expectedResult, 1, errorMessage);

		// Assert.assertEquals(errorMessage, this.expectedResult, actualResult,
		// 2);

	}
}
