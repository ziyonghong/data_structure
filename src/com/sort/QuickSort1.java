package com.sort;

public class QuickSort1 {
	public void quickSort(int a[], int start, int end) {
		// 分治，选第一个作为轴
		int i = start, j = end, key = a[start];
		while (i < j) {
			while (i < j && a[j] >= key)
				j--;
			while (i < j && a[i] <= key)
				i++;
			while (i < j) {
				// 交换
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
			}

		}
		// 调整key的位置
		a[start] = a[i];
		a[i] = key;

		// 递归
		quickSort(a, start, i);
		quickSort(a, i + 1, end);
	}
}
