package boardgame;

public class BoardException extends RuntimeException {
	private static final long serialVersionUID = 1L; 
	//Exce��o opcional de ser tratada
	
	public BoardException(String msg) {
		super(msg);
	}

}
