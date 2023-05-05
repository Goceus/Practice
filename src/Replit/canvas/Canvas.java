package Replit.canvas;
import java.util.ArrayList;
public class Canvas {

    // Finish the Canvas class
    String topic;
    ArrayList<Quiz> quizzes;
    ArrayList<Module> modules;

    public Canvas(String topic){
        this.topic = topic;
        quizzes = new ArrayList<>();
        modules = new ArrayList<>();
    }

    public Canvas(String topic, ArrayList<Quiz> quizzes, ArrayList<Module> module){
        this(topic);
        this.quizzes.addAll(quizzes);
        this.modules.addAll(modules);
    }

    public String toString(){
        return topic + " course\nQuizzes:\n" + quizzes + "\nModules:\n" + modules;
    }


}
/*

### Create the `Canvas.java` file according to the following requirements.

  - declare these `instance variables`:
    - topic (String)
    - quizzes (ArrayList of Quiz objects)
    - modules (ArrayList of Module objects)

  - create these `constructors` to initialize the variables:
    - 1 argument (`String`): initialize the name and create an empty ArrayList of quizzes and modules
    - 3 arguments(`String, ArrayList<Quiz>, and ArrayList<Module>`):  initialize the name and use the given ArrayLists to set up the starting values of all quizzers and modules

  - create a `toString()` to print the Canvas objects in this format:
    > $topic course
    >
    > Quizzes:
    >
    > [ArrayList of Quiz]
    >
    > Modules:
    >
    > [ArrayList of Module]
---
 */