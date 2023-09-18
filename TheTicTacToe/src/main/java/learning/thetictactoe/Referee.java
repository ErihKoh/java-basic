package learning.thetictactoe;


public class Referee {

    public void put(Move move, Board board) {
        
        board.getMap()[move.getX()][move.getY()] = move.getFigure();
        
        System.out.println("Puted: " + move.getFigure());
                
    }

    public boolean isWin(Move move, Board board) {
        
        if (board.getMap()[0][0] == move.getFigure() && board.getMap()[0][1] == move.getFigure() && board.getMap()[0][2] == move.getFigure()) return true;
        if (board.getMap()[1][0] == move.getFigure() && board.getMap()[1][1] == move.getFigure() && board.getMap()[1][2] == move.getFigure()) return true;
        if (board.getMap()[2][0] == move.getFigure() && board.getMap()[2][1] == move.getFigure() && board.getMap()[2][2] == move.getFigure()) return true;
        
        if (board.getMap()[0][0] == move.getFigure() && board.getMap()[1][0] == move.getFigure() && board.getMap()[2][0] == move.getFigure()) return true;
        if (board.getMap()[0][1] == move.getFigure() && board.getMap()[1][1] == move.getFigure() && board.getMap()[2][1] == move.getFigure()) return true;
        if (board.getMap()[0][2] == move.getFigure() && board.getMap()[1][2] == move.getFigure() && board.getMap()[2][2] == move.getFigure()) return true;
        
        if (board.getMap()[0][0] == move.getFigure() && board.getMap()[1][1] == move.getFigure() && board.getMap()[2][2] == move.getFigure()) return true;
        if (board.getMap()[0][2] == move.getFigure() && board.getMap()[1][1] == move.getFigure() && board.getMap()[2][0] == move.getFigure()) return true;
        
	return false;
    }

}
