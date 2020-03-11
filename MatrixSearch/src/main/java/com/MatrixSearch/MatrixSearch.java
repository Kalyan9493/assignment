package com.MatrixSearch;

public class MatrixSearch {
	
// time complexity is O(n*n)
	private boolean matrixSearch(int[][] arr,int key) {
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
	private boolean efficientsearch(int[][] mat,int key) {
		int i=0,j=mat.length-1;
		
		if(key < mat[0][0] && key > mat[j][j]) {
			return false;
		}else {

		while(i<mat.length && j>=0) {

			if (mat[i][j] == key) {
				return true;
			}
			if (mat[i][j] < key) {
				i++;
			} else {
				j--;
			}
		}
		return false;
		}
	}

	
// time complexity is O(n*n)
	
	public boolean usingForEach(int [][] arr,int key) {
		
		for (int[] rows : arr) {
			for (int column : rows) {
				if(column==key) {
					return true;	
				}
			}
			
		}
		return false;
		
		
	}
	
	
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		int key = 4;
		MatrixSearch ms = new MatrixSearch();
		
		System.out.println(ms.matrixSearch(arr, key));
		
		System.out.println(ms.efficientsearch(arr,key));// efficient searching method
		
		System.out.println(ms.usingForEach(arr,key));

	}

}
