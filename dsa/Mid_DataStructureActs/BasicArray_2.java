package Mid_DataStructureActs;

import java.util.Arrays;

public class BasicArray_2 {

    /**
     * This method calculates the maximum difference between two elements in an array.
     * It iterates through the array once, keeping track of the minimum element seen so far.
     * The maximum difference is updated whenever a larger difference is found.
     *
     * @param nums The input array.
     * @return The maximum difference between two elements in the array.
     */
    public static int diff_between_two_elements(int[] nums) {
        if (nums.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }

        int minElement = nums[0];
        int maxDiff = Integer.MIN_VALUE;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < minElement) {
                minElement = nums[i];
            } else {
                maxDiff = Math.max(maxDiff, nums[i] - minElement);
            }
        }

        return maxDiff;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 7, 8, 5, 11, 4};
        System.out.println("\nOriginal Array: " + Arrays.toString(nums));
        System.out.println("The maximum difference between two elements of said array elements\n"
                + BasicArray_2.diff_between_two_elements(nums));
    }
}