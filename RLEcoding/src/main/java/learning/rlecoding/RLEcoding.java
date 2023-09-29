package learning.rlecoding;

import java.util.Arrays;


public class RLEcoding {
    
    public static void main(String[] args) {
        
        if (args != null && args.length > 0) {
            
            String temp;
            
            StringBuilder strBuild = new
            
            int counter = 0;
            
            String[] strArr = args[0].split("");
            temp = strArr[0];
            for (String item: strArr) {
                if (temp == item) {
                    counter++;
                    if (counter == 9) {
                        
                    }
                }
                
            }
            
            
        } else System.out.println("");
    }    
}
