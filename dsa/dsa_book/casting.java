package dsa_book;

public class casting {

	public static void main(String[] args) {
		
		//when casting from double to int, we may lose precision.This means that the resulting dpuble value will be rounded down.
		
		double d1 = 3.2;
		
		double d2 = 3.9999;
		
		int i1 = (int)d1;
		
		int i2 = (int)d2;
		
		double d3 = (double)i2;
		
		//anong exact value nung mga variables :
		
		System.out.println(d1);
		System.out.println(d2 + " \n " + " \n ");
		
		 System.out.println("Ordinary Casting: ");
		System.out.println(i1);          //i1 has value 3
		
		System.out.println(i2);          //I2 HAS VALUE 3
		 
		System.out.println(d3);          //d3 has value 3.0

		
		
		//CASTING WITH OPERATORS
		
		int c1 = 3;
		int c2 = 6;
		
		dresult =(double) c1 / (double)c2);         // value has 0.5
		
		dresult = c1 / c2; //value 0.0
		
		System.out.println(dresult);
	}

}
