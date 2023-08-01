package java_coding_IQ.array;

public class TriplesArray {

     /*
        Triples Array

        Create a method that will determine if the array has a triple or not. A triple is when an element is repeat 3 times in a row. If any number is repeat 3 times in a row return false. If the array does not have any triples return true

        Ex:
            noTriples([1, 1, 2, 2, 1]) → true
            noTriples([1, 1, 2, 2, 2, 1]) → false
            noTriples([1, 1, 1, 2, 2, 2, 1]) → false

     */


    public static boolean noTriples(int[] arr) {

        for (int i = 0; i < arr.length-2; i++) {// length is -2 because...
            if(arr[i] == arr[i+1] && arr[i] == arr[i+2]) return false;//...we assign +2 in the index of the array in the loop.
        }
        return true;
    }


    public static void main(String[] args) {
        int[] x = {1, 1, 2, 2, 1, 2};
        System.out.println("noTriples(x) = " + noTriples(x));
    }
}
