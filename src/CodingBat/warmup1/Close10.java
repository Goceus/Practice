package CodingBat.warmup1;

public class Close10 {

    public int close10(int a, int b) {
        int aVal = Math.abs(10-a);
        int bVal = Math.abs(10-b);

        if(aVal<bVal){
            return a;
        }

        if(bVal<aVal){
            return b;
        }
            return 0;
    }

    public static void main(String[] args) {



    }
}
/*

Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.


close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0
 */