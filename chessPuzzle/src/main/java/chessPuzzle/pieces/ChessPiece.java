package chessPuzzle.pieces;

public abstract class ChessPiece {

	// each chess piece will implement this method and return all valid positions on
	// an empty chess board
	public abstract String[] getAllValidCells(String currentPosition);

}