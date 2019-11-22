package omniwyse.assignment;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.junit.Test;

public class StringPermutationTest {

	@Test
	public void test() {
	    // Function to read user input
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String str;
	        System.out.println("Enter a string");
	        try{
	            str = br.readLine();
	        }catch (Exception e){
	            System.out.println("An error occurred");
	            return;
	        }
	        System.out.println("All the possible permutations of "+ str + " are");
	        StringPermutation.permute(str,0,str.length()-1);
	    }
	    

}
