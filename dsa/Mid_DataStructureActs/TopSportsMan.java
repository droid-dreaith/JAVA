package Mid_DataStructureActs;

import java.util.Scanner;

public class TopSportsMan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				String[] athleteNames =new String[5];
				double[] athleteSales =new double[5];
				double totalSales = 0;
		
				//prompt user to enter NAMES AND SALES ng TOP 5 ATHLETES
				for(int i=0; i<5; i++) {
					System.out.println("=========  Hello !  ==========\nEnter the name of athlete " + (i+1) + ":");
					athleteNames[i] = sc.next();
					
					System.out.println("Enter the Sales of Athlete  " + (i+1) + ":");
					athleteSales[i] = sc.nextDouble();
					
					//calculate total sales
					totalSales +=athleteSales[i];
				}
				
				System.out.println("Top Sports Man");
				System.out.println("Name\tSales");
				System.out.println("========================================");
				
				
				for (int i = 0; i < 5; i++) {
				    System.out.printf("%s\t$%,.2f%n", athleteNames[i], athleteSales[i]);
				}
				System.out.println("========================================");
				System.out.printf("Total $%,.2f%n", totalSales);
				
				
	}
}
