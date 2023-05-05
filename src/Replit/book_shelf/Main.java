package Replit.book_shelf;
import java.util.Scanner;
public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        for(int i=0; i < 3; i++){
            Shelf.addBook(makeBook());
        }

        switch (in.nextInt()){
            case 0:
                System.out.println(Shelf.getTheBooks().get(in.nextInt()));
                break;
            case 1:
                System.out.println(Shelf.isIDUnique(in.nextInt()));
                break;
            case 2:
                System.out.println(Shelf.addBook(makeBook()));
                break;
            case 3:
                System.out.println(Shelf.getTitleByID(in.nextInt()));
                break;
            case 4:
                System.out.println(Shelf.findBookByPartialTitle(in.next()));
                break;
            case 5:
                Shelf.addBook(makeBook());
                in.nextLine();
                System.out.println(Shelf.getAllBooksForAuthor(in.nextLine()));
                break;
            case 6:
                int before = Shelf.getTheBooks().size();
                Shelf.removeBook(in.nextInt());
                System.out.println(before == Shelf.getTheBooks().size());
                break;
            case 7:
                int before2 = Shelf.getTheBooks().size();
                in.nextLine();
                Shelf.removeBook(in.nextLine());
                System.out.println(before2 == Shelf.getTheBooks().size());
                break;
            case 8:
                Shelf.clearBookShelf();
                System.out.println(Shelf.isShelfEmpty());
                break;
        }
    } // end of main method

    // Utility to create book objects

    private static Book makeBook(){
        int id = in.nextInt();
        in.nextLine();
        String author = in.nextLine();
        String title = in.nextLine();
        int pages = in.nextInt();
        return new Book(id, author, title, pages);
    }

}
/*
### We want to represent our collection of books in our bookshelf. We will need to build up the `Book` and `Shelf` classes to represent the information of each in java.

### Finish the `Book` class according to all the given comments. Look for `todo comments` of where you will need to work. Each method or part you need to work on has comments to explain what to do in that section. Then work on the `Shelf` class according to all the given comments. Examples of each sections functionality are given in the comments

> Note: Do not change anything in the main method

Main topics: encapsulation, class & object, instance variables, constructors, toString, ArrayList, methods
 */