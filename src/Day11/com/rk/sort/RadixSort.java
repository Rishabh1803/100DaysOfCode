package Day11.com.rk.sort;

import java.util.Arrays;

public class RadixSort {
    private int size;
    private int[] array;

    public RadixSort(){

    }
    public RadixSort(int size, int[] array) {
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
        for(int a:array){
            System.out.print(a + "\t");
        }
    }

    public void sort(){
        int mx = array[0];
        for (int i = 1; i<size; i++) {
            if (array[i] > mx)
                mx = array[i];
        }
        for (int exp = 1; mx/exp > 0; exp*=10)
            countingSort(exp);
    }
    public void countingSort(int exp){
        int count[] = new int[10];
        int output[] = new int[size];
        Arrays.fill(count,0);
        for (int i = 0 ; i<size; i++)
            count[(array[i]/exp)%10]++;
        for(int i = 0 ; i<10 ; i++)
            count[i] += count[i-1];
        for (int i = size-1 ;i>=0 ; i--){
            output[count[(array[i]/exp)%10] - 1] = array[i];
            count[(array[i]/exp)%10]--;
        }
        for(int i = 0; i<size; i++)
            array[i] = output[i];
    }
}
