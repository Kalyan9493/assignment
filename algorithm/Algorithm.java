package algorithm;

public class Algorithm {
	 
	  
	// Function to rotate the matrix 90 degree clockwise 
	static void rotate90Clockwise(int a[][],int N) 
	{ 
	  
	    // Traverse each cycle 
	    for (int i = 0; i < N / 2; i++) 
	    { 
	        for (int j = i; j < N - i - 1; j++) 
	        { 
	  
	            // Swap elements of each cycle 
	            // in clockwise direction 
	            int temp = a[i][j]; 
	            a[i][j] = a[N - 1 - j][i]; 
	            a[N - 1 - j][i] = a[N - 1 - i][N - 1 - j]; 
	            a[N - 1 - i][N - 1 - j] = a[j][N - 1 - i]; 
	            a[j][N - 1 - i] = temp; 
	        } 
	    } 
	} 
	  
	// Function for print matrix 
	static void printMatrix(int arr[][],int N) 
	{ 
	    for (int i = 0; i < N; i++) 
	    { 
	        for (int j = 0; j < N; j++) 
	        System.out.print( arr[i][j] + " "); 
	        System.out.println(); 
	    } 
	} 
	  

}
