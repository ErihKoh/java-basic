package learning.rlecoding;


public class RLEcoding {
    
    public static void main(String[] args) {
        
        System.out.println(encode("AAABBBCCCDDDDDDDDDDD"));
    }  
    
    public static String encode(String data) {
        
        StringBuilder encoded = new StringBuilder();
        char temp = data.charAt(0);
        int counter = 1;
        
        for (int i = 1; i < data.length(); i++) {
            if (data.charAt(i) == temp) {
                if (counter < 9) counter++;
                else {
                    encoded.append(temp);
                    encoded.append(9);
                    counter = 1;
                }
            }
            else {
                encoded.append(temp);
                encoded.append(counter);
                temp = data.charAt(i);
                counter = 1;
            }
            
        }
        
        encoded.append(temp);
        encoded.append(counter);
        
        return encoded.toString();
    }
}
