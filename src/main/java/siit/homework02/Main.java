package siit.homework02;

public class Main {
    public static void main(String[] args) {
        // Hardcoded input. Soon to be updated to keyboard input.
        SalesRepresentative[] arr = new SalesRepresentative[6];
        arr[0] = new SalesRepresentative(7, 13);
        arr[1] = new SalesRepresentative(3, 24);
        arr[2] = new SalesRepresentative(9, 12);
        arr[3] = new SalesRepresentative(11, 6);
        arr[4] = new SalesRepresentative(2, 43);
        arr[5] = new SalesRepresentative(5, 17);
        //printing the unordered array of objects.
        System.out.println("Array Before Bubble Sort -->");

        for (SalesRepresentative salesRepresentative : arr) {
            System.out.print(salesRepresentative.getWorthOfSales() + " ");
        }
        System.out.println();

        //calling the sorting function to order the objects.

        BubbleSort.bubbleSort(arr);

        //printing the sorted array of objects.

        System.out.println("Array After Bubble Sort -->");
        for (SalesRepresentative salesRepresentative : arr) {
            System.out.print(salesRepresentative.getWorthOfSales() + " ");
        }
    }
}
