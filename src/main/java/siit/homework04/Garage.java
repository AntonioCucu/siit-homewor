package siit.homework04;

import java.util.ArrayList;
import java.util.Scanner;

public class Garage {

    public static void main(String[] args) {

        BMW M3 = new BMW("M3", 60, "DIESEL", 6, 8.8, 55, 19, "s0m3numb3r");
        BMW M5 = new BMW("M5", 70, "PETROL", 6, 12.4, 70, 19, "an07h3rnumb3r");
        Maserati Ghibli = new Maserati("Ghibli", 55, "PETROL", 4, 14.4, 40, 18, "b3s7car3v3r");
        Maserati Levante = new Maserati("Levante", 80, "DIESEL", 5, 7.1, 78, 19, "som37h1ng");
        ArrayList<Car> garage = new ArrayList<Car>();

        garage.add(M3);
        garage.add(M5);
        garage.add(Ghibli);
        garage.add(Levante);

        System.out.println("\nWelcone to Knye's Garage! These are our cars: \n");

        for(Car car : garage) {
            System.out.println(car);
        }

        System.out.println("\nPlease select one of our cars. Enter it's model name.");
        Scanner selectCar = new Scanner(System.in);
        String car = (selectCar.nextLine());
        System.out.println("Congrats! You picked the " + car + "!\n");

        M5.start();
        M5.shiftGear();
        M5.drive();
        M5.shiftGear();
        M5.drive();
        M5.shiftGear();
        M5.drive();
        M5.shiftGear();
        M5.drive();
        M5.stop();

        int availableFuel = M5.getAvailableFuel();
        double fuelConsumedPer100Km = M5.getConsumptionPer100Km();

        System.out.println("\nFuel left: " + availableFuel + "\n" + "Average consumption: " + fuelConsumedPer100Km + "\n");

    }
}
