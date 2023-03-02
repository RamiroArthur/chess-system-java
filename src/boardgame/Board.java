package boardgame;

public class Board {
	//Um tabuleiro tem a quantidade de linhas e colunas!
	private int rows;
	private int columns;
	private Piece[][] pieces; //Matriz de pe�as
	
	public Board(int rows, int columns) {
		if (rows < 1 || columns < 1) {
			throw new BoardException("Error creating board: there must be at least 1 row and 1 column");
		}
		this.rows = rows;
		this.columns = columns;
		
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	//A Classe [Board] m�o retornar� a matriz inteira, s� ir� retornar uma pe�a por vez!
	
	public Piece piece(int row, int column) {
		if(!positionExists(row, column)) {
			throw new BoardException("Position not on the board");
		}
		
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("There is already a piece on position " + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		//Pegar a matriz, e na posi��o dada, atribuir a pe�a que eu informei.
		//Agora a pe�a n�o estar� mais na poi��o NULL, ela estar� nessa posi��o position
		piece.position = position; //O atributo � protected � assessivel diretamente por [BOARD]
	}  
	
	public Piece removePiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		if (piece(position) == null) {
			return null;
		}
		Piece aux = piece(position);
		aux.position = null;
		pieces[position.getRow()][position.getColumn()] = null;
		//Na posi��o onde eu removo a pe�a ser� agora null
		//Indicando que n�o h� mais pe�as nessa posi��o da matriz!
		return aux; //Retorna a pe�a que foi retirada!
	}
	
	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	
	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return piece(position) != null;
	}
	
	
	
	
	
	
	
}
