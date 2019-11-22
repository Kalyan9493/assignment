package omniwyse.assignment;

public class StringPermutation {
	// Function to swap two characters
    static String swap(String str, int i, int j){
        char ch;
        char[] array = str.toCharArray();
        ch = array[i];
        array[i] = array[j];
        array[j] = ch;
        return String.valueOf(array);
    }
    // Function to print all the permutations of the string
    static void permute(String str,int low,int high){
        if(low == high)
            System.out.println(str);
 
        int i;
        for(i = low; i<=high; i++){
            str = swap(str,low,i);
            permute(str, low+1,high);
            str = swap(str,low,i);
        }
    }


}
