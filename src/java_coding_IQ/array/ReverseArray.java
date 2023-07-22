package java_coding_IQ.array;

import java.util.Arrays;

public class ReverseArray {

    /*
        Reverse Array

        Create a method that will reverse the given array

        Ex:
            Input:
                [3, 4, 5, 1, 2, 6]
            Output:
                [6, 2, 1, 5, 4, 3]

     */

    public static int[] reverseArr(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return arr;
    }


    public static void main(String[] args) {

        int[] x = {3, 4, 5, 1, 2, 6};
        System.out.println(Arrays.toString(reverseArr(x)));

    }
}
