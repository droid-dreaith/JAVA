import java.text.DecimalFormat;
import java.util.Scanner;
public class Account {

    public static void main(String[] args)
{
    double number = 1233432.90;
    String pattern = "###,###.##";
    DecimalFormat decimalFormat = new DecimalFormat(pattern);

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter initial balance for Account 1: ");

    double amount1=sc.nextDouble();
    String formattedAmount1 = decimalFormat.format(amount1);
    System.out.println("You have a balance of : $"+formattedAmount1);
    System.out.println("Enter initial balance for Account 2 :  " );
    double amount2 =sc.nextDouble();
    
    System.out.println("\n" + "============================");

    
    String formattedAmount2 = decimalFormat.format(amount2);
    System.out.println("You have a balance of : $"+formattedAmount2);
    System.out.println("Enter withdrawal Amount for Account1: ");
    double withdraw1 = sc.nextDouble();
    if (withdraw1 <= amount1) {
        amount1 -= withdraw1;
        System.out.println("Please wait.....substracting $ "+decimalFormat.format(withdraw1)+" from account 1");
        System.out.println("account1 balance: $"+decimalFormat.format(amount1));
        System.out.println("account2 balance: $"+formattedAmount2);
        double withdraw2 = sc.nextDouble();
        if (withdraw2 <= amount2) {
            amount2 -= withdraw2;
            System.out.println("Please wait.....substracting $ "+decimalFormat.format(withdraw2)+" from account 2");
            System.out.println("Account1 balance: $"+decimalFormat.format(amount1));
            System.out.println("Account2 balance: $"+decimalFormat.format(amount2));
        } else {
            System.out.println("Insufficient balance");
        }


    }
sc.close();

}



}