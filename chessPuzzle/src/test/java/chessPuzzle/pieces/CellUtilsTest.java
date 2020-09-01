package chessPuzzle.pieces;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import chessPuzzle.utils.CellUtils;

class CellUtilsTest {

	@Test
	void testGetCellValue() {
		
		assertEquals("D2", CellUtils.getCellValue(2, 4));
		assertEquals("H1", CellUtils.getCellValue(1, 8));
		assertEquals("A5", CellUtils.getCellValue(5, 1));
		assertEquals("B7", CellUtils.getCellValue(7, 2));
		
		assertThrows(IllegalArgumentException.class, () -> CellUtils.getCellValue(0, 7));
		assertThrows(IllegalArgumentException.class, () -> CellUtils.getCellValue(4, 0));
		assertThrows(IllegalArgumentException.class, () -> CellUtils.getCellValue(10, 2));
		assertThrows(IllegalArgumentException.class, () -> CellUtils.getCellValue(2, 10));
	}

	@Test
	void testParseCellValue() {
		
		assertArrayEquals(new int[] {1, 1}, CellUtils.parseCellValue("A1"));
		assertArrayEquals(new int[] {8, 8}, CellUtils.parseCellValue("H8"));
		assertArrayEquals(new int[] {4, 3}, CellUtils.parseCellValue("D3"));
		assertArrayEquals(new int[] {7, 2}, CellUtils.parseCellValue("G2"));
		
		assertThrows(IllegalArgumentException.class, () -> CellUtils.parseCellValue("A11"));
		assertThrows(IllegalArgumentException.class, () -> CellUtils.parseCellValue("AA"));
		assertThrows(IllegalArgumentException.class, () -> CellUtils.parseCellValue("I2"));
		
	}

}
