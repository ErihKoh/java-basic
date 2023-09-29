package learning.rledecoding;


public class RLEdecoding {

    public static void main(String[] args) {
        if (args != null && args.length > 0) {
            System.out.println(decode(args[0]));
        } else {
          
            System.out.println("Pass string");
        }
    }
    
    public static String decode(String data) {
        Boolean isEmptyString = data.equals("");
        Boolean isConsecutiveDigits = hasConsecutiveNonDigits(data);
        Boolean isFirstCharNonDigit = data.length() == 0 || Character.isDigit(data.charAt(0));
       
        if (isEmptyString && isConsecutiveDigits && isFirstCharNonDigit) return"";
        
        StringBuilder decoded = new StringBuilder();
        
        for (int i = 0; i < data.length(); i++) {
            // last char in string isn't digit
            Boolean isLastCharNonDigit = (i == data.length() - 1 && !Character.isDigit(data.charAt(i)));
            Boolean isNextCharNonDigit = (!Character.isDigit(data.charAt(i)) && !Character.isDigit(data.charAt(i + 1)));
            Boolean isNextCharDigit = (!Character.isDigit(data.charAt(i)) && Character.isDigit(data.charAt(i + 1)));
            
            if (isLastCharNonDigit) {
                decoded.append(data.charAt(i));
                return decoded.toString();
            } 
            // next char isn't digit 
            else if (isNextCharNonDigit) {
                decoded.append(data.charAt(i));
            } 
            // next char is digit
            else if (isNextCharDigit){
                
                for (int j = 0; j < Character.getNumericValue(data.charAt(i + 1)); j++) {
                    decoded.append(data.charAt(i));
                }
            } 
            
        }
        return decoded.toString();
    }
    
    public static boolean hasConsecutiveNonDigits(String input) {
        for (int i = 0; i < input.length() - 1; i++) {
            char currentChar = input.charAt(i);
            char nextChar = input.charAt(i + 1);
            
            if (!Character.isDigit(currentChar) && !Character.isDigit(nextChar)) {
                return true; // Found two consecutive non-digits
            }
        }
        return false; // No two consecutive non-digits found
    }
}

