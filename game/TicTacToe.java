package game;
import java.util.Scanner;

public class TicTacToe {
    private static char[][] board;
    private static char currentPlayer;
    
    public static void main(String[] args) {
        board = new char[3][3];
        currentPlayer = 'X';
        initializeBoard();
        boolean gameFinished = false;
        
        while (!gameFinished) {
            printBoard();
            int[] move = getPlayerMove();
            makeMove(move[0], move[1]);
            
            if (checkWin()) {
                printBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                gameFinished = true;
            } else if (isBoardFull()) {
                printBoard();
                System.out.println("It's a draw!");
                gameFinished = true;
            } else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }
    }
    
    private static void initializeBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = '-';
            }
        }
    }
    
    private static void printBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }
    
    private static int[] getPlayerMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Player " + currentPlayer + ", enter your move (row column): ");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        return new int[]{row, col};
    }
    
    private static void makeMove(int row, int col) {
        board[row][col] = currentPlayer;
    }
    
    private static boolean checkWin() {
        // Check rows
        for (int row = 0; row < 3; row++) {
            if (board[row][0] != '-' && board[row][0] == board[row][1] && board[row][1] == board[row][2]) {
                return true;
            }
        }
        
        // Check columns
        for (int col = 0; col < 3; col++) {
            if (board[0][col] != '-' && board[0][col] == board[1][col] && board[1][col] == board[2][col]) {
                return true;
            }
        }
        
        // Check diagonals
        if (board[0][0] != '-' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return true;
        }
        
        if (board[0][2] != '-' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return true;
        }
        
        return false;
    }
    
    private static boolean isBoardFull() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}


