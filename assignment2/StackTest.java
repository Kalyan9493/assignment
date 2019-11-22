package assignment2;

import org.junit.Test;

public class StackTest {

	@Test
	public void test() {
		//1)---CREATING STACK------
		Stack.stack(100);
		
		
		
		//2)----PUSH TO STACK------
		Stack.push(10);
		Stack.push(20);
		Stack.push(30);
		Stack.push(40);
		Stack.push(50);
		Stack.push(60);
		Stack.push(70);
		Stack.push(80);
		
		
		//---DISPLAY STACK-----
		Stack.display();
		
		//3)----POP FROM STACK-------
		
		System.out.println();
		System.out.println("element is:" +Stack.pop());
		System.out.println("element is:" +Stack.pop());
		System.out.print("After deleting element stack is:");
		Stack.display();
		
		
		//4)----ISEMPTY OR NOT------
		System.out.println();
		System.out.println(Stack.isEmpty());
		
		//5)----SIZE OF STACK------
		
		System.out.println(Stack.size());
		
	}
			
}
