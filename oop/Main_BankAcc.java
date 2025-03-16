
import java.util.Scanner;


public class Main_BankAcc {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        //BANK ACCOUNT CREATION
        BankAccount[] accounts = new BankAccount[6];
        accounts[0] = new BankAccount("Susan Doe", 1234, 1000);
        accounts[1] = new BankAccount("Will Revillame", 5678, 2000);
        accounts[2] = new BankAccount("James Greed", 9012, 3000);
        accounts[3] = new BankAccount("Jill Doe", 3456, 4000);
        accounts[4] = new BankAccount("Jack Doe", 7890, 5000);
        accounts[5] = new BankAccount("Billy Doe", 3456, 4000);

    //display all accounts
    System.out.println("========Account Details==========");
    for (int i = 0; i < accounts.length; i++) {
        accounts[i].printDetails();
    }
    

    //ATM LOGIN
    System.out.println("Enter Account Holder Name: ");
    String accName = sc.nextLine();

    System.out.print("Enter PIN:");
    int enteredPin = sc.nextInt();

    BankAccount currentAccount = null;

    //autheticate account
    for (BankAccount account : accounts) {
        if (account.getAccName().equalsIgnoreCase(accName) && account.verifyPin(enteredPin)) {
            currentAccount = account;
            break;
        }
    }

    if (currentAccount == null) {
        System.out.println("Invalid credentials");
        sc.close(); // Close the scanner here
        return;
    }

    //Atm operations
    boolean exit = false;
    while(!exit) {
        System.out.println("1.Check Blanace");
        System.out.println("2.Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
        System.out.println("Choose Option: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                currentAccount.printDetails();
                break;
            case 2:
                System.out.print("Enter Amount to Deposit: ");
                double depositAmount = sc.nextDouble();
                currentAccount.deposit(depositAmount);
                break;
            case 3:
                System.out.print("Enter Amount to Withdraw: ");
                double withdrawAmount = sc.nextDouble();
                currentAccount.withdraw(withdrawAmount);
                break;
            case 4:
                exit = true;
                System.out.println("Thank you for using ATM");
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }
    }
    sc.close();
}
}