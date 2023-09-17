package learning.thetictactoe;

public enum ActionFigure {
    //нулик
    NOUGHT("O"), 
    //хрестик
    CROSS("X"),
    // empty field
    EMPTY("*");
    
    private String symbol;

    ActionFigure(String symbol) {
        this.symbol = symbol;
    }
    
    
    @Override
    public String toString() {
       return this.symbol;
   }
    
}
