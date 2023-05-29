package CodingBat.string_2;

public class CountHi {

    public static void main(String[] args) {

    }

    public int countHi(String str) {

        int countHi = 0;

        if(str.length() <= 1) return countHi;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='h' && str.charAt(i+1)=='i'){
                countHi++;
            }
        }
        return countHi;
    }
}
/*

Return the number of times that the string "hi" appears anywhere in the given string.

countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2
 */
