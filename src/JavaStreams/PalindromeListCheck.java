package JavaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PalindromeListCheck {
	
	
	
	public static void main(String[] args) {
		
		
		
		
		 //palindrome or not for single string using for loop
        String input="madam";
        int length=input.length();
//        for(int i=0;i<length/2;i++) {
//        	if(input.charAt(i)==input.charAt(length-1-i)) {
//        		System.out.println("Its palindrome");
//        		return;
//        	}
//        		
//        }
//        System.out.println("its not palindrome");

        
        
        
       
        
        
        
        //uisng streams for single string
      boolean palindrome = IntStream.range(0, length/2)
      .allMatch(i->input.charAt(i)==input.charAt(length-1-i));
      System.out.println("its a plaindrome"+palindrome);
      
      //checking from list of strings
		List<String> palindromeLists=Arrays.asList("madam","nitin","race","pap");
		List<String> collectPalindromes = palindromeLists.stream()
		.filter(PalindromeListCheck::isPalindrome)
		.collect(Collectors.toList());
		
		System.out.println("Palindromes---"+collectPalindromes);
	}
	
	public static boolean isPalindrome(String str) {
		if(str==null)return false;
		return IntStream.range(0,str.length()/2)
				.allMatch(i->str.charAt(i)==str.charAt(str.length()-1-i));
	}
	
	 
	 
}
