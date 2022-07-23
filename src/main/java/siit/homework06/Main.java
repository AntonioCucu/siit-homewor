package siit.homework06;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("What's the equation?");
        String input = in.nextLine();

        System.out.println("What unit measure to calculate in?");
        String unit = in.next();

        DistanceCalculator calc = new DistanceCalculator();
        calc.inputCalculator(input, unit);

    }
}
