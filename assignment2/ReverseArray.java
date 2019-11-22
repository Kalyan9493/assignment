package assignment2;

public class ReverseArray {
    /* function that reverses array and stores it  
    in another array*/
 static int [] reverse(int a[], int n) 
 { 
     int[] b = new int[n]; 
     int j = n; 
     for (int i = 0; i < n; i++) { 
         b[j - 1] = a[i]; 
         j = j - 1; 
     } 

     /*printing the reversed array*/
     System.out.println("Reversed array is: \n"); 
     for (int k = 0; k < n; k++) { 
         System.out.print(b[k]+" "); 
     }
	return b; 
 }

}
