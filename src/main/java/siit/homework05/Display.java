package siit.homework05;

import java.util.ArrayList;
import java.util.Scanner;

public class Display {

    public static void main(String[] args) {

        int selection;
        int choosePhone;


        ArrayList<Phone> tech = new ArrayList<>();
        Phone phone1 = new Samsung.GalaxyS10("S10", "0766692122", 12, "black", "plastic");
        Phone phone2 = new Samsung.GalaxyS20("S20", "0712332112", 24, "white", "aluminum");
        Phone phone3 = new Iphone.Pro13("Pro13", "0733392192", 5, "gold", "gold");
        Phone phone4 = new Iphone.Pro12("Pro12", "0700042012", 7, "pink", "aluminum");
        tech.add(phone1);
        tech.add(phone2);
        tech.add(phone3);
        tech.add(phone4);

        System.out.println("=============================");
        System.out.println("Hello and welcome to our phone manager!");
        System.out.println("Please choose one of our phones.\n");
        System.out.println("1." + phone1);
        System.out.println("2." + phone2);
        System.out.println("3." + phone3);
        System.out.println("4." + phone4);
        System.out.println("=============================");
        System.out.println("Please answer with 1, 2, 3 or 4.");
        choosePhone = new Scanner(System.in).nextInt();

        if (choosePhone == 1 || choosePhone == 2 || choosePhone == 3 || choosePhone == 4) {

            do {
                System.out.println("=============================");
                System.out.println("\nThis is your phone menu, please select an option.");
                System.out.println("1. Add a contact.");
                System.out.println("2. List contacts.");
                System.out.println("3. Call someone.");
                System.out.println("4. List calls log.");
                System.out.println("5. Text someone.");
                System.out.println("6. List messages log.");
                System.out.println("0. Exit\n");
                System.out.println("=============================");

                selection = new Scanner(System.in).nextInt();

                if(tech.get(choosePhone - 1).getBatteryLife() > 0) {

                    if (selection == 1) {
                        tech.get(choosePhone - 1).addContact();
                    } else if (selection == 2) {
                        tech.get(choosePhone - 1).listContacts();
                    } else if (selection == 3) {
                        tech.get(choosePhone - 1).call();
                        System.out.println("You have " + tech.get(choosePhone - 1).getBatteryLife() + "hours of battery remaining.");
                        System.out.println("=============================");
                    } else if (selection == 4) {
                        tech.get(choosePhone - 1).callLog();
                    } else if (selection == 5) {
                        tech.get(choosePhone - 1).sendText();
                        System.out.println("You have " + tech.get(choosePhone - 1).getBatteryLife() + "hours of battery remaining.");
                        System.out.println("=============================");
                    } else if (selection == 6) {
                        tech.get(choosePhone - 1).listMessages();
                    } else
                        System.out.println("Please stick to one of our options. Try again!");
                    System.out.println("=============================");
                } else {
                    System.out.println("You ran out of battery. Please recharge.");
                    selection = 0;
                }
            } while (selection != 0);
        }
        else System.out.println("You didnt select a phone, cya o/");
    }
}

