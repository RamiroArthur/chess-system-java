package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);
		// Informa quem é o tabuleiro, quem é a cor da peça
		// Repaço esses dados para o construtor da superlcasse
	}
	
	@Override
	public String toString() {
		return "R";
	}//Fazemos o toString da peça pois ela ira entrar na hora de imprimir o tabuleiro
}
