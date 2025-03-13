package Mid_DataStructureActs;

import java.util.Scanner;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input array size:");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be a positive number.");
            return;
        }

        int[] array = new int[n];
        System.out.println("Input " + n + " values:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int max = array[0];
        int min = array[0];

        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Maximum VALUE: " + max);
        System.out.println("Minimum VALUE: " + min);
    }
}