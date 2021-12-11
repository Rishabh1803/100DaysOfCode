package Day8.com.rk.sort;

import java.util.Scanner;

public class CycleSort {
    private int size;
    private int[] array;
    public CycleSort(int size, int[] array) {
        super();
        this.size = size;
        this.array = array;
    }
    public CycleSort() {
        // TODO Auto-generated constructor stub
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
    public void display() {
        System.out.println();
        for(int a:array)
            System.out.print(a + "\t");
        System.out.println();
    }
    public void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public void sort() {
        for(int i = 0 ; i < size -1 ; i++) {
            int item = array[i];
            int pos = i;
            for(int j = i+1; j<size; j++)
                if(array[j] < item)
                    pos++;
            int temp = item;
            item = array[pos];
            array[pos] = temp;
            while(pos != i) {
                pos = i;
                for(int j = i+1; j<size;j++)
                    if(array[j] < item)
                        pos++;
                int temp1 = item;
                item = array[pos];
                array[pos] = temp1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CycleSort sort = new CycleSort();
        System.out.println("Enter size: ");
        sort.setSize(sc.nextInt());
        System.out.println("Enter elements: ");
        int[] temp = new int[sort.getSize()];
        for(int i  = 0; i<temp.length; i++)
            temp[i] = sc.nextInt();
        sort.setArray(temp);
        sort.display();
        sort.sort();
        sort.display();
        sc.close();
    }
}