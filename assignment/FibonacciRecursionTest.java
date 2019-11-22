package omniwyse.assignment;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciRecursionTest {

	@Test
	public void test() {
		Assert.assertEquals(21, FibonacciRecursion.fib(8));
		System.out.print(FibonacciRecursion.fib(8));
	}

}
