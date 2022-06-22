package siit.homework03;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    public static void main(String[] args) {

        int selection;
        int selection2 = 0;

        //Create and array of objects + hardcode some items into the library.
        Novel book1 = new Novel("A Song of Fire and Ice", 643, "Fantasy");
        Novel book2 = new Novel("HP and the Goblet of Fire", 555, "Fantasy");
        Album book3 = new Album("Moon Landing", 34, 10);
        Novel book4 = new Novel("The Girl on the train", 498, "Mystery");
        Album book5 = new Album("The MilkyWay", 111, 9);

        ArrayList<Books> library = new ArrayList<Books>();

        library.add(0, book1);
        library.add(1, book2);
        library.add(2, book3);
        library.add(3, book4);
        library.add(4, book5);

        do {
            //Receive the choice of the user.

            System.out.println("=============================");
            System.out.println("Hello User, welcome to our library!");
            System.out.println("1.View the library");
            System.out.println("2.Add an item");
            System.out.println("3.Delete an item");
            System.out.println("0.Exit the library");
            System.out.println("=============================");
            System.out.println("Please enter your choice");
            selection = new Scanner(System.in).nextInt();

            if(selection == 2) {
                System.out.println("=============================");
                System.out.println("Is it a novel or an album?");
                System.out.println("1.A novel");
                System.out.println("2.An album");
                System.out.println("=============================");
                System.out.println("Please enter your choice");
                selection2 = new Scanner(System.in).nextInt();
            }
            //Add a book depending on users choice.
            if (selection == 2 && selection2 == 1) {
                System.out.println("Enter a name");
                Scanner addName = new Scanner(System.in);
                String name = (addName.nextLine());

                System.out.println("Enter books number of pages");
                Scanner addPages = new Scanner(System.in);
                int pages = (addPages.nextInt());

                System.out.println("Enter books type");
                Scanner addType = new Scanner(System.in);
                String type = (addType.nextLine());

                Novel newBook = new Novel(name, pages, type);
                library.add(library.size(), newBook);

            } else if (selection == 2 && selection2 == 2) {
                System.out.println("Enter a name");
                Scanner addName = new Scanner(System.in);
                String name = (addName.nextLine());

                System.out.println("Enter books number of pages");
                Scanner addPages = new Scanner(System.in);
                int pages = (addPages.nextInt());

                System.out.println("Enter books paper quality");
                Scanner addQuality = new Scanner(System.in);
                int qualityOfPaper = (addQuality.nextInt());

                Album newBook = new Album(name, pages, qualityOfPaper);
                library.add(library.size(), newBook);

                //Remove a book by name.
            } else if (selection == 3) {
                System.out.println("Enter the name of the book you want to remove");
                Scanner scanner = new Scanner(System.in);
                String removedBook = scanner.nextLine();

                for (int i = 0; i < library.size(); i++) {
                    if (library.get(i).getName().equals(removedBook)) {
                        library.remove(i);
                    }
                }
                //List all the books.
            } else if (selection == 1) {
                for (Books books : library) {
                    System.out.println(books);
                }
            }

        } while (selection != 0);
    }
}
