package Day5.com.rk.search;

import Day1.com.rk.search.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class ExponentialSearch {

    private int size;
    private int[] array;
    public ExponentialSearch() {
    }
    public ExponentialSearch(int size, int[] array) {
        super();
        this.size = size;
        this.array = array;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public int[] getArray() {
        return array;
    }
    public void setArray(int[] array) {
        this.array = array;
    }
    @Override
    public String toString() {
        return "ExponentialSearch [size=" + size + ", array=" + Arrays.toString(array) + "]";
    }

    public void display() {
        for(int i = 0 ;i<size; i++) {
            System.out.print(array[i] + "\t");
        }
    }
    public int search(int target) {
        int bound = 1;
        while(bound < size && array[bound] < target) {
            bound *= 2;
        }
        int left = bound / 2;
        int right = Math.min(size - 1, bound);
        return (new BinarySearch(array, size)).binarySearch(target,left,right);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i<size ; i++)
            array[i] = sc.nextInt();
        System.out.print("Enter the element you want to search: ");
        int target = sc.nextInt();
        ExponentialSearch search = new ExponentialSearch(size, array);
        System.out.println("Answer = " + search.search(target));
        sc.close();
    }
}