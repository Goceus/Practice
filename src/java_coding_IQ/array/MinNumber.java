package java_coding_IQ.array;

public class MinNumber {

    /*
        Min Number

        Create a method that will find and return the min number in an int array
            parameter: int[]
            return: int

        The min number is the smallest value in the array

        Ex:
            input:
                min(3, 5, 1, 5, -1, 5)
            output:
                -1
     */


    public static int minNumber(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {

        int[] x = {3, 5, 1, 5, -1, -5};
        System.out.println("The smallest number in the array is: " + minNumber(x));

    }


}
