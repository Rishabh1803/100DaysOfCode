package Day4.com.rk.sort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    private int size;
    private int[] array;
    public InsertionSort() {
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
    public InsertionSort(int size, int[] array) {
        super();
        this.size = size;
        this.array = array;
    }
    @Override
    public String toString() {
        return "InsertionSort [size=" + size + ", array=" + Arrays.toString(array) + "]";
    }
    public void sort() {
        for(int i = 1; i<size ; i++) {
            int key = array[i];
            int j = i-1;
            while(j>=0 && array[j] > key) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
    }
    public void display() {
        for(int i = 0 ; i<size ; i++)
            System.out.println(array[i] + "\t");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        System.out.println("Enter array elements: ");
        int[] arr= new int[size];
        for(int i = 0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        InsertionSort select = new InsertionSort(size, arr);
        select.sort();
        System.out.println("After sorting: ");
        select.display();
        sc.close();
    }
}