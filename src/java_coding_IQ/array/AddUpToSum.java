package java_coding_IQ.array;

public class AddUpToSum {

    /*
        Add Up to Sum

        Given an int array and an int representing the sum number, create a program that can find the pair of numbers from the array that add up to the sum number

        Add the numbers from the array to determine the possible pairs that add up to the sum

        Ex:
            array = [8, 7, 2, 5, 3, 1]
            sum = 10

            output:
                8 & 2
                7 & 3
     */


    public static void addUpToSum(int[] arr, int sum) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println(arr[i] + " " + " " + arr[j]);
                }
            }
        }

    }


    public static void main(String[] args) {

        int[] array = {8, 7, 2, 5, 3, 1};
        addUpToSum(array, 9);

    }

}
