package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	  
	public Piece(Board board) {
		this.board = board;
		position = null; //Opcional "pois board ja vem apontando para null afinal não instanciou nada ainda"
	}

	protected Board getBoard() { //Acesso na mesma camada e em Sub-Classes de [Piece]
		return board;
	}
  
}
