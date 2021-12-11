package Day9.com.rk.sort;

public class CountingSort {
    private int size;
    private int[] array;
    public CountingSort() {
        // TODO Auto-generated constructor stub
    }
    public CountingSort(int size, int[] array) {
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
    public void display() {
        System.out.println();
        for(int a : array) {
            System.out.print(a + "\t");
        }
        System.out.println();
    }
    public void countSort(int k) {
        int[] count = new int[k];
        for(int i = 0 ; i<k ; i++)
            count[i] = 0;
        for(int i = 0 ; i<size ; i++)
            count[array[i]]++;
        for(int i = 1; i<k ; i++)
            count[i] = count[i-1] + count[i];
        int[] output = new int[size];
        for(int i = size-1; i>=0 ; i--) {
            output[count[array[i]]-1] = array[i];
            count[array[i]]--;
        }
        for(int i = 0 ;i < size; i++)
            array[i] = output[i];
    }
}