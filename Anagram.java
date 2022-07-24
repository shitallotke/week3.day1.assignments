/*
 * Pseudo Code

	  //Anagram = two strings anagrams if they contain the same characters but in a different order. 
	  
	 *Declare a String 
		String text1 = "stops";
	 *Declare another String
		String text2 = "potss"; 
	 * a) Check length of the strings are same then (Use A Condition)
	 * b) Convert both Strings in to characters
	 * c) Sort Both the arrays
	 * d) Check both the arrays has same value
	 * 
 */
package week3.day1.assignment;
import java.util.Arrays;
public class Anagram {

	public static void main(String[] args) {
		//Declare a String text1 ="stops";
		String text1 = "stops";
		//Declare another String text2 ="potss";
		String text2 = "potss"; 
		
		// Check length of the strings are same 
		int text1Len = text1.length();
		int text2Len = text2.length();
		
		/*if(text1Len!=text2Len)
		{
			System.out.println("Strings are not anagram");
		}*/
		if(text1Len == text2Len)
		{	//Convert both Strings in to characters
			char[] arrch1 = text1.toCharArray();
			char[] arrch2 = text2.toCharArray();
			
			//Sort Both the arrays
		    Arrays.sort(arrch1);
			Arrays.sort(arrch2);
			
			//Check both the arrays has same value
		   boolean status = Arrays.equals(arrch1, arrch2);
		   System.out.println(status);
			
			System.out.println( text1 + " & " + text2 + " Strings are anagram");
		}
		else
		{
			System.out.println( text1 + " & " + text2 + " Strings are not anagram");
		
		}
	}

}

/*output:
 true
stops & potss Strings are anagram
 */
 
