package Mid_DataStructureActs;

import java.util.*;
import java.util.Scanner;


public class rectangleMethod { //instance variables
	double length;
	double width;
	
	public rectangleMethod(double length,double width) { // constructor = it initialize length and width
		//this keyword differentiates the instance variables from the parameters.
		this.length = length;
		this.width = width;
		
	}
	
	public void calculatePerimeter() { 
		double perimeter;
		perimeter = 2 * (this.length + this.width);
		System.out.println("Perimeter: " + perimeter);
	}
	
	public void calculateArea() {
		double area;
		area = this.length * this.width;
		System.out.println("Area is: "+ area);
	}
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length: ");
		double length=sc.nextDouble();
		System.out.println("Eneter width: ");
		double width = sc.nextDouble();
		
		rectangleMethod rectangle = new rectangleMethod(length,width);
		
		rectangle.calculatePerimeter();
		rectangle.calculateArea();
		
	}

}
