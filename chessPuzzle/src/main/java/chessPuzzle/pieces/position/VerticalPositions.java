package chessPuzzle.pieces.position;

import java.util.ArrayList;
import java.util.List;

import chessPuzzle.utils.CellUtils;

public class VerticalPositions implements Positions {

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
			if (CellUtils.isValidFileAndRank(file, rank + 1)) {
				validPositionsList.add(CellUtils.getCellValue(rank + 1, file));
			}
			if (!isPawn) {
				if (CellUtils.isValidFileAndRank(file, rank - 1)) {
					validPositionsList.add(CellUtils.getCellValue(rank - 1, file));
				}
			}
		} else {
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
		}

		return validPositionsList;
	}

}
