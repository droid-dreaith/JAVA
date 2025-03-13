package Mid_DataStructureActs;

public class EvenSquareCube_forloop {

	public static void main(String[] args) {
	int[] numbers = {2,4,6,8,10};
	int totalSquare = 0;
	int totalCube = 0;
	
	System.out.println("Number\tSquare\tCube");
	for (int number : numbers) {
		int square = getSquare(number);
		int cube = getCube(number);
		totalSquare += square;
		totalCube += cube;
		System.out.println(number + "\t" +square + "\t"+ cube);
	}
	
	System.out.println("Total\t" + totalSquare + "\t" + totalCube);
	}

	static int getCube(int number) {
		
		return(int)Math.pow(number,3);
	}

	static int getSquare(int number) {
		
		return(int) Math.pow(number, 2);
	}

}
