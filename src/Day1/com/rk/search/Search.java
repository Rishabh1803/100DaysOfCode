package Day1.com.rk.search;

import java.util.Scanner;

public class Search {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the searching algorithms!!");
        System.out.print("Enter the array size: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i<size ; i++)
            array[i] = sc.nextInt();
        System.out.print("Enter the element you want to search: ");
        int target = sc.nextInt();
        System.out.println("Select the searching technique you want:");
        System.out.println("1. Linear Search");
        System.out.println("2. Binary Search");
        System.out.println("3. Ternary Search");
        System.out.print("Enter Your Choice: ");
        int choice = sc.nextInt();
        switch(choice) {
            case 1: LinearSearch linearsearch = new LinearSearch(array, size);
                System.out.println(linearsearch.linearSearch(target));
                break;
            case 2: BinarySearch binarysearch = new BinarySearch(array, size);
                System.out.println(binarysearch.binarySearch(target));
                break;
            case 3: TernarySearch ternarySearch = new TernarySearch(array, size);
                System.out.println(ternarySearch.ternarySearch(target));
                break;
            default: System.out.println("Invalid Choice");
        }
        sc.close();
    }
}