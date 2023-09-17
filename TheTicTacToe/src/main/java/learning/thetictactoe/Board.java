package learning.thetictactoe;



public class Board {
    
    private static final int BOARD_SIZE = 3;
    private static ActionFigure[][] map;
    
    Board() {
        map = new ActionFigure[BOARD_SIZE][BOARD_SIZE];
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                map[i][j] = ActionFigure.valueOf("EMPTY");
            }
        }
    }

    public boolean hasMoreSpace() {
	return false;
    }

    public void print() {
	// 0 1 2 3
        // 1 * * *
        // 2 * * *
        // 3 * * *
        
        for (int i = 0; i <= BOARD_SIZE; i++) {
            System.out.print((i + 1) + " "); //0 1 2 3
        }
        
        System.out.println("");
        
        for (int i = 0; i < BOARD_SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            
            System.out.println("");
        }
            
    }
}
