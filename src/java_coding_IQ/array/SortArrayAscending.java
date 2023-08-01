package java_coding_IQ.array;

import java.util.Arrays;

public class SortArrayAscending {

     /*
        Sort Array Ascending

        Create a method that will sort the given array in ascending order (smallest to largest).

        DO NOT USE any built in methods

        Ex:
            Input:
                [3, 4, 1, 3, 8, 6, -1, 5, 1, 2, 6]
            Output:
                [-1, 1, 1, 2, 3, 3, 4, 5, 6, 6, 8]

     */


    public static int[] sortArrInAsc(int[] arr){

        for (int i = 0; i < arr.length; i++) {// sorts an array in ascending order.
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;

    }

    public static void main(String[] args) {

        int[] x = {3, 4, 1, 3, 8, 6, -1, 5, 1, 2, 6};
        System.out.println(Arrays.toString(sortArrInAsc(x)));


    }
}
