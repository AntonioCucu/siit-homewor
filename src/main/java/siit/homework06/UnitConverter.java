package siit.homework06;

import java.util.Locale;
public class UnitConverter {
    public void convertedArray(String outputUnit, String[] inputArray){

        if(outputUnit.equalsIgnoreCase("mm")){

            for (int i = 0; i < inputArray.length; i++) {

                switch (inputArray[i].toLowerCase(Locale.ROOT)) {
                    case "dm" -> inputArray[i - 1] = String.valueOf(Double.parseDouble(inputArray[i - 1]) * 100);
                    case "cm" -> inputArray[i - 1] = String.valueOf(Double.parseDouble(inputArray[i - 1]) * 10);
                    case "m" -> inputArray[i - 1] = String.valueOf(Double.parseDouble(inputArray[i - 1]) * 1000);
                    case "km" -> inputArray[i - 1] = String.valueOf(Double.parseDouble(inputArray[i - 1]) * 1000000);
                    default -> {
                    }
                }
            }
        }else if(outputUnit.equalsIgnoreCase("cm")){
            for (int i = 0; i < inputArray.length; i++) {

                switch (inputArray[i].toLowerCase(Locale.ROOT)) {
                    case "dm" -> inputArray[i - 1] = String.valueOf(Double.parseDouble(inputArray[i - 1]) * 10);
                    case "mm" -> inputArray[i - 1] = String.valueOf(Double.parseDouble(inputArray[i - 1]) / 10);
                    case "m" -> inputArray[i - 1] = String.valueOf(Double.parseDouble(inputArray[i - 1]) * 100);
                    case "km" -> inputArray[i - 1] = String.valueOf(Double.parseDouble(inputArray[i - 1]) * 100000);
                    default -> {
                    }
                }
            }
        } else if (outputUnit.equalsIgnoreCase("dm")) {
            for (int i = 0; i < inputArray.length; i++) {

                switch (inputArray[i].toLowerCase(Locale.ROOT)) {
                    case "mm" -> inputArray[i - 1] = String.valueOf(Double.parseDouble(inputArray[i - 1]) / 100);
                    case "cm" -> inputArray[i - 1] = String.valueOf(Double.parseDouble(inputArray[i - 1]) / 10);
                    case "m" -> inputArray[i - 1] = String.valueOf(Double.parseDouble(inputArray[i - 1]) * 10);
                    case "km" -> inputArray[i - 1] = String.valueOf(Double.parseDouble(inputArray[i - 1]) * 10000);
                    default -> {
                    }
                }
            }
        } else if (outputUnit.equalsIgnoreCase("m")) {
            for (int i = 0; i < inputArray.length; i++) {

                switch (inputArray[i].toLowerCase(Locale.ROOT)) {
                    case "dm" -> inputArray[i - 1] = String.valueOf(Double.parseDouble(inputArray[i - 1]) / 10);
                    case "cm" -> inputArray[i - 1] = String.valueOf(Double.parseDouble(inputArray[i - 1]) / 100);
                    case "mm" -> inputArray[i - 1] = String.valueOf(Double.parseDouble(inputArray[i - 1]) / 1000);
                    case "km" -> inputArray[i - 1] = String.valueOf(Double.parseDouble(inputArray[i - 1]) * 1000);
                    default -> {
                    }
                }
            }
        } else if (outputUnit.equalsIgnoreCase("km")) {
            for (int i = 0; i < inputArray.length; i++) {

                switch (inputArray[i].toLowerCase(Locale.ROOT)) {
                    case "dm" -> inputArray[i - 1] = String.valueOf(Double.parseDouble(inputArray[i - 1]) / 10000);
                    case "cm" -> inputArray[i - 1] = String.valueOf(Double.parseDouble(inputArray[i - 1]) / 100000);
                    case "m" -> inputArray[i - 1] = String.valueOf(Double.parseDouble(inputArray[i - 1]) / 1000);
                    case "mm" -> inputArray[i - 1] = String.valueOf(Double.parseDouble(inputArray[i - 1]) / 1000000);
                    default -> {
                    }
                }
            }
        }else {
            System.out.println("Unexpected input. Please check for typos.");
        }
    }
}
