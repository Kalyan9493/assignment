package omniwyse.assignment;

import org.junit.Assert;
import org.junit.Test;

public class StringPalindromeTest {

	@Test
	public void test() {
		Assert.assertEquals(true, StringPalindrome.stringPalindrome("kayak"));
		System.out.println("palindrome");
	}

}
