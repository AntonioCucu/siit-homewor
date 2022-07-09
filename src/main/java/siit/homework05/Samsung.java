package siit.homework05;

public class Samsung extends Phone{
    public final String model;
    public String color;
    public String material;

    Samsung(String model, String number,float batteryLife, String color, String material) {

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

    public static class GalaxyS10 extends Samsung {

        GalaxyS10(String model, String number, float batteryLife, String color, String material) {

            super(model, number, batteryLife, color, material);
        }
    }

    public static class GalaxyS20 extends Samsung {

       GalaxyS20(String model, String number, float batteryLife, String color, String material) {

            super(model, number, batteryLife, color, material);
        }
    }

}
