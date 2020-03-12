package com.MatrixSearch;

public class MatrixSearch {

// time complexity is O(n*n)
	private boolean matrixSearch(int[][] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				if (key == arr[i][j]) {

					return true;
				}
			}
		}
		return false;

	}

// time complexity is O(n)
	public boolean efficientsearch(int[][] mat, int key) {
		int i = 0;

		int rowlength = mat.length;
		int columnlength = mat[0].length;

		if (key < mat[0][0] || key > mat[rowlength - 1][columnlength - 1]) {
			return false;
		} else {

			while (i < rowlength && columnlength - 1 >= 0) {

				if (mat[i][columnlength - 1] == key) {
					return true;
				}
				if (mat[i][columnlength - 1] < key) {
					i++;
				} else {
					columnlength--;
				}
			}
			return false;
		}
	}

// time complexity is O(n*n)

	public boolean usingForEach(int[][] arr, int key) {

		for (int[] rows : arr) {
			for (int column : rows) {
				if (column == key) {
					return true;
				}
			}

		}
		return false;

	}

	/*
	 * public static void main(String[] args) { int[][] arr = { { 1, 2, 3,4},
	 * {11,12,13,14}, {21,22,23,24} }; int[][] arr1 ={ { 1, 2, 3, 4 }, { 11, 12,
	 * 13,14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34}};
	 * 
	 * int key = 31;
	 * 
	 * MatrixSearch ms = new MatrixSearch();
	 * 
	 * // System.out.println(ms.matrixSearch(arr, key));
	 * 
	 * System.out.println(ms.efficientsearch(arr1,key));// efficient searching
	 * method
	 * 
	 * // System.out.println(ms.usingForEach(arr,key));
	 * 
	 * }
	 */
}
