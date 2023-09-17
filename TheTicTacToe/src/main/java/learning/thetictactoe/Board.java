package learning.thetictactoe;

import java.util.Scanner;


public class Board {
    
    static Scanner scanner;
    
    private static char[][] board;
    
    private static final int BOARD_SIZE = 3;
    
    private static final char EMPTY_FIELD = '*'; 
    
    public void boardInit() {
        board = new char [BOARD_SIZE][BOARD_SIZE];
        
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
               board[i][j] = EMPTY_FIELD;
            }
        
        }
        scanner = new Scanner(System.in);
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
            System.out.print(i + " " );  // 0 1 2 3 
        }
        
        System.out.println();
        
        for (int i = 0; i < BOARD_SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(board[i][j] + " ");
                
            }
            
            System.out.println();
            
        }
                
    }
}
