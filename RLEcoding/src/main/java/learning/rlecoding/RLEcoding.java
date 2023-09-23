package learning.rlecoding;

import java.util.Arrays;


public class RLEcoding {

    public static String encoding(String str) {
        String[] arr;
        int counter = 0;
        String temp;
        if (str == null && "".equals(str)) return "1";
        else arr = str.split("");
        
        for (String item : arr) {
            temp = item;
            if (temp.equals(item)) {
                counter++;
            } else {
                String newString = temp + counter;
                counter = 0;
                System.out.println(newString);
            }
        }
        
        
        return "";
    }
    
    public static void main(String[] args) {
        encoding("");
    }
}
