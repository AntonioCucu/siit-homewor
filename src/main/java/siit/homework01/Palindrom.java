package siit.homework01;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        int temp = 0, reversed = 0, number = 0;

        System.out.println("Enter a number: ");
        number = input.nextInt();

        n = number;

        while (number > 0) {
            temp = number % 10;
            reversed  = reversed * 10 + temp;
            number = number / 10;
        }

        if(n == reversed){
            System.out.println("Your number is a palindrome ");
        } else {
            System.out.println("Your number is not a palindrome ");
        }

    }
}
