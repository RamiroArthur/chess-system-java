package boardgame;

public class Position {
	
	private int row;
	private int column;
	
	
	public Position() {
	}


	public Position(int row, int columnInteger) {
		this.row = row;
		this.column = column;
	}


	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}


	public int getColumnInteger() {
		return column;
	}


	public void setColumnInteger(int columnInteger) {
		this.column = columnInteger;
	}
	
	@Override
	public String toString() {
		return row + ", " + column;
	}
	
	
}
