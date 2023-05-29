package CodingBat.string_1;

public class FirstHalf {
    public static void main(String[] args) {

    }

    public String firstHalf(String str) {
        String result = "";
        if ((str.length() % 2 == 0)) {
            result = result + str.substring( 0, (str.length() / 2) );
        }else{
            return str;
        }
        return result;
    }
}
/*
Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"
 */