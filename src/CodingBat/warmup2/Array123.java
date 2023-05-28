package CodingBat.warmup2;

import java.util.Arrays;
import java.util.Scanner;

public class Array123 {

    public static void main(String[] args) {

        Array123 objt1 = new Array123();
        Scanner input = new Scanner(System.in);
        int[] newArr = new int[5];
        System.out.println("Enter 5 digits to add to array:");
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = input.nextInt();
        }
        System.out.println(objt1.array123(newArr));

    }

    public boolean array123(int[] nums) {

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i+2] == 3) return true;
        }
        return false;
    }

}
/*

Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.


array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true
 */