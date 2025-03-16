package Mid_DataStructureActs;

public class MaxSum {

    public static int maxSum(int[] A) {
        // Check for null or empty array
        if (A == null || A.length == 0) {
            return 0; // Return 0 for empty array
        }

        int maxSum = A[0]; // Initialize maxSum with the first element
        int thisSum = A[0]; // Initialize thisSum with the first element

        // Iterate through the array starting from the second element
        for (int i = 1; i < A.length; i++) {
            // Update thisSum to either the current element or the sum of thisSum and the current element
            thisSum = Math.max(A[i], thisSum + A[i]);

            // Update maxSum if thisSum is greater
            maxSum = Math.max(maxSum, thisSum);
        }

        return maxSum; // Return the maximum sum found
    }

    public static void main(String[] args) {
        int[] A = {1, -2, 3, 4, -1, 2, 1, -5, 4}; // Example array
        int result = maxSum(A);
        System.out.println("Maximum Sum of Contiguous Subarray: " + result);
    }
}