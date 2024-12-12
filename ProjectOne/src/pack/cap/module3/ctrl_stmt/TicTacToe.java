package pack.cap.module3.ctrl_stmt;
public class TicTacToe {

    public static boolean checkWinner(char[][] board) {
        // Check rows for a winner
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
                return true;  // Winner in row
            }
        }

        // Check columns for a winner
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != ' ') {
                return true;  // Winner in column
            }
        }

        // Check diagonals for a winner
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {
            return true;  // Winner in diagonal
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ') {
            return true;  // Winner in diagonal
        }

        return false;  // No winner
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char[][] board = {
            {'X', 'O', 'X'},
            {'O', 'X', 'O'},
            {' ', ' ', 'X'}
        };

        printBoard(board);
        if (checkWinner(board)) {
            System.out.println("We have a winner!");
        } else {
            System.out.println("No winner yet.");
        }
    }
}


