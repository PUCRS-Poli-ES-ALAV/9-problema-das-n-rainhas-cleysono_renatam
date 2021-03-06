/* Java program to solve N Queen Problem using 
backtracking */
public class NQueenProblem { 
	final int N = 4; 

	public static void main(String args[]) 
	{ 
		NQueenProblem Queen = new NQueenProblem(); 
		Queen.solveNQ(); 
	} 
	public void sout(int board[][]) 
	{ 
		for (int i = 0; i < N; i++) { 
			for (int j = 0; j < N; j++) 
				System.out.print(" " + board[i][j] 
								+ " "); 
			System.out.println(); 
		} 
	} 
	public boolean isSafe(int board[][], int row, int col) 
	{ 
		int i, j; 

		for (i = 0; i < col; i++) 
			if (board[row][i] == 1) 
				return false; 

		for (i = row, j = col; i >= 0 && j >= 0; i--, j--) 
			if (board[i][j] == 1) 
				return false; 

		for (i = row, j = col; j >= 0 && i < N; i++, j--) 
			if (board[i][j] == 1) 
				return false; 

		return true; 
	} 

	public boolean solve(int board[][], int col) 
	{ 
		if (col >= N) 
			return true; 
		for (int i = 0; i < N; i++) { 
			if (isSafe(board, i, col)) { 
				board[i][col] = 1; 
				if (solve(board, col + 1) == true) 
					return true; 
				board[i][col] = 0;
			} 
		} 
		return false; 
	} 
	public boolean solveNQ() 
	{ 
		int board[][] = { { 0, 0, 0, 0 }, 
						  { 0, 0, 0, 0 }, 
						  { 0, 0, 0, 0 }, 
						  { 0, 0, 0, 0 } }; 

		if (solve(board, 0) == false) { 
			System.out.print("Nao ha solucao"); 
			return false; 
		} 

		sout(board); 
		return true; 
	}
} 