package CodingBat.warmup1;

public class Diff21 {

    public int diff21(int n) {

        int result = 0;
        if(n > 21){
            result = (n - 21 ) * 2;
        }else if (n == 21){
            result = 0;
        }else {
            result = 21 - n;
        }
            return result;
    }


    public static void main(String[] args) {



    }

}
/*


Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.


diff21(19) → 2
diff21(10) → 11
diff21(21) → 0
 */