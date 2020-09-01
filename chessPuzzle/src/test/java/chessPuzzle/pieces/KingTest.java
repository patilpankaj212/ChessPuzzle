package chessPuzzle.pieces;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import chessPuzzle.pieces.position.DiagonalPositions;
import chessPuzzle.pieces.position.HorizontalPositions;
import chessPuzzle.pieces.position.Positions;
import chessPuzzle.pieces.position.VerticalPositions;

class KingTest {

	@Test
	void testGetAllValidCells() {
		King king = new King();
		Positions[] positions = new Positions[] {new VerticalPositions(), new HorizontalPositions(), new DiagonalPositions()};
		king.setApplicablePositions(positions);
		
		String[] validPositions = king.getAllValidCells("D5");
		assertEquals(8, validPositions.length);

		String[] expected = new String[] { "C5", "E5", "C6", "D6", "E6", "C4", "D4", "E4" };
		Arrays.sort(expected);

		String[] actual = king.getAllValidCells("D5");
		Arrays.sort(actual);

		assertArrayEquals(expected, actual);

		expected = new String[] { "B1", "A2", "B2" };
		Arrays.sort(expected);

		actual = king.getAllValidCells("A1");
		Arrays.sort(actual);

		assertArrayEquals(expected, actual);
		
		king.setApplicablePositions(null);
		assertThrows(RuntimeException.class, () -> king.getAllValidCells("A1"));
		
		king.setApplicablePositions(new Positions[] {});
		assertThrows(RuntimeException.class, () -> king.getAllValidCells("A1"));
		
	}

}
