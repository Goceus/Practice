package java_coding_IQ.array;

public class FrequencyOfEachElement {

    /*
        Frequency Of Each Element

        Given an array find the frequency of each element. The frequency is the number of times each element appears in the array

        Ex:
            input:
                frequencyElement("Apple","Banana","Apple","Cherry")
            output:
                Apple = 2
                Banana = 1
                Cherry = 1
     */

    public static void frequencyOfEachElement(String[] arr) {

        String str = "";

        for (String each : arr) {
            int count = 0;

            if (!str.contains(each)) {
                for (String secondEach : arr) {
                    if(each.equals(secondEach)) {
                        count++;
                    }
                }
                str += each + " = " + count + "\n";
            }
        }
        System.out.println(str);

    }

    public static void main(String[] args) {

        String[] x = {"Apple", "Banana", "Apple", "Apple", "Banana", "Cherry"};
        frequencyOfEachElement(x);


    }

}
