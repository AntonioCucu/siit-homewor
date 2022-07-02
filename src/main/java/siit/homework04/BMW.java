package siit.homework04;

import java.util.Scanner;

public class BMW extends Car{

    public final String model;
    public int availableFuel;
    public final String chassisNumber;

    public BMW(String model, int fuelTanksSize, String fuelType, int gears, double consumptionPer100Km, int availableFuel, int tireSize, String chassisNumber) {

        super(fuelTanksSize, fuelType, gears, consumptionPer100Km, availableFuel, tireSize);

        this.model = model;

        this.chassisNumber = chassisNumber;
    }

    public int getAvailableFuel() {
        return availableFuel;
    }

    public void setAvailableFuel(int availableFuel) {
        this.availableFuel = availableFuel;
    }

    public int getTireSize() {
        return tireSize;
    }

    public void setTireSize(int tireSize) {
        this.tireSize = tireSize;
    }

    public int getFuelTanksSize() {
        return tireSize;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getGears() {
        return gears;
    }

    public double getConsumptionPer100Km() {
        return consumptionPer100Km;
    }

    public String getChassisNumber() {
        return chassisNumber;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString(){
        return "Model: " + getModel() + " \nAvailable Fuel: " + getAvailableFuel() + " \nTire Size: " + getTireSize() + "\n";
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
