package CodingBat.warmup1;

public class IntMax {

    public int intMax(int a, int b, int c) {
        int max = a;
        if (b > a && b > c) {
            max = b;
        } else if (c > a && c > b) {
            max = c;
        }
        return max;
    }


    public static void main(String[] args) {


    }
}
/*

Given three int values, a b c, return the largest.


intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3
 */