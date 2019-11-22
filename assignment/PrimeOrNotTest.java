package omniwyse.assignment;

import org.junit.Assert;
import org.junit.Test;

public class PrimeOrNotTest {


	@Test
	public void test() {
		Assert.assertEquals(true, PrimeOrNot.isPrime(11));
		System.out.println("prime number");
	}

}
