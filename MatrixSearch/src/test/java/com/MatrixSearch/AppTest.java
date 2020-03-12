package com.MatrixSearch;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		assertTrue(true);
		/*
		 * int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 13 }, { 9, 10, 11, 15 } };
		 * 
		 * 
		 * MatrixSearch ms = new MatrixSearch(); assertEquals(true,
		 * ms.efficientsearch(arr, 1)); assertEquals(true, ms.efficientsearch(arr, 4));
		 * assertEquals(true, ms.efficientsearch(arr, 9)); assertEquals(true,
		 * ms.efficientsearch(arr, 12)); assertEquals(false, ms.efficientsearch(arr,
		 * 20)); assertEquals(false, ms.efficientsearch(arr, 22)); assertEquals(false,
		 * ms.efficientsearch(arr, 14)); assertEquals(false, ms.efficientsearch(arr,
		 * 0));
		 * 
		 * MatrixRecursion mr = new MatrixRecursion(); assertEquals(true,
		 * mr.matrixSearch(arr, 1)); assertEquals(true, mr.matrixSearch(arr, 4));
		 * assertEquals(true, mr.matrixSearch(arr, 9)); assertEquals(true,
		 * mr.matrixSearch(arr, 12)); assertEquals(true, mr.matrixSearch(arr, 11));
		 * assertEquals(false, mr.matrixSearch(arr, 15)); assertEquals(false,
		 * mr.matrixSearch(arr, 20)); assertEquals(false, mr.matrixSearch(arr, 17));
		 * assertEquals(false, mr.matrixSearch(arr, 0)); assertEquals(false,
		 * mr.matrixSearch(arr, -5));
		 */

	}
}
