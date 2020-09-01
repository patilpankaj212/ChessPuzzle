package chessPuzzle.pieces;

import java.util.ArrayList;
import java.util.List;

import chessPuzzle.pieces.position.Positions;

public class Queen extends ChessPiece {

	@Override
	List<String> validCells(String currentPosition) {
		List<String> validPositionsList = new ArrayList<String>();

		for (Positions position : getApplicablePositions()) {
			validPositionsList.addAll(position.getPositions(-1, currentPosition, false));
		}

		return validPositionsList;
	}

}
