package Maps_practice_day42;

import java.util.*;

public class Task5 {

    public static void main(String[] args) {


        Map<String, Double> unit1 = new LinkedHashMap<>();
        unit1.put("Print Statements", 4.0);
        unit1.put("Escape Sequences", 2.0);
        unit1.put("Primitives", 4.0);
        unit1.put("Operators", 6.0);
        unit1.put("If Statements", 9.0);
        unit1.put("Switch Statement", 4.0);
        unit1.put("Scanner", 6.0);

        Map<String, Double> unit2 = new LinkedHashMap<>();
        unit2.put("String Manipulation", 12.0);
        unit2.put("Loops", 17.5);
        unit2.put("Branching Statements", 1.5);
        unit2.put("Arrays", 14.5);
        unit2.put("Custom Methods", 16.5);
        unit2.put("Wrapper Classes", 3.0);
        unit2.put("Scanner", 6.0);

        Map<String, Double> unit3 = new LinkedHashMap<>();
        unit3.put("Custom Methods", 16.5);
        unit3.put("Wrapper Classes", 3.0);
        unit3.put("ArrayList", 11.5);

        Map<String, Double> unit4 = new LinkedHashMap<>();
        unit4.put("Custom Class", 23.5);
        unit4.put("Access Modifiers", 2.5);

        Map<String, Double> unit5 = new LinkedHashMap<>();
        unit5.put("OOP Encapsulation", 4.5);
        unit5.put("OOP Inheritance", 13.5);
        unit5.put("Final keyword", 2.5);
        unit5.put("Exceptions", 8.5);

        Map<String, Double> unit6 = new LinkedHashMap<>();
        unit6.put("OOP Abstraction", 9.5);
        unit6.put("OOP Polymorphism", 7.5);
        unit6.put("Collection", 9.5);
        unit6.put("Map", 7.5);


        //5.1 Create a List and store all the map objects given in above
        List<Map<String, Double>> allMaps = new ArrayList<>();
        allMaps.addAll(Arrays.asList(unit1, unit2, unit3, unit4, unit5, unit6));
        System.out.println(allMaps);
        System.out.println("-------------------------------------------------------------------------------------------");


        //5.2 Display each Java topic and its hours on the console
        for (Map<String, Double> eachMap : allMaps) {
            for (Map.Entry<String, Double> eachMapEntry : eachMap.entrySet()) {
                System.out.println("Java topic is " + eachMapEntry.getKey() + " and " + eachMapEntry.getValue() + " amount of hours were spent on it");
            }
        }
        System.out.println("-------------------------------------------------------------------------------------------");

        //5.3 Display the names of the java topics that we spend more than 7 hours
        for (Map<String, Double> eachMap : allMaps) {
            for (Map.Entry<String, Double> eachMapEntry : eachMap.entrySet()) {
                if (eachMapEntry.getValue() > 7) {
                    System.out.println("On " + eachMapEntry.getKey() + " more than 7 hours were spent.");
                }
            }
        }
        System.out.println("-------------------------------------------------------------------------------------------");


        //5.4 Display the names of the java topics that we spend less than 3 hours
        for (Map<String, Double> eachMap : allMaps) {
            for (Map.Entry<String, Double> eachEntry : eachMap.entrySet()) {
                if (eachEntry.getValue() < 3) {
                    System.out.println("On " + eachEntry.getKey() + " less than 3 hours was spent.");
                }
            }
        }
        System.out.println("-------------------------------------------------------------------------------------------");


        //5.5 Which Java Topic has the maximum hours?
        Double maxHours = Double.MIN_VALUE;
        Object a = new Object();

        for (Map<String, Double> eachMap : allMaps) {

            for (Map.Entry<String, Double> eachEntry : eachMap.entrySet()) {
                if (eachEntry.getValue() > maxHours) {
                    maxHours = eachEntry.getValue();
                    a = eachEntry;
                }
            }
        }
        System.out.println(a + " has the maximum hours");
        System.out.println("-------------------------------------------------------------------------------------------");


        // 5.6 Which topic has the minimum hours?
        Double minHours = Double.MAX_VALUE;
        Object b = new Object();

        for (Map<String, Double> eachmap : allMaps) {
            for (Map.Entry<String, Double> eachEntry : eachmap.entrySet()) {
                if (eachEntry.getValue() < minHours) {
                    minHours = eachEntry.getValue();
                    b = eachEntry;
                }
            }
        }
        System.out.println(b + " has the minimum hours");


    }
}
/*
5. 	Given the following maps that contains the Java topics of each unit and the amount of hours that we spend on it:

        5.1 Create a List and store all the map objects given in above

        5.2 Display each Java topic and its hours on the console

        5.3 Display the names of the java topics that we spend more than 7 hours

        5.4 Display the names of the java topics that we spend less than 3 hours

        5.5 Which Java Topic has the maximum hours?

        5.6 Which topic has the minimum hours?
 */