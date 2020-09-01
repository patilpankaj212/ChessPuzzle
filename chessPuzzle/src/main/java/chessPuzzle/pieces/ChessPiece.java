package chessPuzzle.pieces;

public abstract class ChessPiece {
	
	//each chess piece will implement this method and return all valid positions on an empty chess board
	public abstract String[] getAllValidCells(String currentPosition);
	
	//method of convert rank and file to a square on the board
	public String getCellValue(int rank, int file) {
		
		if(rank < 0 || file < 0) {
			throw new IllegalArgumentException("Rank and File of a piece cannot be less than 1");
		}
		
		if(rank > 8 || file > 8) {
			throw new IllegalArgumentException("Rank and File of a piece cannot be greater than 8");
		}
		
		String cellValue = null;

		switch (file) {
		case 1:
			cellValue = "A";
			break;
		case 2:
			cellValue = "B";
			break;
		case 3:
			cellValue = "C";
			break;
		case 4:
			cellValue = "D";
			break;
		case 5:
			cellValue = "E";
			break;
		case 6:
			cellValue = "F";
			break;
		case 7:
			cellValue = "G";
			break;
		case 8:
			cellValue = "H";
			break;
		}

		return cellValue + Integer.toString(rank);
	}
	
	//method to parse a position to extract rank and file 
	public int[] parseCellValue(String position) {
		int[] rankFileValue = new int[2];
		
		if(position.length() > 2) {
			throw new IllegalArgumentException("Invalid Position: Position is of form E4, where E is file and 4 is rank");
		}
		
		try {
			rankFileValue[1] = Integer.parseInt(Character.toString(position.charAt(1)));
		} catch(NumberFormatException e) {
			throw new IllegalArgumentException("Invalid Rank: Rank has to be a number");
		}
		
		if(rankFileValue[1] > 8 || rankFileValue[1] < 0) {
			throw new IllegalArgumentException("Invalid Rank: Rank has to be between 1 and 8");
		}
		
		switch(position.charAt(0)) {
		case 'A':
			rankFileValue[0] = 1;
			break;
		case 'B':
			rankFileValue[0] = 2;
			break;
		case 'C':
			rankFileValue[0] = 3;
			break;
		case 'D':
			rankFileValue[0] = 4;
			break;
		case 'E':
			rankFileValue[0] = 5;
			break;
		case 'F':
			rankFileValue[0] = 6;
			break;
		case 'G':
			rankFileValue[0] = 7;
			break;
		case 'H':
			rankFileValue[0] = 8;
			break;
		default:
			throw new IllegalArgumentException("invalid Rank");
				
		}
		
		return rankFileValue;
	}
}