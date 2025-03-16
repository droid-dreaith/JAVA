package Mid_DataStructureActs;

public class SimpleAlgo { //naming conventions must be start with " CAPITAL LETTER "

	public static void main(String[] args) {
		
		double[] numbers = {1.0,2.0,3.0,4.0,5.0,6.0}; //example array
		double average = calculateAverage(numbers);
		System.out.println("Average: "+ average);
	}
	public static double calculateAverage(double[] numbers) {
		double total = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			total += numbers[i];
		}
		return total / numbers.length;
	}
}
	
		
		/*double total=0;
			
			
			for(int=0;int<numbers.length;i++) {
				total +=numbers[i];
			}
			return total/numbers.length;
		*/
