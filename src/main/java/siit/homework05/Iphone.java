package siit.homework05;

public class Iphone extends Phone{
    public final String model;
    public String color;
    public String material;
    
    Iphone(String model, String number,float batteryLife, String color, String material) {

        super(number, batteryLife);

        this.model = model;

        this.color = color;

        this.material = material;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString(){

        return "{ Model: " + getModel() + "\nColor: " + getColor() + "\nMaterial: " + getMaterial() + "\nCurrent battery life: " + getBatteryLife() + " hours remaining." + "\n";
    }
    public static class Pro13 extends Iphone {

        Pro13(String model, String number, float batteryLife, String color, String material) {

            super(model, number, batteryLife, color, material);
        }
    }

    public static class Pro12 extends Iphone {

        Pro12(String model, String number, float batteryLife, String color, String material) {

            super(model, number, batteryLife, color, material);
        }
    }
}
