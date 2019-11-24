package assignment3;

import org.junit.Assert;
import org.junit.Test;

public class InfixToPostfixTest {

	@Test
	public void test() {
		 String exp = "3+4*5/6"; 
		 Assert.assertEquals("345*6/+", InfixToPostfix.infixToPostfix(exp));
	        System.out.println(InfixToPostfix.infixToPostfix(exp)); 
	}

}
