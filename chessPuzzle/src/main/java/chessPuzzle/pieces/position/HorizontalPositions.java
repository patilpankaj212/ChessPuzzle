package chessPuzzle.pieces.position;

import java.util.ArrayList;
import java.util.List;

import chessPuzzle.utils.CellUtils;

public class HorizontalPositions implements Positions {

	@Override
	public List<String> getPositions(int steps, String currentPosition, boolean isPawn) {

		if (!(steps == 1 || steps == -1)) {
			throw new IllegalArgumentException("valid values for steps is 1 or -1");
		}

		List<String> validPositionsList = new ArrayList<>();

		int[] fileRankValue = CellUtils.parseCellValue(currentPosition);
		int file = fileRankValue[0];
		int rank = fileRankValue[1];

		if (steps == 1) {
			if (CellUtils.isValidFileAndRank(file + 1, rank)) {
				validPositionsList.add(CellUtils.getCellValue(rank, file + 1));
			}
			if (CellUtils.isValidFileAndRank(file - 1, rank)) {
				validPositionsList.add(CellUtils.getCellValue(rank, file - 1));
			}
		} else {
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
		}

		return validPositionsList;
	}

}
