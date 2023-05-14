package CodingBat.warmup1;

public class StartHi {

    public boolean startHi(String str) {
        if (str.startsWith("hi ") || str.equals("hi")){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {


    }
}
/*
Given a string, return true if the string starts with "hi" and false otherwise.


startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false
 */