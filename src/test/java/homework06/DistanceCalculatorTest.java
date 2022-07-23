package homework06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import siit.homework06.DistanceCalculator;

public class DistanceCalculatorTest {

    @Test
    public void calculator_test1(){
        DistanceCalculator calculator = new DistanceCalculator();

        Assertions.assertEquals(1099.99, calculator.inputCalculator("1 km + 100 m - 1 cm", "m"));
    }

    @Test
    public void calculator_test2(){
        DistanceCalculator calculator = new DistanceCalculator();

        Assertions.assertEquals(0.89, calculator.inputCalculator("1 km - 100 m - 1000 cm", "km"));
    }

    @Test
    public void calculator_test3(){
        DistanceCalculator calculator = new DistanceCalculator();

        Assertions.assertEquals(-85.1, calculator.inputCalculator("25000 mm - 10 cm - 110 m", "m"));
    }

    @Test
    public void calculator_test4(){
        DistanceCalculator calculator = new DistanceCalculator();

        Assertions.assertEquals(115, calculator.inputCalculator("250 mm - 10 cm + 1 m", "cm"));
    }
}
