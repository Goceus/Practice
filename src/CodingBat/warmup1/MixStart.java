package CodingBat.warmup1;

public class MixStart {

    public boolean mixStart(String str) {

        if (str.length() < 3) {
            return false;
        }
        String str2 = str.substring(1, 3);
        if (str2.equals("ix")) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {


    }

}
/*

Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.


mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false
 */