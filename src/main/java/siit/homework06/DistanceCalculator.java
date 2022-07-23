package siit.homework06;

import java.util.*;

public class DistanceCalculator {
    public double inputCalculator(String equation, String outputUnit) {

        CheckEquationFormat checkEqFormat = new CheckEquationFormat();

        if (checkEqFormat.checkEq(equation) && outputUnit.length() <= 2) {

            String[] inputArray = equation.split(" ");
            List<String> inputList = Arrays.asList(inputArray);

            UnitConverter converter = new UnitConverter();
            converter.convertedArray(outputUnit, inputArray);

            double result = Double.parseDouble(inputArray[0]);

            if (inputList.contains("+") || inputList.contains("-")) {
                for (int i = 0; i < inputArray.length; i++) {

                    if (inputArray[i].equalsIgnoreCase("+")){
                        result += Double.parseDouble(inputArray[i + 1]);

                    }else if(inputArray[i].equalsIgnoreCase("-")){
                        result -= Double.parseDouble(inputArray[i + 1]);
                    }
                }
            }
            System.out.println("--Result: " + result + " " + outputUnit);
            return result;

        } else if(outputUnit.length() > 2){
            throw new RuntimeException("Please follow the format.");

        }else{
            throw new RuntimeException("Accepted format is x xm +/- y ym");
        }
    }
}

