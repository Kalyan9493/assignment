package com.MatrixSearch;

import org.junit.Assert;
import org.junit.Test;

public class MatrixSearchTest {

	// Test case for matrix 3*4	
	int[][] arr = { { 1, 2, 3, 4 }, 
					{ 11, 12, 13, 14 }, 
					{ 21, 22, 23, 24 } };

	
	MatrixSearch ms = new MatrixSearch();

	@Test
	public void testCorners() {
		Assert.assertEquals(true, ms.efficientsearch(arr, 1));
		Assert.assertEquals(true, ms.efficientsearch(arr, 4));
		Assert.assertEquals(true, ms.efficientsearch(arr, 21));
		Assert.assertEquals(true, ms.efficientsearch(arr, 24));

	}

	@Test
	public void falseCases() {
		Assert.assertEquals(false, ms.efficientsearch(arr, -2));
		Assert.assertEquals(false, ms.efficientsearch(arr, 30));
		Assert.assertEquals(false, ms.efficientsearch(arr, 15));
	}
	@Test
	public void insideElements(){
		
		Assert.assertEquals(true, ms.efficientsearch(arr, 2));
		Assert.assertEquals(true, ms.efficientsearch(arr, 22));
		Assert.assertEquals(true, ms.efficientsearch(arr, 3));
		Assert.assertEquals(true, ms.efficientsearch(arr, 23));
		Assert.assertEquals(true, ms.efficientsearch(arr, 12));
		
	}
	
	// Test case for matrix 4*4
	
	int[][] arr1 ={ 
			{ 1, 2, 3, 4 }, 
			{ 11, 12, 13, 14 }, 
			{ 21, 22, 23, 24 },
			{ 31, 32, 33, 34}};
	
	@Test
	public void testCorners1() {
		Assert.assertEquals(true, ms.efficientsearch(arr1, 1));
		Assert.assertEquals(true, ms.efficientsearch(arr1, 4));
		Assert.assertEquals(true, ms.efficientsearch(arr1, 31));
		Assert.assertEquals(true, ms.efficientsearch(arr1, 34));

	}

	@Test
	public void falseCases1() {
		Assert.assertEquals(false, ms.efficientsearch(arr1, -2));
		Assert.assertEquals(false, ms.efficientsearch(arr1, 41));
		Assert.assertEquals(false, ms.efficientsearch(arr1, 15));
	}
	@Test
	public void insideElements1(){
		
		Assert.assertEquals(true, ms.efficientsearch(arr1, 2));
		Assert.assertEquals(true, ms.efficientsearch(arr1, 32));
		Assert.assertEquals(true, ms.efficientsearch(arr1, 3));
		Assert.assertEquals(true, ms.efficientsearch(arr1, 33));
		Assert.assertEquals(true, ms.efficientsearch(arr1, 12));
		
	}
	
	// Test case for matrix 4*3	
	int[][] arr2 ={ 
			{ 1, 2, 3}, 
			{ 11, 12, 13}, 
			{ 21, 22, 23},
			{ 31, 32, 33}};
	
	@Test
	public void testCorners2() {
		Assert.assertEquals(true, ms.efficientsearch(arr2, 1));
		Assert.assertEquals(true, ms.efficientsearch(arr2, 3));
		Assert.assertEquals(true, ms.efficientsearch(arr2, 31));
		Assert.assertEquals(true, ms.efficientsearch(arr2, 33));

	}

	@Test
	public void falseCases2() {
		Assert.assertEquals(false, ms.efficientsearch(arr2, -2));
		Assert.assertEquals(false, ms.efficientsearch(arr2, 41));
		Assert.assertEquals(false, ms.efficientsearch(arr2, 15));
	}
	@Test
	public void insideElements2(){
		
		Assert.assertEquals(true, ms.efficientsearch(arr2, 2));
		Assert.assertEquals(true, ms.efficientsearch(arr2, 32));
		Assert.assertEquals(true, ms.efficientsearch(arr2, 3));
		Assert.assertEquals(true, ms.efficientsearch(arr2, 33));
		Assert.assertEquals(true, ms.efficientsearch(arr2, 12));
		
	}
}
