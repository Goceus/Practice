package java_coding_IQ.array;

import java.util.Arrays;

public class SecondLargestNumber {

        /*
        Second-Largest Number

        Create a method that finds the second-largest number in the given array. The second largest must be different from the largest number.

        Ex:
            Input:
                [3, 4, 5, 1, 2, 6]
            Output:
                5

     */


    /**
     * Method accepts int array as parameter and prints out the second-largest element.
     * @param arr
     */
    public static void secondLargestNum(int[] arr) {

        for (int i = 0; i < arr.length; i++) {// sorting array elements in descending order.
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Second largest element in specified array is: " + arr[1]);

    }


    public static void main(String[] args) {

        int[] x = {3, 4, 5, 1, 2, 6, 10};

        secondLargestNum(x);

    }
}
