package CodingBat.warmup1;

public class Makes10 {

    public boolean makes10(int a, int b) {
        if((a == 10 || b == 10) || a + b == 10){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {

        Makes10 obj1 = new Makes10();
        System.out.println(obj1.makes10(1, 9));
    }
}
/*
Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.


makes10(9, 10) → true
makes10(9, 9) → false
makes10(1, 9) → true
 */