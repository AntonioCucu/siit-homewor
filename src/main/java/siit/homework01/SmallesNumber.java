package siit.homework01;

import java.util.Scanner;

public class SmallesNumber {
    public static void main(String[] args) {
        int n;
        int x = 9999999;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        n = input.nextInt();
        int[] array = new int[10];

        System.out.println("Enter the elements of the array: ");

        for(int i = 0; i < n; i++){
            array[i] = input.nextInt();
        }

        System.out.println("Smallest number is: ");

        for (int i = 0; i < n; i++) {
            if (array[i] < x) {
                x = array[i];
            }
        }
        System.out.println(x);
    }
}
