package learning.interpreter;

public class Interpreter {
    private Operation resultOperation = new Operation();
    
    public static void main(String[] args) {
       Interpreter result = new Interpreter();
        System.out.println(result.resultOperation.getExpression().interpret());
    }
    
    public class Operation {
         // Create a math expression: sqrt((10 + 20) * 30)
        private Expression expression = new SquareRootExpression(
            new MultiExpression(
                new AddExpression(
                    new NumberExpression(10),
                    new NumberExpression(20)
                ),
                new NumberExpression(30)
            )
        );
        public Expression getExpression() {
            return this.expression;
        }
    }
    
    
    public class NumberExpression implements Expression {
        private double value;
        
        public NumberExpression(double value) {
            this.value = value;
        }
        
        @Override
        public double interpret() {
            return value;
        }
    }
    
    public class AddExpression implements Expression {
        private Expression  firstOperand;
        private Expression  secondOperand;
        
        public AddExpression(Expression  firstOperand, Expression  secondOperand) {
            this.firstOperand = firstOperand;
            this.secondOperand = secondOperand;
        }
        
        @Override
        public double interpret() {
            return firstOperand.interpret() + secondOperand.interpret();
        }
    }
    
    public class SubExpression implements Expression {
        private Expression  firstOperand;
        private Expression  secondOperand;
        
        public SubExpression(Expression  firstOperand, Expression  secondOperand) {
            this.firstOperand = firstOperand;
            this.secondOperand = secondOperand;
        }
        
        @Override
        public double interpret() {
            return firstOperand.interpret() - secondOperand.interpret();
        }
    }
    
    public class MultiExpression implements Expression {
        private Expression  firstOperand;
        private Expression  secondOperand;
        
        public MultiExpression(Expression  firstOperand, Expression  secondOperand) {
            this.firstOperand = firstOperand;
            this.secondOperand = secondOperand;
        }
        
        @Override
        public double interpret() {
            return firstOperand.interpret() * secondOperand.interpret();
        }
    }
    
    public class DivisionExpression implements Expression {
        private Expression  firstOperand;
        private Expression  secondOperand;
        
        public DivisionExpression(Expression  firstOperand, Expression  secondOperand) {
            this.firstOperand = firstOperand;
            this.secondOperand = secondOperand;
        }
        
        @Override
        public double interpret() {
            if (secondOperand.interpret() != 0) return firstOperand.interpret() / secondOperand.interpret();
            else {
                throw new ArithmeticException("You can't divide by zero"); 
            }   
        } 
    }
    
    public class SquareRootExpression implements Expression {
        private Expression operand;
        
        public SquareRootExpression(Expression operand) {
            this.operand = operand;
        }
        
        @Override
        public double interpret(){
            double value = operand.interpret();
            if (value < 0) {
                throw new IllegalArgumentException("Square root of a negative number is undefined.");
            }
            
            return Math.sqrt(value);
        }
    }
}
