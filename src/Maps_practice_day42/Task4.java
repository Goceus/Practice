package Maps_practice_day42;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Hashtable;

public class Task4 {

    public static void main(String[] args) {

        Map<String, Object> car1 = new Hashtable<>();
        car1.put("brand", "BMW");
        car1.put("model", "X5");
        car1.put("color", "Red");
        car1.put("year", 2021);
        car1.put("price", 55000);
        car1.put("electric", false);

        Map<String, Object> car2 = new Hashtable<>();
        car2.put("brand", "Audi");
        car2.put("model", "Q7");
        car2.put("color", "Gray");
        car2.put("year", 2022);
        car2.put("price", 50000);
        car2.put("electric", false);

        Map<String, Object> car3 = new Hashtable<>();
        car3.put("brand", "Tesla");
        car3.put("model", "Model Y");
        car3.put("color", "White");
        car3.put("year", 2020);
        car3.put("price", 60000);
        car3.put("electric", true);

        Map<String, Object> car4 = new Hashtable<>();
        car4.put("brand", "Citroen");
        car4.put("model", "Ax");
        car4.put("color", "Red");
        car4.put("year", 1991);
        car4.put("price", 1400);
        car4.put("electric", false);

        Map<String, Object> car5 = new Hashtable<>();
        car5.put("brand", "Rover");
        car5.put("model", "X");
        car5.put("color", "Blue");
        car5.put("year", 1996);
        car5.put("price", 2000);
        car5.put("electric", false);
        System.out.println("------------------------------------------------------------------------------------------");

        //4.1 Create a map named myCars that takes car number as a key and car info as a value
        //        		Hint: key of the map need to be integer and value of the map need to be a map with String as key and Object as value
        Map<Integer, Map<String, Object>> myCars = new LinkedHashMap<>();
        myCars.put(1, car1);
        myCars.put(2, car2);
        myCars.put(3, car3);
        myCars.put(4, car4);
        myCars.put(5, car5);
        System.out.println(myCars);
        System.out.println("------------------------------------------------------------------------------------------");

        //4.2 Display the brand-model-price of each car
        for (Map<String, Object> eachCar : myCars.values()) {
            System.out.println(eachCar.get("brand") + " " + eachCar.get("model") + " " + eachCar.get("price"));
        }
        System.out.println("------------------------------------------------------------------------------------------");

        //4.3 Display all the electric cars
        for (Map<String, Object> eachCar : myCars.values()) {
            for (Object eachCarValue : eachCar.values()) {
                if (eachCarValue.equals(true)) {
                    System.out.println("Electric cars in the map of cars are: " + eachCar);
                }
            }
        }
        System.out.println("------------------------------------------------------------------------------------------");


        //4.4 Display the most expensive car
        Integer mostExpensiveCarPrice = Integer.MIN_VALUE;
        Object a = new Object();
        for (Map.Entry<Integer, Map<String, Object>> eachEntry : myCars.entrySet()) {
            if ((Integer) eachEntry.getValue().get("price") > mostExpensiveCarPrice) {
                mostExpensiveCarPrice = (Integer) eachEntry.getValue().get("price");
                a = eachEntry;
            }
        }
        System.out.println("The most expensive car is " + a);
        System.out.println("------------------------------------------------------------------------------------------");


    }
}
/*

4. Given the following maps that contains the different car informations:

		 Map<String, Object> car1 = new Hashtable<>();
	        car1.put("brand", "BMW");
	        car1.put("model", "X5");
	        car1.put("color", "Red");
	        car1.put("year", 2021);
	        car1.put("price", 55000);
	        car1.put("electric", false);

        Map<String, Object> car2 = new Hashtable<>();
	        car2.put("brand", "Audi");
	        car2.put("model", "Q7");
	        car2.put("color", "Gray");
	        car2.put("year", 2022);
	        car2.put("price", 50000);
	        car2.put("electric", false);

        Map<String, Object> car3 = new Hashtable<>();
	        car3.put("brand", "Tesla");
	        car3.put("model", "Model Y");
	        car3.put("color", "White");
	        car3.put("year", 2020);
	        car3.put("price", 60000);
	        car3.put("electric", true);

        (Create 3 more map objects and store 3 different car informations in them)

        4.1 Create a map named myCars that takes car number as a key and car info as a value
        		Hint: key of the map need to be integer and value of the map need to be a map with String as key and Object as value

		4.2 Display the brand-model-price of each car

		4.3 Display all the electric cars

		4.4 Display the most expensive car

 */