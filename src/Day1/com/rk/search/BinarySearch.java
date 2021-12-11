package Day1.com.rk.search;

public class BinarySearch {

    private int[] array;
    private int size;

    public BinarySearch() {
    }

    public BinarySearch(int[] array, int size) {
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

    public int binarySearch(int target, int left, int right) {
        if(left>right)
            return -1;

        int mid = (right - left)/2;

        if(array[mid] == target)
            return mid+1;
        else if(array[mid] < target)
            return binarySearch(target, left, mid - 1);
        else
            return binarySearch(target, mid+1, right);
    }
    public int binarySearch(int target) {
        return binarySearch(target,0,size-1);
    }
}