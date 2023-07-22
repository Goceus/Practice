package java_coding_IQ.array;

import java.util.*;

public class RemoveDuplicates {

     /*
        Remove Duplicates

        Create a method that will remove the duplicate values from an int array
        The returning array should only have one occurrence of each number

        Ex:
            Input:
                [3, 3, 4, 5, 1, 2, 6, 2, 5, 4, 2, 1, 3]
            Output:
                [3, 4, 5, 1, 2, 6]

     */

    public static int[] removeDuplicate(int[] arr){

        Set<Integer> unique = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            unique.add(arr[i]);
        }
        int[] uniqueArr = new int[unique.size()];
        int index = 0;

        for (Integer each : unique){
            uniqueArr[index++]=each;
        }
        return uniqueArr;
    }


    public static void main(String[] args) {

        int[] x = {3, 3, 4, 5, 1, 2, 6, 2, 5, 4, 2, 1, 3};
        System.out.println(Arrays.toString(removeDuplicate(x)));

    }

}
