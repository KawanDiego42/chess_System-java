package chess;

import boardgame.Position;

public class ChessPosition {

	private char column;
	private int row;
	
	//Instancia posição do xadrez
	public ChessPosition(char column, int row) {
		if(column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8");
		}
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}
	
	//Obtém posição da matriz a partir de uma posição do xadrez
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
	//Obtém posição do xadrez a partir de uma posição da matriz
	protected static ChessPosition fromPosition(Position position ) {
		return new ChessPosition((char) ('a' + position.getColumn()), 8 - position.getRow());
	}
	
	@Override
	public String toString() {
		return "" + column + row;
	}
	
}
