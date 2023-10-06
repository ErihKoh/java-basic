package learning.insertionsort;

import java.util.Arrays;


public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println(insertion_sort(arr));
    }
    
    public static String insertion_sort(int[] array){
        int counter = 0;
        for ( int i = 1; i < array.length; i++ ){
            int key = array[i];
            int idx = i - 1;

            while(idx >= 0 && array[idx] > key){
                array[idx + 1] = array[idx];
                idx --;
                counter ++;
            }
            array[idx + 1] = key;
        }
        System.out.println(counter);
        return Arrays.toString(array);
    }
}
