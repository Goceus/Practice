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
/*
### Create the `Item.java` file according the following requirements. The `Main` class will use the Item class objects to test different scenarios.
- name (String)
    - price (double)

  - create this `constructor` to initialize the variables:
    - 2 argument: name, price

  - create a `toString()` method  to disply the object in this format:
    > $itemName - $itemPrice

#### Main topics: class & object, instance variables, constructors, toString

Example:
```
  Item item = new Item("Folder", 4.99);
  System.out.println(item);
  Output:
    Folder - $4.99
  - declare these `instance variables`:

```
 */