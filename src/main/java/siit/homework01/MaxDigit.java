package siit.homework01;

import java.util.Scanner;

public class MaxDigit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = 0;
        int x, max = 0;
        System.out.println("Enter a number: ");
        number = input.nextInt();

        while(number > 0) {
            x = number % 10;

            if(max < x){
                max = x;
            }
            number /= 10;
        }
        System.out.print("Max is: " + max);
    }
}

