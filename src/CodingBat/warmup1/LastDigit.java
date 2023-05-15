package CodingBat.warmup1;

public class LastDigit {

    public boolean lastDigit(int a, int b) {

        String x = ""+a;
        String y = ""+b;
        if(x.charAt(x.length()-1) == y.charAt(y.length()-1)){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {



    }
}
/*

Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.


lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true
 */