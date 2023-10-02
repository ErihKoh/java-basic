package learning.polishnotationapplication;
import java.util.LinkedList;
import java.util.Scanner;


public class PolishNotationApplication {
    
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        
        String rpnString = str.nextLine();
        
        System.out.println(parse(rpnString));
    }
    
    public static double parse(String rpnString) throws RPNParserException, ArithmeticException {
        Double result = null;
        try {
            
            String[] arrStr = rpnString.split(" ");
            LinkedList<Double> stack = new LinkedList<>();        
            String operators = "+-*/";
            for (String item : arrStr) {
                if (!operators.contains(item)) {
                    try {
                        double dbl =  Double.parseDouble(item);
                        stack.push(dbl);
                    } catch (NumberFormatException e) {
                        throw new RPNParserException();
                    }
                } else {
                    String operator = item;
                    double temp1 = stack.pop();
                    double temp2 = stack.pop();
                    
                    switch(operator) {
                        case "+":
                            stack.push(temp1 + temp2);
                            break;
                            
                        case "-":
                            stack.push(temp2 - temp1);
                            break;
                        case "*":
                            stack.push(temp1 * temp2);
                            break;
                        case "/":
                            if (temp1 != 0) {
                               stack.push(temp2 / temp1); 
                               break;
                            } else {
                                throw new ArithmeticException();
                            }
                            
                        default:
                            throw new RPNParserException();
                    }
                }
                
            }
            
            if (!stack.isEmpty()) result = stack.pop();
             
            
        } catch (RPNParserException e) {
            throw e;
        }
        
        return result;
    }
    
    public static class RPNParserException extends RuntimeException{
          
}
}
