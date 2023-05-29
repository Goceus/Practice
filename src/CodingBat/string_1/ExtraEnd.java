package CodingBat.string_1;

public class ExtraEnd {


    public static void main(String[] args) {
        System.out.println(extraEnd("Hi"));
    }

    public static String extraEnd(String str) {
        String result = "";
        result = (result + str.substring(str.length()-2, str.length())).repeat(3);
        return result;
    }

}
/*
Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.

extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"
 */
