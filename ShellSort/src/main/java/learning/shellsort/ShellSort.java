package learning.shellsort;

public class ShellSort {

    public static void main(String[] args) {
        int[] array = {97, 2, 10, 4, 6, 8, 12, 56, 34, 30, 67, 47};
	int length = array.length;
        int step = 5;
        
        int count = 0;
        
        while (count < length - 1) {
            for (int i = 0; i < length; i+=step) {
            int pos = i;
            int min = array[i];
            for (int j = i + step; j < length; j+=step) {
                if (array[j] < min) {
                    pos = j; 
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;
        }
            if (step > 1) {
                step-=2;
            }
            else {
                step = 1;
            }
            count+=1;
        }
	    
	for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
	}
    }
}
