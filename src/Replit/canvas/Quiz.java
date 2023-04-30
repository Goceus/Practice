package Replit.canvas;

public class Quiz {

    // Finish the Quiz class
    String topic;
    int totalNumQuestions;
    double totalPoints;

    public Quiz(String topic, int totalNumQuestions, double totalPoints){
        this.topic = topic;
        this.totalNumQuestions = totalNumQuestions;
        this.totalPoints = totalPoints;
    }

    public void takeQuiz(){
        System.out.println("Taking the " + topic +" quiz");
    }

    public String toString(){
        return "Quiz | " + topic + " quiz with " +  totalNumQuestions + " questions for a total of " + totalPoints + " total points";
    }
}

/*

### Create the `Quiz.java` file according to the following requirements.

  - declare these `instance variables`:
    - topic (String)
    - total number of questions (int)
    - total points (double)

  - create a `constructor` to initialize all the variables

  - create a void instance method: `takeQuiz()`
    - the method will print:
      > Taking the $topic quiz

  - create a `toString()` to print the Quiz objects in this format:
    > Quiz | $topic quiz with $questions questions for a total of $point total points
 */