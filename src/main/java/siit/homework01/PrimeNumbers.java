package siit.homework01;

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class PrimeNumbers {
    public static void main(String[] args) {

        int number = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = input.nextInt();

        for (int i = 2; i <= number; i++) {
            if(isPrime(i)) {
                System.out.println(i);
            }

        }
    }

    private static boolean isPrime(int n) {
        for (int j = 2; j <= sqrt(n); j++) {
            if (n % j == 0) return false;
        } return true;
    }
}
