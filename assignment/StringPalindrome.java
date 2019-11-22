package omniwyse.assignment;

public class StringPalindrome {
	 public static boolean stringPalindrome(String string) {    
	        boolean flag = true;    
	            
	        //Converts the given string into lower case    
	        string = string.toLowerCase();    
	            
	        //Iterate the string forward and backward, compare one character at a time     
	        //till middle of the string is reached    
	        for(int i = 0; i < string.length()/2; i++){    
	            if(string.charAt(i) != string.charAt(string.length()-i-1)){    
	                flag = false;    
	                break;    
	            }    
	        }    
	        if(flag)    
	           return true;
	        else    
	            return false;   

	 }
	 }
