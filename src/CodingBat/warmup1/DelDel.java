package CodingBat.warmup1;

public class DelDel {

    public String delDel(String str) {

       if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
            return str = str.substring(0, 1) + str.substring(4);
        }
        return str;
    }


    public static void main(String[] args) {

        DelDel del = new DelDel();
        System.out.println(del.delDel());


    }
}
/*

Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.


delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"
 */