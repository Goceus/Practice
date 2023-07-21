package java_coding_IQ.array;

import java.util.Arrays;

public class MoveZerosToEnd {
     /*
        Move Zeros to End

        Create a method that will accept an int array and return an array with all the zeros moved to the end

        Ex:
            Input:
                [5, 0, 2, 0, 0, 1, 0, 23]
            Output:
               [5, 2, 1, 23, 0, 0, 0, 0]
     */

    public static int[] moveZerosToEnd(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] == 0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] x = {5, 0, 2, 0, 7980, 34, 20, 0, 1, 0, 23, 999, 190, 0, 33};

        System.out.println("moveZerosToEnd(x) = " + Arrays.toString(moveZerosToEnd(x)));
    }

}
