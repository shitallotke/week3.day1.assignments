/*
	 * Pseudo Code
	//Intersection : common element from the both array
	 * a) Declare An array for {3,2,11,4,6,7};	 
	 * b) Declare another array for {1,2,8,4,9,7};
	 * c) Declare for loop iterator from 0 to array length
	 * d) Declare a nested for another array from 0 to array length
	 * e) Compare Both the arrays using a condition statement
	 
	 *  f) Print the first array (shoud match item in both arrays)
	 */

package week3.day1.assignment;

public class FindInterSection {

	public static void main(String[] args) {
		//Declare An array for {3,2,11,4,6,7};
		int[] arr1 = {3,2,11,4,6,7};
		//Declare another array for {1,2,8,4,9,7};
		int[] arr2 = {1,2,8,4,9,7};
		
		System.out.println("Intersection of two arrays : ");
		//Declare for loop iterator from 0 to array length
		for (int i=0;i<arr1.length;i++)
		{
			//Declare a nested for another array from 0 to array length
			for (int j=0;j<arr2.length;j++)
			{
				//Compare Both the arrays using a condition statement
				if(arr1[i]==arr2[j])
				{
					System.out.print(arr1[i] + " ");
				}
			}
		}
		
	}
}
/*
 output :
  Intersection of two arrays : 
  2 4 7 
  */