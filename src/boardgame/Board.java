package boardgame;

import java.util.ArrayList;
import java.util.List;

public class Board {

	public Integer rows;
	public Integer columns;
	private Piece[][] pieces;
	
	public Board() {
		
	}

	public Board(Integer rows, Integer columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getColumns() {
		return columns;
	}

	public void setColumns(Integer columns) {
		this.columns = columns;
	}

	public Piece piece(Integer row, Integer column) {
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece contract) {
		
	}
	
	public Piece removePiece(Piece contract) {
		
	}
	
	public boolean positionExists(Position position) {
		
	}
	
	public boolean thereIsAPiece(Position position) {
		
	}
	
}
