package moshYT.java;

import java.util.Arrays;

public class Mosh {

	public static void main(String[] args) {

		//LONGER VER for array because int[] numbers was initialized to new int and making more variables place like num[0]
		int[] numbers = new int[5];
		//shprter ver : int[] numbers = {10,20,30,40,50};
		
		
		numbers[0] = 10;
		numbers [1] =20;
		numbers[2] =30;
		numbers[3]=40;
		numbers [4]=50;
		
	
		System.out.println("Original Array value:" + Arrays.toString(numbers));
		

		//insert 
		numbers = insert(numbers,60);
		System.out.println("Updated Array value: " + Arrays.toString(numbers));
		
	}
	
	//method to insert a new number into array
	public static int[] insert(int[] original,int newValue) {
		//create new array with one extra space
		int[] newArray = new int[original.length + 1];
		
		for (int i=0; i < original.length; i++) {
			newArray[i] = original[i];
		}
		
		//insert new value at the end
		newArray[newArray.length - 1] = newValue;
		
		return newArray;
	}

}
