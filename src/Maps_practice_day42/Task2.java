package Maps_practice_day42;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.LinkedHashMap;

public class Task2 {

    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson", 125000);
        map.put("Steven", 135000);

        //2.1 who has the maximum and minimum salary?
        Integer min = Integer.MAX_VALUE;
        Integer max = Integer.MIN_VALUE;
        String maxName = "";
        String minName = "";

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {

            if (eachEntry.getValue() > max) {
                max = eachEntry.getValue();
                maxName = eachEntry.getKey();
            }
            if (eachEntry.getValue() < min) {
                min = eachEntry.getValue();
                minName = eachEntry.getKey();
            }
        }
        System.out.println("Maximum salary has " + maxName + ": " + max + " and minimum salary has " + minName + ": " + min);
        System.out.println("--------------------------------------------------------------------------------------------------");


        //2.2 how many employees has the salary between 120k ~ 150K?
        int count = 0;

        for (Integer eachValue : map.values()) {
            if (eachValue >= 120_000 && eachValue <= 150_000) {
                count++;
            }
        }
        System.out.println(count + " of employees have salaries between 120K and 150K");
        System.out.println("--------------------------------------------------------------------------------------------------");


        //2.3 display the names of the employees who are making less than 118k?
        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            if (eachEntry.getValue() < 118_000) {
                System.out.println(eachEntry.getKey() + " has salary that is less than 118K");
            }
        }
        System.out.println("--------------------------------------------------------------------------------------------------");

        //2.4 increase the salary employee by 10K if the current salary of employee is less than 120K
        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            if (eachEntry.getValue() < 120_000) {
                eachEntry.setValue(eachEntry.getValue() + 10_000);
            }
        }
        System.out.println(map);


    }


}
/*
2. Given following map that contains employee name and employee salary:
	 Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

    2.1 who has the maximum and minimum salary?

    2.2 how many employees has the salary between 120k ~ 150K?

    2.3 display the names of the employees who are making less than 118k?

    2.4 increase the salary employee by 10K if the current salary of employee is less than 120K
 */