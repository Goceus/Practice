package Replit.tjMaxx;
/*
  DO NOT TOUCH ANYTHING BELOW
*/

import java.util.Scanner;

public class Main {
    static TJMaxx store = new TJMaxx();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Number of regular items
        int regularItems = input.nextInt();
        // Number of on sale items
        int saleItems = input.nextInt();
        // add all regular items
        for(int i=0; i < regularItems; i++){
            store.addRegularItem(new Item(input.next(), input.nextInt(), input.nextInt(), input.nextDouble()));
        }
        // add all on sale items
        for(int i=0; i < saleItems; i++){
            store.addOnSaleItem(new OnSaleItem(input.next(), input.nextInt(), input.nextInt(), input.nextDouble(), input.nextDouble()));
        }
        //Test the different methods
        int test = input.nextInt();

        switch (test){
            case 1:
                System.out.println(store.getAllItemNames());
                break;
            case 2:
                System.out.println(store.getItemPrice(input.nextInt()));
                break;
            case 3:
                System.out.println(store.getOnSaleItem(input.next()));
                break;
            case 4:
                int before = store.regularItemsCount() + store.onSaleItemsCount();
                store.buyItem(input.nextInt());
                int after =  store.regularItemsCount() + store.onSaleItemsCount();
                System.out.print(before == after);
            case 5:
                int num = input.nextInt();
                store.buyItem(num);
                System.out.println(ExtraUtil.getItemFromCatNum(num).getQuantity());
                break;
            case 6:
                int num2 = input.nextInt();
                store.buyItem(num2);
                System.out.println(ExtraUtil.getSaleFromCatNum(num2).getQuantity());
                break;
        }

        input.close();

    }
} // end of main method

class ExtraUtil{

    public static Item getItemFromCatNum(int num){
        for(Item each: Main.store.getRegularItems()){
            if(each.getCatalogNumber() == num){
                return each;
            }
        }
        return null;
    }

    public static OnSaleItem getSaleFromCatNum(int num){
        for(OnSaleItem each: Main.store.getOnSaleItems()){
            if(each.getCatalogNumber() == num){
                return each;
            }
        }
        return null;
    }

}
/*
### We want to represent our collection of books in our bookshelf. We will need to build up the `Book` and `Shelf` classes to represent the information of each in java.

### Finish the `Item` class according to all the given comments.	Then work on the `OnSaleItem` class according to all the given comments. Lastly work on the `TJMaxx` class. Each method or part you need to work on has comments to explain what to do in that section. Look for `todo comments` of where you will need to work. Examples of each sections functionality are given in the comments

> Note: Do not change anything in the main method

What you will practice in this practice:

	- inheritance
	- constructors and calling parent class constructor
	- overriding
	- List with custom classes

Main topics: encapsulation, inheritance, class & object, instance variables, constructors, toString, ArrayList, methods


 */