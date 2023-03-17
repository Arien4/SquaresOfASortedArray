package practice;

// Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted
// in non-decreasing order.

// Squaring each element and sorting the new array is very trivial, could you find an O(n) solution
// using a different approach?

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // int[] nums = {-4, -1, 0, 3, 10};
        int[] nums = {-4};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }

    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int min = nums[i];
            int minPos = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] * nums[j] < min * min) {
                    min = nums[j];
                    minPos = j;
                }
            }
            nums[minPos] = nums[i];
            nums[i] = min * min;
        }
        return nums;
    }
}
