package learning.thetictactoe;

import java.util.Scanner;


public class Player {
    
    private final ActionFigure figure;
    
    public Player(ActionFigure figure) {
        this.figure = figure;
    }
   
    public Move turn(Board board) {
        
        Scanner scanner = new Scanner(System.in);
        int x, y;
        
        Move move = new Move();
        
        while (true) {
            System.out.println("Enter X, Y");
        
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        
            if (isCellValid(x, y, board)) {
                move.setX(x);
                move.setY(y);
                move.setFigure(figure);
                break;
        }
        }
        
	return move;
        }
    
    public static boolean isCellValid(int x, int y, Board board) {
        if (x < 0 || y < 0 || x >= board.getBoardSize() || y >= board.getBoardSize()) {
            return false;
        }
        
        if (board.getMap()[y][x] != ActionFigure.EMPTY) {
            System.out.println("The field isn't empty.");
            return false;
        }
     
        return true;
    }
    
    @Override
    public String toString() {
       return this.figure.toString();
   }
	
}
