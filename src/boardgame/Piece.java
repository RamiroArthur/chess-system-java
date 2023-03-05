package boardgame;

public abstract class Piece {
	
	protected Position position;
	private Board board;
	  
	public Piece(Board board) {
		this.board = board;
		position = null; //Opcional "pois board ja vem apontando para null afinal não instanciou nada ainda"
	}

	protected Board getBoard() { //Acesso na mesma camada e em Sub-Classes de [Piece]
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) { //metodo que depende de um metodo abstrato
		return possibleMoves()[position.getRow()][position.getColumn()];
	}//Rook metods, metod que faz gancho com a subclasse
	//Isso só ira fazer sentido quando existir uma Classe concreta que implementar a operação abstrata acima!
  
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
	
}
