package com.MatrixSearch;

public class MatrixRecursion {

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 10 }, { 4, 5, 6, 12 }, { 7, 8, 9, 15 } };
		int key = 13;
		MatrixRecursion mr=new MatrixRecursion();
		System.out.println(mr.matrixSearch(arr, key));

	}

	public boolean matrixSearch(int[][] arr, int key) {

		int row = 0, column = arr[0].length - 1;
		int rowLength = arr.length;
		if (key < arr[0][0] && key > arr[rowLength - 1][column]) {
			return false;
		} else {
			return recursion(arr, row, column, key);

		}
	}

	private static boolean recursion(int[][] arr, int row, int column, int key) {
		if (row < arr.length && column >= 0) {

			if (key == arr[row][column]) {
				return true;
			}
			if (key < arr[row][column]) {
				--column;
				return recursion(arr, row, column, key);

			} else {
				++row;
				return recursion(arr, row, column, key);
			}
		}
		return false;
	}
}
