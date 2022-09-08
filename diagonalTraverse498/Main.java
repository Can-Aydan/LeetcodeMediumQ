package diagonalTraverse498;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(Arrays.toString(sol.findDiagonalOrder(mat)));
	}

}
