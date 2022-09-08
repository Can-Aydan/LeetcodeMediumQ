package diagonalTraverse498;

public class Solution {
	public int[] findDiagonalOrder(int[][] mat) {
		int m = mat.length, n = mat[0].length, i = 0, row = 0, column = 0;
		boolean movement = true;
		int[] result = new int[m * n];
		while (row < m && column < n) {
			if (movement == true) {
				while (row > 0 && column < n - 1) {
					result[i++] = mat[row--][column++];
				}
				result[i++] = mat[row][column];
				if (column == n - 1) {
					row++;
				} else {
					column++;
				}
			} else {
				while (column > 0 && row < m - 1) {
					result[i++] = mat[row++][column--];
				}
				result[i++] = mat[row][column];
				if (row == m - 1) {
					column++;
				} else {
					row++;
				}
			}
			movement = !movement;
		}
		return result;
	}
}
