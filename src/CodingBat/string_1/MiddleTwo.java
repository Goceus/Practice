package CodingBat.string_1;

public class MiddleTwo {
    public static void main(String[] args) {

    }

    public String middleTwo(String str) {
       int lengthOfSplitStr = str.length() / 2;
       return str.substring(lengthOfSplitStr-1, lengthOfSplitStr+1);
    }

}
/*
Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.

middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"
 */
