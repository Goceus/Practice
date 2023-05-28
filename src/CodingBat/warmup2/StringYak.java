package CodingBat.warmup2;

import java.util.Scanner;

public class StringYak {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word that contains \'yak\'");
        String result = input.nextLine();
        System.out.println("Result with removed \'yak\'");
        System.out.println(stringYak(result));


    }

    /*
    public String stringYak(String str) {
      String result = "";

      for (int i=0; i<str.length(); i++) {
        // Look for i starting a "yak" -- advance i in that case
        if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
          i =  i + 2;
        } else { // Otherwise do the normal append
          result = result + str.charAt(i);
        }
      }

      return result;
    }
     */
    public static String stringYak(String str) {
        String result = "";
        String[] strArray = str.split("");
        for (int i = 0; i < strArray.length; i++) {
           if(i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+1)=='a' && str.charAt(i+2)=='k'){
               i = i+2;
           }else{
               result = result + str.charAt(i);
           }
        }
        return result;
    }
}
/*
Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.


stringYak("yakpak") → "pak"
stringYak("pakyak") → "pak"
stringYak("yak123ya") → "123ya"
 */