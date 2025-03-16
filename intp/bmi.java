import java.util.Scanner;

public class bmi{

    public static void main(String[] args) {
       try {Scanner sc = new Scanner(System.in);


     
        System.out.println("==========Welcome to BMI Calculator======= "+ "\n" + "May i know your name? ");
        String name = sc.nextLine();

        System.out.println("Hello 5" + name + "!" + "\n" + "Let's calculate your BMI");
        System.out.println("Enter your weight in kg: ");
        double weight = sc.nextDouble();

        System.out.println("Enter your height in cm: ");
        double height = sc.nextDouble();

        double bmi = weight / Math.pow(height/100, 2);
        System.out.println("Your BMI is: " + bmi);
      
        if (bmi < 18.5) {
            System.out.println("You are underweight");
        } else if (bmi >= 18.5 && bmi < 24.9){
            System.out.println("You are normal weight");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are overweight");
        } else {
            System.out.println("You are obese");
        }


       } catch (Exception e) {
           System.out.println("Invalid input");
       }

    }
}