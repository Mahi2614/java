
public class NQueens {
    static int count = 0;

    public static void main(String[] args) {
        int n = 6;
        char board[][] = new char[n][n];
        // Initialize board
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }

        if (nQueen(board, 0)) {
            System.out.println("Solution is possible:");
            printBoard(board);
        } else {
            System.out.println("Solution is not possible.");
        }
    }

    public static boolean nQueen(char board[][], int row) {
        // Base case: All queens are placed
        if (row == board.length) {
            count++;
            return true;
        }

        // Try placing queen in each column of current row
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q'; // Place queen
                if (nQueen(board, row + 1)) {
                    return true;
                }
                board[row][col] = 'x'; // Backtrack
            }
        }
        return false; // No safe placement found for this row
    }

    public static boolean isSafe(char board[][], int row, int col) {
        // Check if there's a queen in the same column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check upper left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check upper right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true; // No conflict found
    }

    public static void printBoard(char board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
