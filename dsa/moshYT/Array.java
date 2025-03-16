package moshYT.java;

public class Array {

	private int[] items;
	
	private int count;
	
	
	public Array(int length) {
		items = new int[length];
	}
	
	
	public void insert(int item) {
		//ifthearray is full ,resize it
		
		//addthe new item at the end
		items[count] = item;
		count++;
		//
	}
	public void print() {
		for (int i = 0; i < count;i++)
			System.out.println(items[i]);
	}

}
