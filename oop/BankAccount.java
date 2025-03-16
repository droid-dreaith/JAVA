
public class BankAccount{

    //Account details:
    public static void printDetails(BankAccount account) {
    System.out.println("Account Holder: "+ account.getAccName() + "\nBalance:"+ account.getBalance());
    System.out.println();

}
    private final String accName;
    private final int pin;
    private double balance;

    //constructor
    public BankAccount(String accName, int pin,double balance) {
        this.accName = accName;
        this.pin = pin;
        this.balance = balance;
    }
//Getters and setters
    public String getAccName() {
        return accName;
    }

    public double getBalance() {
        return balance;
    }
    public boolean verifyPin(int inputPin) {
        return this.pin == inputPin;
    }

    public void printDetails() {
        System.out.println("Account Holder: "+ accName + "\nBalance:"+ balance);
        System.out.println();
    }


    //deposit
    public void deposit(double amount){
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Succesfull!: "+ amount);
            System.out.println("New Balance: "+ balance);
        }else{
            System.out.println("Invalid Amount");
        }
    }


    //withdraw
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw Succesfull!: "+ amount);
            System.out.println("New Balance: "+ balance);
            return true;
        } else {
            System.out.println("Insufficient or Invalid fundsfor withdrawal!");
            return false;
        }
    
    }
}



