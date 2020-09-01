package chessPuzzle.pieces;

import java.util.ArrayList;
import java.util.List;

public class Bishop extends ChessPiece {

	@Override
	public String[] getAllValidCells(String currentPosition) {
		int[] rankAndFile = parseCellValue(currentPosition);
		int file = rankAndFile[0];
		int rank = rankAndFile[1];

		List<String> validPositionsList = new ArrayList<String>();

		/*
		 * Bishop can move diagonally in all directions
		 * 1. diagonal NE
		 * 2. diagonal SE
		 * 3. diagonal NW
		 * 4. diagonal SW
		 */
		
		int tempFile = file + 1;
		int tempRank = rank + 1;

		while (tempFile <= 8 && tempRank <= 8) {
			validPositionsList.add(getCellValue(tempRank, tempFile));
			tempFile++;
			tempRank++;
		}
		
		tempFile = file -1;
		tempRank = rank -1;
		
		while (tempFile >=1 && tempRank >= 1) {
			validPositionsList.add(getCellValue(tempRank, tempFile));
			tempFile--;
			tempRank--;
		}
		
		tempFile = file + 1;
		tempRank = rank - 1;
		
		while(tempFile <= 8 && tempRank >=1) {
			validPositionsList.add(getCellValue(tempRank, tempFile));
			tempFile++;
			tempRank--;
		}
		
		tempFile = file - 1;
		tempRank = rank + 1;
		
		while(tempFile >=1 && tempRank <=8) {
			validPositionsList.add(getCellValue(tempRank, tempFile));
			tempFile--;
			tempRank++;
		}

		return validPositionsList.toArray(new String[] {});
	}

}
