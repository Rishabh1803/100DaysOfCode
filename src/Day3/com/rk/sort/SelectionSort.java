package Day3.com.rk.sort;

import java.util.Scanner;

public class SelectionSort {
    private int[] array;
    private int size;
    public SelectionSort() {
    }
    public int[] getArray() {
        return array;
    }
    public void setArray(int[] array) {
        this.array = array;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public SelectionSort(int[] array, int size) {
        super();
        this.array = array;
        this.size = size;
    }

    public void display() {
        for(int i = 0 ; i < size ; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    public void sort() {
        for(int i = 0 ; i < size - 1 ; i++) {
            int p = i;
            for(int j = i ; j < size ; j++) {
                if(array[j] < array[p])
                    p = j;
            }
            if(p != i) {
                int temp = array[p];
                array[p] = array[i];
                array[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        SelectionSort sort = new SelectionSort();
        sort.setSize(sc.nextInt());
        int[] array = new int[sort.getSize()];
        System.out.println("Enter the elements: ");
        for(int i = 0;i< sort.getSize(); i++){
            array[i] = sc.nextInt();
        }
        sort.setArray(array);
        sort.sort();
        sort.display();
        sc.close();
    }

}