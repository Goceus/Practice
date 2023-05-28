package CodingBat.warmup2;

import java.util.*;

public class NoTriples {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please type in 5 digits to add to the array:");
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println(noTriples(arr));

    }
  public static boolean noTriples(int[] nums) {
  // Iterate < length-2, so can use i+1 and i+2 in the loop.
  // Return false immediately if every seeing a triple.
  for (int i=0; i < (nums.length-2); i++) {
    int first = nums[i];
    if (nums[i+1]==first && nums[i+2]==first) return false;
  }

  // If we get here ... no triples.
  return true;
}


    //Doesn't work if triples are found in array with length = 3.
    /*public static boolean noTriples(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        for (int i = 0; i < list.size()-2; i++) {
            if (Collections.frequency(list, list.get(i)) == 3) {
                return false;
            }
        }
        return true;
    }

     */

}
/*
Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.


noTriples([1, 1, 2, 2, 1]) → true
noTriples([1, 1, 2, 2, 2, 1]) → false
noTriples([1, 1, 1, 2, 2, 2, 1]) → false
 */