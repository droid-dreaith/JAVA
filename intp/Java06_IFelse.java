import java.util.Scanner;

public class Java06_IFelse {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int age = null ;
        System.out.println("Enter age: "+ age);
    }
    static void checkAge(int age){

        if (age<18){
            System.out.println("Acess Denied - You are not old enough to enter this site");
        }else{
            System.out.println("Acess Granted - You are old enough to enter this site");

        }
    }
}