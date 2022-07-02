package siit.homework04;

import java.util.Scanner;

public class Car extends Vehicle implements CarFunctions,Service{

    public final int fuelTanksSize;
    public final  String fuelType;
    public final int gears;
    public double consumptionPer100Km;

    public int availableFuel;
    public int tireSize;

    Car(int fuelTanksSize, String fuelType, int gears, double consumptionPer100Km, int availableFuel, int tireSize) {

        this.fuelTanksSize = fuelTanksSize;

        this.fuelType = fuelType;

        this.gears  = gears;

        this.consumptionPer100Km = consumptionPer100Km;

        this.availableFuel = availableFuel;

        this.tireSize = tireSize;
    }

    public double getConsumptionPer100Km() {
        return consumptionPer100Km;
    }

    public void setConsumptionPer100Km(double consumptionPer100Km) {
        this.consumptionPer100Km = consumptionPer100Km;
    }

    public int getTireSize() {
        return tireSize;
    }

    public void setTireSize(int tireSize) {
        this.tireSize = tireSize;
    }

    public void setAvailableFuel(int availableFuel) {
        this.availableFuel = availableFuel;
    }

    public int getAvailableFuel() {
        return availableFuel;
    }

    public int getFuelTanksSize() {
        return fuelTanksSize;
    }

    @Override
    public void start() {
        System.out.println("The engine is On. Fuel is being consumed. ");
    }

    @Override
    public void stop() {
        System.out.println("You turned the engine Off.");
    }

    @Override
    public void shiftGear() {
        System.out.println("What gear do you want to put the car in?");
        Scanner shift = new Scanner(System.in);
        int selection = (shift.nextInt());

        setConsumptionPer100Km(getConsumptionPer100Km() - 0.1 * selection);
        double currentConsuption = getConsumptionPer100Km();
        System.out.println("The car is currently consuming" + currentConsuption + "L/100Km.\n");

    }

    @Override
    public  void drive() {
        System.out.println("Insert the distance you want to drive in this gear.");
        Scanner distance = new Scanner(System.in);
        int kilometers = (distance.nextInt());

        double consumption1 = getAvailableFuel() - (kilometers * getConsumptionPer100Km() / 100);
        int consumption = (int) consumption1;
        setAvailableFuel(consumption);
        System.out.println("Fuel left:" + getAvailableFuel() + ".\n" );
    }

    @Override
    public void changeTires() {
        System.out.println("Please select between: 16, 17, 18 and 19 inches");
        Scanner changeTireSize = new Scanner(System.in);
        int tireSize = (changeTireSize.nextInt());
        if (tireSize != 16 || tireSize != 17 || tireSize != 18 || tireSize != 19  ) {
            System.out.println("Your input is not available, please try again.");
        } else setTireSize(tireSize);
    }

    @Override
    public void refuel() {
        System.out.println("How much fuel do you want to add?");
        Scanner addFuel = new Scanner(System.in);
        int fuel = (addFuel.nextInt());
        if(getFuelTanksSize() >= getAvailableFuel() + fuel) {
            setAvailableFuel(getAvailableFuel() + fuel);
        }
    }

    @Override
    public void autonomy() {
        double range = getAvailableFuel() / getConsumptionPer100Km() * 100;
        int autonomy = (int) range;
        System.out.println("Car can be driven for: " + autonomy  + "Km.");
    }
}
