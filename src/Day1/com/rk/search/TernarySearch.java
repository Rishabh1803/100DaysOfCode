package Day1.com.rk.search;

public class TernarySearch {

    private int[] array;
    private int size;

    public TernarySearch() {
    }

    public TernarySearch(int[] array, int size) {
        super();
        this.array = array;
        this.size = size;
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

    private int ternarySearch(int target, int left, int right) {
        if(left>right)
            return -1;

        int partition = (right - left)/3;
        int mid1 = left + partition;
        int mid2 = right - partition;

        if(array[mid1] == target)
            return mid1+1;
        else if(array[mid2] == target)
            return mid2+1;
        else if(target < array[mid1])
            return ternarySearch(target, left, mid1 - 1);
        else if(target > array[mid2])
            return ternarySearch(target, mid2 + 1, right);
        return ternarySearch(target, mid1 + 1, mid2 - 1);
    }
    public int ternarySearch(int target) {
        return ternarySearch(target,0,size-1);
    }
}
