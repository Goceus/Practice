package CodingBat.warmup2;

import java.util.Scanner;

public class ArrayFront9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 5 digits to add to the array:");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Result if one of first 4 numbers in the array is 9:");
        arrayFront9(arr);
    }

    public static boolean arrayFront9(int[] nums) {

          int end = nums.length;
          if(end > 4){
              end = 4;
          }

        for (int i = 0; i < end; i++) {
          if(nums[i] == 9){
              return true;
          }
        }
        return false;
        }

    }

    /*
    public boolean arrayFront9(int[] nums) {
  // First figure the end for the loop
  int end = nums.length;
  if (end > 4) end = 4;

  for (int i=0; i<end; i++) {
    if (nums[i] == 9) return true;
  }

  return false;
}
     */

/*

Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.


arrayFront9([1, 2, 9, 3, 4]) → true
arrayFront9([1, 2, 3, 4, 9]) → false
arrayFront9([1, 2, 3, 4, 5]) → false
 */
