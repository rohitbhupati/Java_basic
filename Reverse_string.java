package java_assignment3;
public class Reverse_string {
	
	 
	// Class of ReverseString
	
	    public static void main(String[] args)
	    {
	        String input = "Geeks for Geeks";
	 
	        StringBuilder input1 = new StringBuilder();
	 
	        // append a string into StringBuilder input1
	        input1.append(input);
	 
	        // reverse StringBuilder input1
	        input1.reverse();
	 
	        // print reversed String
	        System.out.println(input1);
	    }
	}
