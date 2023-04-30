package Replit.country;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // DO NOT TOUCH ANY CODE HERE

        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        input.nextLine();
        switch (test) {
            case 1:
                test(new Country(input.nextLine(), input.nextLine()));
                break;
            case 2:
                test(new Country(input.nextLine(), input.nextLine(), input.nextLong()));
                break;
            case 3:
                test(new Country(input.nextLine(), input.nextLine(), input.nextLong(), input.nextBoolean()));
                break;
        }
        input.close();

    }

    public static void test(Country c) {
        System.out.println(c.name);
        System.out.println(c.continent);
        System.out.println(c.population);
        System.out.println(c.nearWater);
    }




}
/*
### Create the `Country.java` file according the following requirements. The `Main` class will use the Country class objects to test different scenarios.

  - declare these `instance variables`:
    - name (String)
    - continent (String)
    - population (long)
    - nearWater(boolean)

  - create these `constructors` to initialize the variables:
    - 2 argument: name, continent
    - 3 argument: name, continent, population
    - 4 argument: name, continent, population, nearWater

#### Main topics: class & object, instance variables, constructors, constructor chaining

 */