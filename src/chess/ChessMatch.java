package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch { //Coração do Sistema de Xadrez! Regras do jogo!
	

	
	private Board board;
	
	public ChessMatch() {
		board = new Board(8,8);
		initialSetup();
		//Na hora que inicia a partida: Cria tabuleiro 8x8
		//E chama o initial setup
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i=0; i<board.getRows(); i++) {
			for (int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat; //Retorna matriz de peças da partida de xadrez!
	}
	
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
		board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
		board.placePiece(new King(board, Color.WHITE), new Position(7, 4));
		
	} //Inicia a partida de xadrez colocando as peças no tabuleiro

}