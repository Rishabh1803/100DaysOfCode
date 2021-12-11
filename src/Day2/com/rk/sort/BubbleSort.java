package Day2.com.rk.sort;

import java.util.Scanner;

public class BubbleSort{
    private int size;
    private int[] array;

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

    public BubbleSort(int size, int[] array) {
        this.size = size;
        this.array = array;
    }
    public BubbleSort(){

    }
    void sort(){
        for(int i = 0; i < size - 1 ; i++){
            for(int j = 0 ; j < size - 1 - i ; j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    void display(){
        System.out.println();
        for(int i = 0 ; i<size;i++){
            System.out.println(array[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        BubbleSort sort = new BubbleSort();
        sort.setSize(scanner.nextInt());
        int[] array = new int[sort.getSize()];
        for(int i = 0;i< sort.getSize(); i++){
            array[i] = scanner.nextInt();
        }
        sort.setArray(array);
        sort.sort();
        sort.display();
        scanner.close();
    }
}
