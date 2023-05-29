package CodingBat.string_1;

public class WithouEnd2 {
    public static void main(String[] args) {

    }

    public String withouEnd2(String str) {
        if(str.isEmpty()){
            return str;
        }else if(str.length() <= 2) return "";

        return str.substring(1, str.length()-1);
    }
}
/*
Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.

withouEnd2("Hello") → "ell"
withouEnd2("abc") → "b"
withouEnd2("ab") → ""
 */
