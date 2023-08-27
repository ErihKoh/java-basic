package learning.bublesort;


public class BubleSort {

    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;
        int temp;
        for (int i = 0; i < length - 1; i+=1) {
            for (int j = length - 1; j > i; j--) {
                if(array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
                
                
    }
   
}
