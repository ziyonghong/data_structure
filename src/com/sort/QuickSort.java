package com.sort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] a = { 6, 1, 16, 5, 4, 12, 9, 7, 10, 8 };
		System.out.println(Arrays.toString(a));
		quickSort(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));
	}

	public static void quickSort(int[] a, int low, int high) {

		// 递归出口
		if (low > high) {
			return;
		}
		// 把枢轴key和

		int i = low;
		int j = high;
		int key = a[low];
		// 完成一趟快排
		while (i < j) {
			// 1.从右往左找到第一个小于key的数
			while (i < j && a[j] >= key) {
				j--;
			}
			// 2. 从左往右找到第一个大于key的数
			// (刚开始少了等于，发现run了好久都没run出来，可能陷入了死循环)
			while (i < j && a[i] <= key) {
				i++;
			}
			// 3. 交换
			if (i < j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		// 4.调整key的位置 (将key放到i的位置)
		a[low] = a[i];
		a[i] = key;
		//System.out.println("key=" + key);
		// 递归过程
		// 5. 对key左边的数快排

		quickSort(a, low, i - 1);
		// 6. 对key右边的数快排
		quickSort(a, i + 1, high);

	}
}
