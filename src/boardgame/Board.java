package boardgame;

public class Board {
	//Um tabuleiro tem a quantidade de linhas e colunas!
	private int rows;
	private int columns;
	private Piece[][] pieces; //Matriz de peças
	
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
	//A Classe [Board] mão retornará a matriz inteira, só irá retornar uma peça por vez!
	
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		pieces[position.getRow()][position.getColumn()] = piece;
		//Pegar a matriz, e na posição dada, atribuir a peça que eu informei.
		//Agora a peça não estará mais na poição NULL, ela estará nessa posição position
		piece.position = position; //O atributo é protected é assessivel diretamente por [BOARD]
	}  
	
	
	
	
	
}
