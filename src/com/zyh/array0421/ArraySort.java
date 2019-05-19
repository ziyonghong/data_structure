package com.zyh.array0421;

public class ArraySort {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 7, 3, 2, 8, 0 };
		Sort(arr);
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

	}

	public static void Sort(int[] arr) {
		for (int j = 0; j < arr.length; j++) {
			// int k=j;
			for (int i = 0; i < arr.length; i++) {
				if (arr[j] < arr[i]) {
					swap(arr, j, i);
				}
			}
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;

	}
}
