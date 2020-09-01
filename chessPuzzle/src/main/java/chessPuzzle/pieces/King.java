package chessPuzzle.pieces;

import java.util.ArrayList;
import java.util.List;

import chessPuzzle.util.CellUtils;

public class King extends ChessPiece {

	@Override
	public String[] getAllValidCells(String currentPosition) {
		int[] rankAndFile = CellUtils.parseCellValue(currentPosition);
		int file = rankAndFile[0];
		int rank = rankAndFile[1];

		List<String> validPositionsList = new ArrayList<String>();

		addPosition(file, rank, validPositionsList, false);

		if (rank + 1 <= 8) {
			addPosition(file, rank + 1, validPositionsList, true);
		}

		if (rank - 1 >= 1) {
			addPosition(file, rank - 1, validPositionsList, true);
		}

		return validPositionsList.toArray(new String[] {});
	}

	//method to add positions as rank is incremented and decremented
	private void addPosition(int file, int rank, List<String> validPositionsList, boolean newPosition) {

		if (newPosition) {
			validPositionsList.add(CellUtils.getCellValue(rank, file));
		}

		if (file + 1 <= 8) {
			validPositionsList.add(CellUtils.getCellValue(rank, file + 1));
		}

		if (file - 1 >= 1) {
			validPositionsList.add(CellUtils.getCellValue(rank, file - 1));
		}
	}

}
