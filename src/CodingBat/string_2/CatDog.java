package CodingBat.string_2;

public class CatDog {

    public static void main(String[] args) {

    }

    public boolean catDog(String str) {
        int countCat = 0;
        int countDog = 0;

        for (int i = 0; i < str.length()-2; i++) {
            if (str.substring(i, i + 3).equals("dog")) {
                countDog++;
            }else if (str.substring(i, i + 3).equals("cat")) {
                countCat++;
            }
        }
        if(countDog == countCat) {
            return true;
        }
        return false;
    }
}
/*
Return true if the string "cat" and "dog" appear the same number of times in the given string.

catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true
 */
