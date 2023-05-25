package CodingBat.warmup2;

public class DoubleX {

    boolean doubleX(String str) {
        for (int i = 0; i < str.length()-1; i++) {
            if( str.indexOf('x') == i && str.substring(i, i+2).equals("xx") ){
                return true;
            }
        }
        return false;
    }


}
/*

Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".


doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true

 */