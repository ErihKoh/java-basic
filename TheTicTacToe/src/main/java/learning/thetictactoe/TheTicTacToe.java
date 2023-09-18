package learning.thetictactoe;

public class TheTicTacToe {

    public static void main(String[] args) {
        Move move;
        
	Referee referee = new Referee();
				
	Player player1 = new Player(ActionFigure.CROSS);
	Player player2 = new Player(ActionFigure.NOUGHT);
        
	Board board = new Board(); 
        board.print();
    
	while (true) {
            
            if (board.hasMoreSpace(board)) {
                System.out.println("Draw");
		break;
            }
			
            move = player1.turn(board);
            		
            referee.put(move, board); 
			
            board.print(); 
			
            if (referee.isWin(move, board)) { 
		System.out.println("Player1 win!");		
		break;
            } 
            
            if (board.hasMoreSpace(board)) {
                System.out.println("Draw");
		break;
            }
			
            move = player2.turn(board);
            referee.put(move, board);
            board.print();
            if (referee.isWin(move, board)) {
                System.out.println("Player2 win!");
		break;
            }
	}
    }
}
