package assignment2;

import org.junit.Assert;
import org.junit.Test;

public class BalancedPeranthasisTest {

	@Test
	public void test() {
		 char exp[] = {'{','(',')','}','[',']'}; 
		 Assert.assertEquals(true, BalancedPeranthasis.areParenthesisBalanced(exp));
		 System.out.println("Balanced");
		 
	}

}
