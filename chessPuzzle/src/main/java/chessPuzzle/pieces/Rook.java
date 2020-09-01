package chessPuzzle.pieces;

import java.util.ArrayList;
import java.util.List;

import chessPuzzle.util.CellUtils;

public class Rook extends ChessPiece {

	@Override
	public String[] getAllValidCells(String currentPosition) {
		int[] rankAndFile = CellUtils.parseCellValue(currentPosition);
		int file = rankAndFile[0];
		int rank = rankAndFile[1];

		List<String> validPositionsList = new ArrayList<String>();

		/*
		 * Rook can move horizontally and vertically
		 * 1. horizontally left
		 * 2. horizontally right
		 * 3. vertically up
		 * 4. vertically down
		 */
		
		int tempRank = rank + 1;
		while (tempRank <= 8) {
			validPositionsList.add(CellUtils.getCellValue(tempRank, file));
			tempRank++;
		}

		tempRank = rank - 1;
		while (tempRank >= 1) {
			validPositionsList.add(CellUtils.getCellValue(tempRank, file));
			tempRank--;
		}

		int tempFile = file + 1;
		while (tempFile <= 8) {
			validPositionsList.add(CellUtils.getCellValue(rank, tempFile));
			tempFile++;
		}

		tempFile = file - 1;
		while (tempFile >= 1) {
			validPositionsList.add(CellUtils.getCellValue(rank, tempFile));
			tempFile--;
		}

		return validPositionsList.toArray(new String[] {});
	}

}
