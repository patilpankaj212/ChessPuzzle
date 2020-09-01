package chessPuzzle.pieces;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import chessPuzzle.pieces.position.Positions;
import chessPuzzle.pieces.position.VerticalPositions;

class PawnTest {

	@Test
	void testGetAllValidCells() {
		Pawn pawn = new Pawn();
		Positions[] positions = new Positions[] { new VerticalPositions() };
		pawn.setApplicablePositions(positions);

		String[] validPositions = pawn.getAllValidCells("D5");

		assertEquals(1, validPositions.length);

		assertEquals("D6", pawn.getAllValidCells("D5")[0]);
		assertEquals("F5", pawn.getAllValidCells("F4")[0]);
		assertEquals("A2", pawn.getAllValidCells("A1")[0]);

		assertEquals(0, pawn.getAllValidCells("A8").length);

		pawn.setApplicablePositions(null);
		assertThrows(RuntimeException.class, () -> pawn.getAllValidCells("A1"));

		pawn.setApplicablePositions(new Positions[] {});
		assertThrows(RuntimeException.class, () -> pawn.getAllValidCells("A1"));

	}

}
