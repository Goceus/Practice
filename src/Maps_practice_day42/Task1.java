package Maps_practice_day42;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {

    public static void main(String[] args) {

        Map<String, int[]> studentScores = new LinkedHashMap<>();
        studentScores.put("James", new int[]{4, 3, 4, 5, 5});
        studentScores.put("Nicole", new int[]{2, 3, 5, 3, 4});
        studentScores.put("Robert", new int[]{5, 4, 4, 5, 3});
        studentScores.put("Hanna", new int[]{3, 2, 5, 4, 4});
        studentScores.put("Brandon", new int[]{4, 3, 4, 4, 5});

        //System.out.println(studentScores);

        for (Map.Entry<String, int[]> eachEntry : studentScores.entrySet()) {
            System.out.println("Student name is " + eachEntry.getKey() + " and " + eachEntry.getKey() + "'s scores are  " + Arrays.toString(eachEntry.getValue()));
        }


    }

}

/*
1. Create a map that can contain the student name (String) and student scores (int[]) as a pair (Assume that each student has 5 scores and make the student name unique)
		1.1 add at least 5 pairs into the map
		1.2 Write a program that can display each student name and scores
 */