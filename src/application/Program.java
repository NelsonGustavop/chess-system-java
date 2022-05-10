package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		ChessMatch ch = new ChessMatch();
		UI.printBoard(ch.getpieces());

	}

}
