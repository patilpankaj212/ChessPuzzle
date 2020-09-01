package chessPuzzle.pieces;

import java.util.List;

import chessPuzzle.pieces.position.Positions;

public abstract class ChessPiece {

	private Positions[] applicablePositions;

	public String[] getAllValidCells(String currentPosition) {
		if (getApplicablePositions() == null || getApplicablePositions().length == 0) {
			throw new RuntimeException("Applicable Positions not supplied");
		}

		List<String> validPositionsList = null;

		validPositionsList = validCells(currentPosition);

		return validPositionsList.toArray(new String[] {});
	}

	public Positions[] getApplicablePositions() {
		return applicablePositions;
	}

	public void setApplicablePositions(Positions[] applicablePositions) {
		this.applicablePositions = applicablePositions;
	}

	abstract List<String> validCells(String currentPosition);
}