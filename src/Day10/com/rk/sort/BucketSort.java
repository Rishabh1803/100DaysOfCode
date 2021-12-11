package Day10.com.rk.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {
    private int[] arr;

    public BucketSort() {
    }

    public BucketSort(int[] arr) {
        super();
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int maxValue(int array[]) {
        int max = array[0];
        for(int i = 1; i < array.length ; i++) {
            if(array[i] > max)
                max = Math.max(max, array[i]);
        }
        return max;
    }
    public int[] bucketSort(int[] array,int k) {
        int max = maxValue(array) + 1;
        List<ArrayList<Integer>> bucket = new ArrayList<ArrayList<Integer>>();
        for(int i = 0 ; i < max/k ; i++) {
            bucket.add(new ArrayList<Integer>());
        }
        for(int i = 0 ; i<array.length ; i++) {
            int bi = array[i] * k / max;
            bucket.get(bi).add(array[i]);
        }
        for(int i = 0 ; i < bucket.size() ; i++) {
            Collections.sort(bucket.get(i));
        }
        int index = 0;
        for(int i = 0 ; i < bucket.size() ; i++)
            for(int j = 0 ; j < bucket.get(i).size() ; j++)
                array[index++] = bucket.get(i).get(j);
        return array;
    }
}