package boardgame;

public class Board {
	//Um tabuleiro tem a quantidade de linhas e colunas!
	private int rows;
	private int columns;
	private Piece[][] pieces; //Matriz de pe�as
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	//A Classe [Board] m�o retornar� a matriz inteira, s� ir� retornar uma pe�a por vez!
	
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		pieces[position.getRow()][position.getColumn()] = piece;
		//Pegar a matriz, e na posi��o dada, atribuir a pe�a que eu informei.
		//Agora a pe�a n�o estar� mais na poi��o NULL, ela estar� nessa posi��o position
		piece.position = position; //O atributo � protected � assessivel diretamente por [BOARD]
	}  
	
	
	
	
	
}
