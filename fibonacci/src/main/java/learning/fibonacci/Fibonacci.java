/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package learning.fibonacci;

/**
 *
 * @author Admin
 */
public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(getNumber(3));
    }
    
    public static long getNumber(int position) {
        if (position <= 0) {
            return -1;
        } else if (position == 1 || position == 2) {
            return 1;
        } else {
            return getNumber(position - 1) + getNumber(position - 2);
        }
        
        
    }
}
