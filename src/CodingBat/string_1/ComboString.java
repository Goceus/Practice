package CodingBat.string_1;

public class ComboString {

    public static void main(String[] args) {

    }

    public String comboString(String a, String b) {


        if (a.isEmpty()) {
            return b;
        } else if (b.isEmpty()) return a;

        String shortStr = "";
        String longStr = "";
        //String result = "";
        if (a.length() < b.length()) {
            shortStr = a;
            longStr = b;
        } else if (b.length() < a.length()) {
            shortStr = b;
            longStr = a;
        }
        return shortStr + longStr + shortStr;
    }
}
/*
Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).

comboString("Hello", "hi") → "hiHellohi"
comboString("hi", "Hello") → "hiHellohi"
comboString("aaa", "b") → "baaab"
 */
