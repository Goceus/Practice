package java_coding_IQ.array;

import java.util.Arrays;

public class ConcatArray {

    /*
        Concat Arrays

        Create a method that will take two int arrays and concat them into one array. Concat the arrays by combining them into one array

        Ex:
            Input:
                [1, 4, 5], [8, 12, 5, 9]
            Output:
                [1, 4, 5, 8, 12, 5, 9]
     */

public static int[] concatArrays(int[] arr1, int[]arr2){


    int[] merge = Arrays.copyOf(arr1, arr1.length+arr2.length);

    for (int i = arr1.length; i < merge.length ; i++) {
        for (int j = 0; j < arr2.length; j++) {
                merge[i++] = arr2[j];
        }
    }
        return merge;
}

    public static void main(String[] args) {

    int[] a = {1, 4, 5};
    int[] b = {8, 12, 5, 9};
        System.out.println(Arrays.toString(concatArrays(a, b)));

    }
}
