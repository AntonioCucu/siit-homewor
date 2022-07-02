package siit.homework04;

import java.util.Scanner;

public class Maserati extends Car{
    public final String model;
    public int availableFuel;
    public final String chassisNumber;

    public Maserati(String model, int fuelTanksSize, String fuelType, int gears, double consumptionPer100Km, int availableFuel, int tireSize, String chassisNumber) {

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

}
