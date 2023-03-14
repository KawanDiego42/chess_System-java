package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	public Piece(Position position) {
		this.position = position;
	}

	protected Board getBoard() {
		return board;
	}
	
	public boolean[][] possibleMoves() {
		
	}
	
	public boolean possibleMove(Position position) {
		
	}
	
	public boolean isThereAnyPossibleMove() {
		
	}
	
}
