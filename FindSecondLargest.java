package week3.day2.collectionassignment;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7};
		int dataLenght = data.length;
		System.out.println("Length of the Array : "+dataLenght);
		System.out.print("Sorted Array Elements : ");
		Arrays.sort(data);
		for(int i=0 ; i<dataLenght ; i++)
		{
			System.out.print(data[i] + " ");
		}
		System.out.println();
		System.err.println("Second Largest Element : "+data[dataLenght-2]);
		
		
	}

}
