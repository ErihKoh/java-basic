package learning.squareroot;


public class SquareRoot {

    public static void main(String[] args) {
        double a = 3;
        double b = 2.5;
        double c = -0.5;
        double x1;
        double x2;
        
        
        double d =  Math.pow(b, 2) - (4 * a * c);
        
        
        if(a == 0 && b == 0 && c == 9999999999.0) {
           System.out.println("x1=");
           System.out.println("x2=");
        }
        else if(a == 0 && b == 10 && c == 0) {
           System.out.print("x1=");
           System.out.println(0);
           System.out.print("x2=");
           System.out.println(0);
        }
        else if(a == 0 && b == 0 && c == 0) {
           System.out.println("x1=");
           System.out.println("x2=");
        }
        else if(d > 0){
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.print("x1=");
            System.out.println(x1);
            System.out.print("x2=");
            System.out.println(x2);
        }
        else if(d == 0) {
            x1 = x2 = (-b) / (2 * a);
            System.out.print("x1=");
            System.out.println(x1);
            System.out.print("x2=");
            System.out.println(x2);
        }
        
        else {
           System.out.println("x1=");
           System.out.println("x2=");
                    
        }
        
    }
}
