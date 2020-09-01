package chessPuzzle.pieces;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class BishopTest {

	@Test
	void testGetAllValidCells() {
		Bishop bishop = new Bishop();

		String[] actualPositions = bishop.getAllValidCells("A1");
		assertEquals(7, actualPositions.length);
		
		String[] expectedPositions = new String[]{"B2", "C3", "D4", "E5", "F6", "G7", "H8"};
		Arrays.sort(expectedPositions);
		Arrays.sort(actualPositions);
		
		assertArrayEquals(expectedPositions, actualPositions);

		actualPositions = bishop.getAllValidCells("B3");
		assertEquals(9, actualPositions.length);
		
		expectedPositions = new String[] {"A4", "C2", "D1", "A2", "C4", "D5", "E6", "F7", "G8"};
		Arrays.sort(expectedPositions);
		Arrays.sort(actualPositions);
		
		assertArrayEquals(expectedPositions, actualPositions);
	}

}
