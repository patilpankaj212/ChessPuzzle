package chessPuzzle.pieces;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class RookTest {

	@Test
	void testGetAllValidCells() {
		Rook rook = new Rook();

		String[] actualPositions = rook.getAllValidCells("A1");
		assertEquals(14, actualPositions.length);
		
		String[] expectedPositions = new String[] {"A2", "A3", "A4", "A5", "A6", "A7", "A8", "B1", "C1", "D1", "E1", "F1", "G1", "H1"};
		Arrays.sort(expectedPositions);
		Arrays.sort(actualPositions);
		assertArrayEquals(expectedPositions, actualPositions);
		
		actualPositions = rook.getAllValidCells("B3");
		assertEquals(14, actualPositions.length);
		
		expectedPositions = new String[] {"B1", "B2", "B4", "B5", "B6", "B7", "B8", "A3", "C3", "D3", "E3", "F3", "G3", "H3"};
		Arrays.sort(expectedPositions);
		Arrays.sort(actualPositions);
		assertArrayEquals(expectedPositions, actualPositions);
	}

}
