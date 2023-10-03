package learning.reversestring;
import java.util.Scanner;


public class ReverseString {
    
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("Enter string for reverse: ");
//        String in = scn.nextLine();
//        System.out.println(reverse(in));

          System.out.println("Enter first string for compare: ");
          String in1 = scn.nextLine();
          System.out.println("Enter second string for compare: ");
          String in2 = scn.nextLine();
          
          Boolean isAnagramm = isAnagrams(in1, in2);
          
          if (isAnagramm) System.out.println("True");
          else System.out.println("False");
                  

         scn.close();
    }
    
    public static StringBuilder reverse(String str) {
        String[] arrStr = str.split("");
        StringBuilder sb = new StringBuilder();
        int tempIndex = 0;
        
        for (int i = arrStr.length - 1; i >=0; i--) {
            
            sb.append(arrStr[i]);
            tempIndex++;
        }
        
       return sb; 
    }
    
    public static Boolean isAnagrams(String str1, String str2) {
         String str3 = reverse(str2).toString();
         
        return !(str1 == null ? str3 != null : !str1.equals(str3));
    }
}
