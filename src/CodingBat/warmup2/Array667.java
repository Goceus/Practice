package CodingBat.warmup2;

import java.util.Scanner;

public class Array667 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] arr = new int[4];
        System.out.println("Please enter 4 digits to be added in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

    }

    public int array667(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length-1; i++) {

            if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
                count++;
            }
        }
            return count;
    }

}
/*
Given an array of ints, return the number of times that two 6's are next to each other in the array. Also count instances where the second "6" is actually a 7.

array667([6, 6, 2]) → 1
array667([6, 6, 2, 6]) → 1
array667([6, 7, 2, 6]) → 1
 */
