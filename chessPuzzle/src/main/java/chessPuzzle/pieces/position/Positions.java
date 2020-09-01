package chessPuzzle.pieces.position;

import java.util.List;

public interface Positions {

	/*
	 * valid values for steps can be -1 or 1
	 * isPawn is to handle special case of Pawn
	 */
	List<String> getPositions(int steps, String currentPosition, boolean isPawn);
}
