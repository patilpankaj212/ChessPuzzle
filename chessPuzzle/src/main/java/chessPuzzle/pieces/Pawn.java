package chessPuzzle.pieces;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends ChessPiece {

	@Override
	public String[] getAllValidCells(String currentPosition) {
		int[] rankAndFile = parseCellValue(currentPosition);
		int file = rankAndFile[0];
		int rank = rankAndFile[1];
		
		//if a pawn is at 8th rank, it has no cell to move.
		if (rank == 8) {
			return new String[] {};
		}
		
		List<String> validPositionsList = new ArrayList<String>();
		
		//pawn can only move 1 rank up
		validPositionsList.add(getCellValue(rank + 1, file));
		
		return validPositionsList.toArray(new String[] {});
	}
}
