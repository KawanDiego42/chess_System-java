package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		UI ui = new UI();
		ChessMatch chessMatch = new ChessMatch();
		ui.printBoard(chessMatch.getPieces());
	}

}
