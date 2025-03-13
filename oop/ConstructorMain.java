import java.util.Scanner;

public class ConstructorMain {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.print("Hello user! Please enter your name: ");
        String name = sc.nextLine();

        System.out.print("Please enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline character


        System.out.print("Please enter your order: ");
        String order = sc.nextLine();

        System.out.println("Thank you for your input! Order created successfully!");
        ConstructorSubclass user = new ConstructorSubclass(name, age, order);
        System.out.println("Name: " + user.name);
        System.out.println("Age: " + user.age);
        System.out.println("Order: " + user.order);
    }
}
