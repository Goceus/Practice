package java_coding_IQ.array;

public class MaxNumber {
    /*
        Max Number

        Create a method that will find and return the max number in an int array
            parameter: int[]
            return: int

        The max number is the biggest value in the array

        Ex:
            input:
                max(3, 5, 1, 5, -1, 5)
            output:
                5
     */


    /**
     * Methid returns the maximum int element from an array. Takes int array as parameter.
     * @param arr
     * @return
     */
    public static int maxNumber(int[] arr) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


    public static void main(String[] args) {

        int[] x = {-3, -5, -1, 0, -10};
        System.out.println("The maximum number in the array you've entered is " + maxNumber(x));

    }
}
