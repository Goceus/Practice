package java_coding_IQ.array;

public class MaxProfit {
     /*
        Max Profit

        Given an array of stock prices on different days calculate the maximum profit you could make buying it on one day and selling oon another.

        It is only possible to buy or sell once on each day

        Ex:
            Input:
                [8,3,3,1,4,9,12,11]
            Output:
                11

                -> Buying on day 4 for $1 and selling on day 7 when it is worth $12 gives the maximum profit of $11
    */

    public static int maxProfit(int[] arr) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sellingPrice = 0;
        int buyingPrice = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int x = i+1; x < arr.length; x++) {
                if (arr[x] < min) {
                    min = arr[x];
                }
            }
            //int buyingDay = i+1;
            buyingPrice = min;
            break;
        }

        for (int j = 0; j < arr.length; j++) {
            for (int y = j+1; y < arr.length; y++) {
                if (arr[y] > max) {
                    max = arr[y];
                }
            }
            //int sellingDay = j+1;
            sellingPrice = max;
            break;
        }

        return sellingPrice-buyingPrice;

    }

    public static void main(String[] args) {

        int[] x = {8, 3, 3, 1, 4, 9, 12, 13};
        System.out.println(maxProfit(x));

    }


}
