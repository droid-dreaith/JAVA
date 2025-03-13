import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class bank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //PROMPT 1 IS TO ENTER NAME
     System.out.println("==================Welcome to ABCD Bank System!===================");
     System.out.println("Enter the name : ");
     String name = sc.nextLine();

     System.out.println("Enter a number: ");
     String userInput = sc.nextLine();

     try{
        //parse the input as a number
        double parsedNumber = parseNumber(userInput);

        //format number using specified pattern
        String formattedNumber = formatNumber(parsedNumber);
        System.out.println("Formatted Number: " + formattedNumber);

     }catch (NumberFormatException e){
        System.out.println("Invalid input");
     }

     //Step 4:generate account useing time or date
     Date thisDate = new Date();
     SimpleDateFormat dateForm = new SimpleDateFormat("yyyyMMddhh");
     System.out.println("Generated Account Number: "+dateForm.format(thisDate));

     //STEP 5:GREETINGS
     System.out.println("Welcome to ABCD Bank System! \n "+ "Hello" + name + "!");

     System.out.println("The initial deposit : "+ userInput);

     int InitialDeposit = (int) Double.parseDouble(userInput);
     int Balance =InitialDeposit;

     //STEP 6 : WHAT ACCOUNT TYPE?
     if (InitialDeposit >= 100 && InitialDeposit < 10000) {
        System.out.println("You have a regular account");
     } else if (InitialDeposit >= 10100 && InitialDeposit < 1000000) {
        System.out.println("You have a premium account \n Transaction fee P8");
     } else if (InitialDeposit > 1000000){
        System.out.println("You have a platinum account");
     } System.out.println("Options:");
     int Choice;
     do{
     System.out.println("1. Deposit");
     System.out.println("2. Withdraw");     
     System.out.println("3. Check Balance");
     System.out.println("4. Exit");

     System.out.println("Enter your choice: ");
        Choice = sc.nextInt();

        double InitialAmount;
        switch (Choice){
        case 1:
        System.out.println("Enter the amount to deposit: ");
        InitialAmount = sc.nextDouble();
        Balance += InitialAmount;
        System.out.println("Your new balance is: " + Balance);
        break;
        
        case 2:
        System.out.println("Enter the amount to withdraw: ");
        InitialAmount = sc.nextDouble();
        Balance -= InitialAmount;
        System.out.println("Your new balance is: " + Balance);
        break;
        case 3:
        System.out.println("Your balance is: " + Balance);
        break;

        case 4:
        System.out.println("Thank you for banking with us!");
        break;
    }
    } while (Choice != 4);

    sc.close();
    }

    private static double parseNumber(String input) throws NumberFormatException {
        return Double.parseDouble(input);

    }

    private static String formatNumber(double number) {
        DecimalFormat decimalFormat = new DecimalFormat("#,###,###.00");
        return decimalFormat.format(number);
     
    }
}