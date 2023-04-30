package Replit.oop_item;

import java.util.Scanner;

public class Main extends Item{

    public Main(String name, double price){
        super(name, price);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Item item = new Item(input.nextLine(), input.nextDouble());
        System.out.println(item);
        input.close();
    }

}
