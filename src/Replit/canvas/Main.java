package Replit.canvas;
import java.util.*;
public class Main {

    // DO Not Touch Anything here
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
    int test = input.nextInt();
        input.nextLine();
        switch (test) {
        case 1: // Test the Quiz class
            Quiz quiz = new Quiz(input.nextLine(), input.nextInt(), input.nextDouble());
            quiz.takeQuiz();
            System.out.println(quiz);
            break;
        case 2: // Test the File class
            File file = new File(input.nextLine(), input.nextDouble());
            file.openFile();
            System.out.println(file);
            break;
        case 3: // Test the Module class
            Module module;
            switch (input.nextLine()) {
                case "empty":
                    module = new Module("Day 1: Intro");
                    System.out.println(module);
                    break;
                case "with":
                    module = new Module("Day 2: Intro", easyFiles());
                    System.out.println(module);
                    break;
                case "add":
                    module = new Module("Office Hours", easyFiles());
                    module.addFile(new File(input.nextLine(), input.nextDouble()));
                    System.out.println(module);
                    break;
                case "remove":
                    module = new Module("Hello World", easyFiles());
                    module.removeFile(new File("Programming.pdf", 1.54));
                    System.out.println(module);
                    break;
            }
            break;
        case 4: // Test the Canvas class
            Canvas canvas;
            switch (input.nextLine()) {
                case "empty":
                    canvas = new Canvas("Java");
                    System.out.println(canvas);
                    break;
                case "with":
                    canvas = new Canvas("Automation", easyQuizzes(), easyModules());
                    System.out.println(canvas);
                    break;
                case "add":
                    canvas = new Canvas("Automation", easyQuizzes(), easyModules());
                    canvas.modules.get(0).addFile(new File(input.nextLine(), input.nextDouble()));
                    System.out.println(canvas.modules);
                    break;
            }

    }

}

    public static ArrayList<File> easyFiles() {
        ArrayList<File> files = new ArrayList<>();
        files.add(new File("Day 2 Notes", 0.92));
        files.add(new File("Programming.pdf", 1.54));
        return files;
    }

    public static ArrayList<Quiz> easyQuizzes() {
        ArrayList<Quiz> quizzes = new ArrayList<>();
        quizzes.add(new Quiz("If statement", 10, 10));
        quizzes.add(new Quiz("String", 8, 8));
        quizzes.add(new Quiz("Loops", 12, 15));
        return quizzes;
    }

    public static ArrayList<Module> easyModules() {
        ArrayList<Module> modules = new ArrayList<>();
        modules.add(new Module("Html", new ArrayList<>(Arrays.asList(new File("html notes", 1.2)))));
        modules.add(new Module("Locators", new ArrayList<>(Arrays.asList(new File("Examples", 2.3), new File("Automation Intro.pdf", 3.1)))));
        return modules;
    }

}

/*

## There will be many files used in this practice. All the files needed are already created. ***Look on the left side to see all files. Follow the given instructions to create each file.

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
---
### Create the `File.java` file according to the following requirements.

  - declare these `instance variables`:
    - name (String)
    - size (double)

  - create a `constructor` to initialize all the variables

  - create a void instance method: `openFile()`
    - the method will print:
      > Opening $fileName

  - create a `toString()` to print the File objects in this format:
    > File{$fileName | $size mb}
---
### Create the `Module.java` file according to the following requirements.

  - declare these `instance variables`:
    - name (String)
    - files (ArrayList of File objects)

  - create these `constructors` to initialize the variables:
    - 1 argument (`String`): initialize the name and create an empty ArrayList of Files
    - 2 arguments (`String and ArrayList<File>`) initialize the name and use the given ArrayList as the starting Files

  - create a void instance method: `addFile()`
    - accept a File object and add the given File to the ArrayList of Files

  - create a void instance method: `removeFile()`
    - accept a File object and remove the given File to the ArrayList of Files

    Note: this could be tricky, try to use lambda and some logic to remove when the files name and size are the same to what you want to remove

  - create a `toString()` to print the Module objects in this format:
    > $module name
    >
    > Files:
    >
    > print ArrayList of files
---
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

#### Main topics: class & object, instance variables, constructors, constructor chaining, ArrayList


 */