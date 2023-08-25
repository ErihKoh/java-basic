package learning.bublesort;


public class BubleSort {

    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
		int length = array.length;
                
                int currentFirstIndex = 0;
                int currentSecondIndex = currentFirstIndex + 1;
                int temp;

		for (int i = 0; i < length; i++) {
			if (array[currentFirstIndex] > array[currentSecondIndex]) {
                            temp = array[currentFirstIndex];
                            
                            array[currentFirstIndex] = array[currentSecondIndex];
                            
                            array[currentSecondIndex] = temp; 
                            
                  
                        }
                        
                        currentFirstIndex += 1;
                        
                       
                }

		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
                }
    }
}
