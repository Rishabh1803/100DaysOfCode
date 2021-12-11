package Day7.com.rk.sort;

public class QuickSort {
    private int size;
    private int[] array;
    public QuickSort() {
        // TODO Auto-generated constructor stub
    }
    public QuickSort(int size, int[] array) {
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
        for(int a:array)
            System.out.print(a + "\t");
    }
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for(int j = low; j < high; j++)
            if(arr[j] < pivot)
                swap(arr,++i,j);
        swap(arr, i+1, high);
        return i+1;
    }
    public void sort(int low, int high) {
        if(low < high) {
            int pi = partition(array, low, high);
            sort(low, pi - 1);
            sort(pi + 1, high);
        }
    }
}