package omniwyse.assignment;

import org.junit.Assert;
import org.junit.Test;

public class GCDTest {

	@Test
	public void test() {
		Assert.assertEquals(5, GCD.gcd(5,10));
		System.out.print(GCD.gcd(5,10));
	}

}
