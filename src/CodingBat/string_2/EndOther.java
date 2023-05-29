package CodingBat.string_2;

public class EndOther {
    public static void main(String[] args) {

    }

    public boolean endOther(String a, String b) {

        a = a.toLowerCase();
        b = b.toLowerCase();

        if( a.contains(b) ) {
            if( a.substring( (a.length() - b.length()) ).equalsIgnoreCase(b) ){
                return true;
            }
        }

        if( b.contains(a) ){

            if( ( b.substring( (b.length() - a.length()) ) ).equalsIgnoreCase(a) ){
                return true;
            }

        }

        return false;
    }
}
/*
Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.

endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true
 */
