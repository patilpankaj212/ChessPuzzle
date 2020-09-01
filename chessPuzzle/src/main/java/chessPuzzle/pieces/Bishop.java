package chessPuzzle.pieces;

import java.util.ArrayList;
import java.util.List;

import chessPuzzle.pieces.position.DiagonalPositions;
import chessPuzzle.pieces.position.Positions;

public class Bishop extends ChessPiece {

	@Override
	List<String> validCells(String currentPosition) {
		List<String> validPositionsList = new ArrayList<String>();

		for (Positions position : getApplicablePositions()) {
			if (!(position instanceof DiagonalPositions)) {
				throw new RuntimeException("Bishop can only have diagonal positions");
			}
			validPositionsList.addAll(position.getPositions(-1, currentPosition, false));
		}

		return validPositionsList;
	}

}
