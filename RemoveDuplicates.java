/*
	 * Pseudo code 
	 
	 * a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";		
	 * b) Initialize an integer variable as count	  
	 * c) Split the String into array and iterate over it 
	 * d) Initialize another loop to check whether the word is there in the array
	 * e) if it is available then increase and count by 1. 
	 * f) if the count > 1 then replace the word as "" 
	 
	 * g) Displaying the String without duplicate words	
 */

package week3.day1.assignment;

public class RemoveDuplicates {

	public static void main(String[] args) {
		//declared String text as input
		String text = "we learn java basics as part of java sessions in java week1";
		System.out.println("Original String :" +text);
		
		//String lcStr = text.toLowerCase();
		//System.out.println("Lowercase String : " +lcStr);
		
		//Initialize an integer variable as count	
		int count = 0;
		
		//Split the String into array and iterate over it 
		String [] splitstr = text.split(" ");
		/*for(int i=0;  i<splitstr.length; i++){
			System.out.println(splitstr[i]);
		}*/
		System.out.print("Duplicate word from the String : ");
		for(int i=0;i<=splitstr.length-1;i++){
			for(int j=i+1;j<=splitstr.length-1;j++){
				if(splitstr[i].equals(splitstr[j])){
					count ++;
					System.out.print(splitstr[i] + " ");
				}
			}
		}
		System.out.println();
		System.out.println("Duplicate word count is : " +count);
		
		// if the count > 1 then replace the word as "" 
		if(count>1){				
			System.out.println("String without duplicate words : " +text.replace("java",""));
		}
		
	}
	
}
/*output:
Original String :we learn java basics as part of java sessions in java week1
Duplicate word from the String : java java java 
Duplicate word count is : 3
String without duplicate words : we learn  basics as part of  sessions in  week1


 */












