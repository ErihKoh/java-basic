package learning.bublesort;


public class BubleSort {

    public static void main(String[] args) {
        int counter = 0;
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int length = array.length;
        int temp;
        for (int i = 0; i < length; i+=1) {
            for (int j = 1; j < length - i; j++) {
                if(array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
                counter ++;
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
        
        System.out.println(counter);
                
                
    }
   
}
