package CodingBat.warmup2;

import java.security.spec.AlgorithmParameterSpec;
import java.util.Scanner;

public class AltPairs {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word/sentence");
        String inputStr = input.nextLine();

        System.out.println(altPairs(inputStr));

    }

    public static String altPairs(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i+=4) {
            int end = i + 2;
            if (end > str.length()) {
                end = str.length();
            }
            newStr = newStr + str.substring(i, end);
        }
        return newStr;
    }

}
/*
Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".


altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"
 */