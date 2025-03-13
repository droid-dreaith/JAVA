package Mid_DataStructureActs;

import java.util.Scanner;
import java.util.HashSet;

public class ArraySwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        while (true) {
            System.out.println("Enter the size of the array (positive integer):");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0) break; // Accept only positive integers
                else System.out.println("Size must be a positive integer. Try again.");
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Clear the invalid input
            }
        }

        int[] array = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            while (true) {
                if (scanner.hasNextInt()) {
                    array[i] = scanner.nextInt();
                    break; // Valid integer input
                } else {
                    System.out.println("Invalid input. Please enter an integer:");
                    scanner.next(); // Clear invalid input
                }
            }
        }

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Sum of numbers in the array");
            System.out.println("2. Maximum and Minimum number in the array");
            System.out.println("3. Distinct numbers in the array");
            System.out.println("4. Exit");

            int choice;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                scanner.next(); // Clear invalid input
                continue;
            }

            switch (choice) {
                case 1: // Sum of numbers
                    int sum = 0;
                    for (int num : array) {
                        sum += num;
                    }
                    System.out.println("Sum of numbers: " + sum);
                    break;

                case 2: // Maximum and Minimum number
                    int max = array[0], min = array[0];
                    for (int num : array) {
                        if (num > max) max = num;
                        if (num < min) min = num;
                    }
                    System.out.println("Maximum number: " + max);
                    System.out.println("Minimum number: " + min);
                    break;

                case 3: // Distinct numbers
                    HashSet<Integer> distinctNumbers = new HashSet<>();
                    for (int num : array) {
                        distinctNumbers.add(num);
                    }
                    System.out.println("Distinct numbers: " + distinctNumbers);
                    break;

                case 4: // Exit
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
