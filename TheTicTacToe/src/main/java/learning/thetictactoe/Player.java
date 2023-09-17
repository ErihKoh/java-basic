package learning.thetictactoe;


public class Player {
    
    private static ActionFigure figure;
    
    public Player(ActionFigure figure) {
        this.figure = figure;
    }
   
    public Move turn(Board board) {
        
	return null;
        }
    
    @Override
    public String toString() {
       return this.figure.toString();
   }
	
}
