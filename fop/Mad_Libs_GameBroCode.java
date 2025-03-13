package brocode;

import java.util.Scanner;

public class Mad_Libs_GameBroCode {
    public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)){

       String adjective1;
       String noun1;
       String adjective2;
       String verb1;
       String adjective3;


       System.out.println("=======Welcome This is Mad Libs Game!=========");
       System.out.println("\n" + "Enter an adjective: ");
       adjective1 = sc.nextLine(); 

       System.out.println("Enter a noun:");
       noun1 = sc.nextLine();

       System.out.println("Enter a adjective: ");
       adjective2 = sc.nextLine();

       System.out.println("Enter a verb: ");
       verb1 = sc.nextLine();

       System.out.println("Enter another adjective: ");
       adjective3 = sc.nextLine();

    

		System.out.println();
		System.out.println("Today i went to" + adjective1 + " place.");
		System.out.println("At the entrance,I suddenly saw "+ noun1);
		System.out.println(noun1 + " was " + adjective2 + verb1);
		System.out.println("I am very  "+adjective3);
        System.out.println("=======Thank you for playing!=========");

   
    }

}}


