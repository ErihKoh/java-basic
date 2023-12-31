package learning.thetictactoe;



public class Board {
    
    private static final int BOARD_SIZE = 3;
    private  ActionFigure[][] map;
    
    Board() {
        map = new ActionFigure[BOARD_SIZE][BOARD_SIZE];
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                map[i][j] = ActionFigure.valueOf("EMPTY");
            }
        }
    }
    
    public int getBoardSize() {
        return Board.BOARD_SIZE;
    }
    
    public ActionFigure[][] getMap() {
        return this.map;
    }
    

    public boolean hasMoreSpace(Board board) {
        
        for (int i = 0; i < board.getBoardSize(); i++) {
            for (int j = 0; j < board.getBoardSize(); j++) {
                if (board.getMap()[i][j] == ActionFigure.EMPTY) return false;   
            } 
        }
        return true;
    }

    public void print() {
	// 0 1 2 3
        // 1 * * *
        // 2 * * *
        // 3 * * *
        
        for (int i = 0; i <= BOARD_SIZE; i++) {
            System.out.print(i + " "); //0 1 2 3
        }
        
        System.out.println();
        
        for (int i = 0; i < BOARD_SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            
            System.out.println();
        }
            
    }
}
