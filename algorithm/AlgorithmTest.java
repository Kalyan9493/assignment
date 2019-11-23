package algorithm;

import org.junit.Test;

public class AlgorithmTest {

	@Test
	public void test() { 
	    	int N = 3;
	        int arr[][] = { {1,2,3},
	            			{4,5,6},
	            			{7,8,9}}; 
	        System.out.println("Given matrix:");
	        Algorithm.printMatrix(arr,N);
	        Algorithm.rotate90Clockwise(arr,N); 
	        System.out.println("After Rotating 90 degrees:");
	        Algorithm.printMatrix(arr,N); 
	    
	}

}
