package chessPuzzle.pieces;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class PawnTest {

	@Test
	void testGetAllValidCells() {
		Pawn pawn = new Pawn();
		String[] validPositions = pawn.getAllValidCells("D5");
		
		assertEquals(1, validPositions.length);
		
		assertEquals("D6", pawn.getAllValidCells("D5")[0]);
		assertEquals("F5", pawn.getAllValidCells("F4")[0]);
		assertEquals("A2", pawn.getAllValidCells("A1")[0]);

		assertEquals(0, pawn.getAllValidCells("A8").length);
	}

	@Test
	void testGetCellValue() {
		ChessPiece chessPiece = new Pawn();
		
		assertEquals("D2", chessPiece.getCellValue(2, 4));
		assertEquals("H1", chessPiece.getCellValue(1, 8));
		assertEquals("A5", chessPiece.getCellValue(5, 1));
		assertEquals("B7", chessPiece.getCellValue(7, 2));
		
		assertThrows(IllegalArgumentException.class, () -> chessPiece.getCellValue(0, 7));
		assertThrows(IllegalArgumentException.class, () -> chessPiece.getCellValue(4, 0));
		assertThrows(IllegalArgumentException.class, () -> chessPiece.getCellValue(10, 2));
		assertThrows(IllegalArgumentException.class, () -> chessPiece.getCellValue(2, 10));
	}

	@Test
	void testParseCellValue() {
		ChessPiece chessPiece = new Pawn();
		
		assertArrayEquals(new int[] {1, 1}, chessPiece.parseCellValue("A1"));
		assertArrayEquals(new int[] {8, 8}, chessPiece.parseCellValue("H8"));
		assertArrayEquals(new int[] {4, 3}, chessPiece.parseCellValue("D3"));
		assertArrayEquals(new int[] {7, 2}, chessPiece.parseCellValue("G2"));
		
		assertThrows(IllegalArgumentException.class, () -> chessPiece.parseCellValue("A11"));
		assertThrows(IllegalArgumentException.class, () -> chessPiece.parseCellValue("AA"));
		assertThrows(IllegalArgumentException.class, () -> chessPiece.parseCellValue("I2"));
		
	}

}
