/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package learning.matrix;
import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class Matrix {
    
    static String[][] matrixArr = {{"*", "2", "3", "4", "*"}, 
        {"6", "*", "8", "*", "10"}, 
        {"11", "12", "*", "14", "15"}, 
        {"16", "*", "18", "*", "20"}, 
        {"*", "22", "23", "24", "*"}};
    static int counter = 0;

    public static void main(String[] args) {
        
        for( int i = 0; i < matrixArr.length; i+=1) {
            
            for(String j: matrixArr[i]) {
                
                
                if(counter == 4) {
                    System.out.println(" " + j);
                    counter = 0;
                    continue;
                }
                System.out.print(" " + j);
                counter +=1;
                
            }
            
            
   }
        
    }
}
