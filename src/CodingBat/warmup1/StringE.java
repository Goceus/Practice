package CodingBat.warmup1;

public class StringE {

    public boolean stringE(String str) {

        int countE = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'e'){
                countE++;
            }
        }
        if(countE >=1 && countE <=3){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {



    }
}
/*

Return true if the given string contains between 1 and 3 'e' chars.


stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
 */