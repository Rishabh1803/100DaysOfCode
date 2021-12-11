package Day6.com.rk.sort;

public class MergeSort {

    private int size;
    private int[] array;
    public MergeSort() {
        // TODO Auto-generated constructor stub
    }
    public MergeSort(int size, int[] array) {
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
    public void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i = 0 ; i<n1 ; i++)
            L[i] = arr[l+i];

        for(int i = 0 ; i<n2 ; i++)
            R[i] = arr[m + 1 + i];

        int i = 0, j = 0, k = l;

        while(i<n1 && j<n2)
            if(L[i] <= R[j])
                arr[k++] = L[i++];
            else
                arr[k++] = R[j++];

        while(i<n1)
            arr[k++] = L[i++];

        while(j<n2)
            arr[k++] = R[j++];

    }
    void sort(int l, int r) {
        if(l < r) {
            int m = l + (r-l)/2;
            sort(l,m);
            sort(m+1,r);
            merge(array,l,m,r);
        }
    }
}