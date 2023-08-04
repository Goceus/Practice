package java_coding_IQ.collections;

import java.util.*;

public class FrequencyOfCharacter {

 /*
        Frequency of Character

        Create a method that will determine the frequency of every character in the given String
            parameter: String
            return: void

        Ex:
            input:
                frequencyOfCharacter("banana apple pie")
            output:
                {b=1, a=4, n=2,  =2, p=3, l=1, e=2, i=1}
     */


    /**
     * Method takes a string parameter and prints out frequency of each character in the specified string.
     *
     * @param str from which frequency of each character will be printed.
     */
    public static void frequencyOfCharacter(String str) {

        Map<String, Integer> mapResult = new LinkedHashMap<>();// map container for the final result.
        char[] temp = str.toCharArray();// making the string into a char array.
        List<Character> temp2 = new ArrayList<>();// List of characters as a container to store each character from string array.

        for (int i = 0; i < temp.length; i++) {// adds each char from string array into the list of characters.
            temp2.add(temp[i]);
        }

        for (int i = 0; i < str.toCharArray().length; i++) {// puts in the map each character by index, and puts the frequency of each character calculated from the List of characters that contains each character from the string parameter.
            mapResult.put(str.substring(i, i + 1), Collections.frequency(temp2, str.toCharArray()[i]));
        }

        System.out.println("mapResult = " + mapResult);

    }

    public static void main(String[] args) {

        frequencyOfCharacter("banana apple pie");

    }
}
