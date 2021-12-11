package Day4.com.rk.search;

public class JumpSearch {
    private int size;
    private int[] array;
    public JumpSearch() {
    }
    public JumpSearch(int size, int[] array) {
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
        for(int i = 0; i<size ; i++)
            System.out.print(array[i] + "\t");
    }
    public int jumpSearch(int target) {
        int blockSize = (int) Math.sqrt(size);
        int start = 0;
        int next = blockSize;

        while(start >= size && array[next - 1] < target) {
            start = next;
            next += blockSize;
            if(next > size)
                next = size;
        }
        for(int i = start; i<next ; i++)
            if(array[i] == target)
                return i;

        return -1;
    }
}