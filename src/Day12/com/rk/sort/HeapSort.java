package Day12.com.rk.sort;

import java.util.Scanner;

public class HeapSort {
    private int size;
    private int[] array;
    public HeapSort(){
    }
    public HeapSort(int size, int[] array) {
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
    public void display(){
        System.out.println();
        for (int a:array)
            System.out.print(a + "\t");
        System.out.println();
    }
    public void heapify(int[] array, int size, int i){
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < size && array[left] > array[largest])
            largest = left;
        if (right < size && array[right] > array[largest])
            largest = right;
        if (largest != i){
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
            heapify(array, size, largest);
        }
    }
    public void sort(){
        for (int i = size/2 - 1 ; i >= 0; i--)
            heapify(array, size, i);
        for (int i = size - 1 ; i >= 0 ; i--){
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        HeapSort sort = new HeapSort();
        sort.setSize(sc.nextInt());
        int[] a = new int[sort.getSize()];
        for (int i = 0 ; i < sort.getSize() ; i++)
            a[i] = sc.nextInt();
        sort.setArray(a);
        System.out.println("Before Sorting: ");
        sort.display();
        System.out.println("After Sorting: ");
        sort.sort();
        sort.display();
    }
}