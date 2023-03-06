package boardgame;

public class Position {
	
	private int row;
	private int column;
	
	
	public Position() {
	}


	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}


	public int getColumn() {
		return column;
	}


	public void setColumn(int columnInteger) {
		this.column = columnInteger;
	}
	
	public void setValues(int row, int column) {
		this.row = row;
		this.column = column;
	} //Opera��o para autalizar valores de uma posi��o
	
	
	@Override
	public String toString() {
		return row + ", " + column;
	}
	
	
}
