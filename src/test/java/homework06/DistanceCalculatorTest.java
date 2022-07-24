package homework06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import siit.homework06.DistanceCalculator;

import java.util.Random;

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

    @Test
    public void calculator_test_random() {

        Random r = new Random();
        int rand1 = r.nextInt(100) + 1;
        int rand2 = r.nextInt(100) + 1;
        int rand3 = r.nextInt(100) + 1;

        String equation = rand1 + " cm + " + rand2 + " m + " + rand3 + " mm";

        DistanceCalculator calculator = new DistanceCalculator();

        Assertions.assertEquals(rand1 + rand2 * 100 + rand3 * 0.1, calculator.inputCalculator(equation, "cm"));

    }
}
