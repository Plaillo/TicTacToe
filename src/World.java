public class World {

	private char[] board = new char[9];
	private char c;
	private int gameTime;
	private World world;

	public World() {
		initializeBoard();
	}

	public void initializeBoard() {
		for (int i = 0; i < board.length; i++) {
			this.board[i] = '#';
		}
		displayBoard();
	}

	private void displayBoard() {
		System.out.println("" + board[0] + board[1] + board[2]);
		System.out.println("" + board[3] + board[4] + board[5]);
		System.out.println("" + board[6] + board[7] + board[8]);
	}

	public char[] getBoard() {
		return board;
	}

	public void setStone(char c, int x) {
		board[x] = c;
	}

	public char getStone(int x) {
		return board[x];
	}

	public boolean isDraw() {
		if (gameTime > 8) {
			System.out.println("Draw!");
			return true;
		}
		return false;
	}

	public char isWon() {
		// horizontal
		if (board[0] == board[1] && board[0] == board[2]) {
			return board[0];
		} else if (board[3] == board[4] && board[3] == board[5]) {
			return board[3];
		} else if (board[6] == board[7] && board[6] == board[8]) {
			return board[6];
		}

		// vertical
		if (board[0] == board[3] && board[0] == board[6]) {
			return board[0];
		} else if (board[1] == board[4] && board[1] == board[7]) {
			return board[1];
		} else if (board[2] == board[5] && board[2] == board[8]) {
			return board[2];
		}

		// diagonal
		if (board[0] == board[4] && board[0] == board[8]) {
			return board[0];
		} else if (board[2] == board[4] && board[2] == board[6]) {
			return board[2];
		}

		return 'D';
	}

	public void checkWinner() {
		char winner = isWon();

		if (winner == 'X') {
			System.out.println("Player X won!");
		} else if (winner == 'O') {
			System.out.println("Player O won!");
		} else if (winner == 'D') {
			System.out.println("The Game is a draw!");
		}
	}

}
