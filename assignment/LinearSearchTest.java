package omniwyse.assignment;

import org.junit.Assert;
import org.junit.Test;

public class LinearSearchTest {

	@Test
	public void test() {
		int arr[]= {1,2,3,4,5,6};
		Assert.assertEquals(true, LinearSearch.findIndex(arr, 5));
	}

}
