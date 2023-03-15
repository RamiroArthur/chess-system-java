package chess;

import boardgame.Position;

public class ChessPosition {
	
	private char column;
	private int row;
	
	public ChessPosition(char column, int row) {
		
		if (column < 'a' || column > 'h'|| row < 1 || row > 8) {
			//Se acontecer alguma dessas coisas, não vou aceitar a instanciação do meu chessPosition
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
	
	//Método para converter a ChessPostion para o Position(normal)
	//Linha = 8 - chess_row
	//Coluna = unicode 'a' - unicode 'a' = 0   | unicode 'b' - unicode 'a' = 1 ....
	//Coluna  = chess_colum - 'a'
	
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
	//Função Inversa: dada uma posição na matriz eu converto para uma posição de xadrez
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' + position.getColumn()), 8 - position.getRow());
	}
	
	@Override
	public String toString() {
		return "" + column + row; 
		//O string vazio é pro compilador entendeder que se trata de uma concatenação de String e poder retornar
	}
}
