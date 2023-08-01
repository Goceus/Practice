package java_coding_IQ.array;

import java.util.Arrays;

public class SortArrayDescending {

     /*
        Sort Array Descending

        Create a method that will sort the given array in descending order (largest to smallest).

        DO NOT USE any built in methods

        Ex:
            Input:
                [3, 4, 1, 3, 8, 6, -1, 5, 1, 2, 6]
            Output:
                [8, 6, 6, 5, 4, 3, 3, 2, 1, 1, -1]

     */


    public static int[] sortArrDesc(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] < arr[j]){
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

        System.out.println(Arrays.toString(sortArrDesc(x)));

    }
}
