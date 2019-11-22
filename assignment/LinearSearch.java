package omniwyse.assignment;

public class LinearSearch {
	 // Linear-search function to find the index of an element 
    public static boolean findIndex(int arr[], int t) 
    { 
  
        // if array is Null 
        if (arr == null) { 
            return false; 
        } 
  
        // find length of array 
        int len = arr.length; 
        int i = 0; 
  
        // traverse in the array 
        while (i < len) { 
  
            // if the i- th element is t 
            // then return the index 
            if (arr[i] == t) { 
                return true; 
            } 
            else { 
                i = i + 1; 
            } 
        } 
        return false; 
    } 

}
