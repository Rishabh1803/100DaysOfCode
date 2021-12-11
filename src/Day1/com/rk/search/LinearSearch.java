package Day1.com.rk.search;

public class LinearSearch {

    private int[] array;
    private int size;

    public LinearSearch() {
    }

    public LinearSearch(int[] array, int size) {
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

    public int linearSearch(int target) {
        for(int i = 0;i<size;i++) {
            if(array[i] == target)
                return i+1;
        }
        return -1;
    }
}