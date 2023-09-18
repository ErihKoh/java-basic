package learning.thetictactoe;


public class Referee {

    public void put(Move move, Board board) {
        
        board.getMap()[move.getX()][move.getY()] = move.getFigure();
                
    }

    public boolean isWin(Move move, Board board) {
		return false;
    }

}
