package java_coding_IQ.array;

import java.util.Arrays;

public class FirstDuplicateElement {

    /*
        First Duplicate Element

        Create a method that will find and return the first duplicate element
            parameter: int[]
            return: int
                if no duplicate elements are found return 0

        A duplicate element is when the number can be found multiple times in the array

        Ex:
            input:
                findDup(3, 5, 1, 5, -1, 5, 3)
            output:
                3

                -> 3 is the first duplicate found
     */

    public static int firstDupElement(int[] arr) {
        int count = 1;

        for (int i = 0; i < arr.length - 1; i++) {
            //System.out.println(arr[i]);
            for (int j = i + 1; j < arr.length; j++) {
                //System.out.println(arr[j]);
                if (arr[i] == arr[j]) {
                    count++;
                    return arr[i];
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        int[] a = {3, 5, 1, 5, -1, 5, 3};
        System.out.println(firstDupElement(a));
    }
}
