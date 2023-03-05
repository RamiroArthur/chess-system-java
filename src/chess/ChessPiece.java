package chess;

import boardgame.Board;	
import boardgame.Piece;

public abstract class ChessPiece extends Piece{

	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	//Apenas o Get (N�o quero deixar que a cor de uma pe�a seja modificada)	
}
