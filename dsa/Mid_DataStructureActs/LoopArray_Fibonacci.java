package Mid_DataStructureActs;

public class LoopArray_Fibonacci {

	public static void main(String[] args) {
		
		int n=13;
		//numebr of elements sa FIBONACCI SEQUENCE
		
		int[] fibonacciArrayloop = new int[n];
		//initialize the first two numebrs in the sequence
		
		fibonacciArrayloop[0] = 1;
		fibonacciArrayloop[1] = 1;
		
		
		
		//generate fibonacci sequence
		for(int i=2;i<n;i++) {
			fibonacciArrayloop[i] = fibonacciArrayloop[i-1] + fibonacciArrayloop[i-2];
			
		}
		
		//print fibonacci sequence
		System.out.println("Fibonacci Sequence: ");
		for(int i = 0;i <n; i++) {
			System.out.print(fibonacciArrayloop[i]+ " ");
		}
	}

}
