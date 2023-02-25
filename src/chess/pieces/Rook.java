package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);
		// Informa quem � o tabuleiro, quem � a cor da pe�a
		// Repa�o esses dados para o construtor da superlcasse
	}
	
	@Override
	public String toString() {
		return "R";
	}//Fazemos o toString da pe�a pois ela ira entrar na hora de imprimir o tabuleiro
}
