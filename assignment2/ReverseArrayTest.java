package assignment2;

import org.junit.Assert;
import org.junit.Test;

public class ReverseArrayTest {

	@Test
	public void test() {
		int [] arr = {10, 20, 30, 40, 50}; 
		int [] arr1= {50,40,30,20,10};
		Assert.assertArrayEquals(arr1,ReverseArray.reverse(arr, arr.length) );
	
	}

}
