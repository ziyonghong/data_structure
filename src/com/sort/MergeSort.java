package com.sort;

import java.io.IOException;
import java.util.Scanner;

public class MergeSort {

	public static void mergeSort(int a[], int left, int right) {
		if (left < right) {// 至少有两个元素
			int mid = (left + right) / 2;// 取中点
			mergeSort(a, left, mid); // 对左侧排序
			mergeSort(a, mid + 1, right); // 对右侧排序
			// 合并两段排序数组到数组b中
			// 再拷贝回数组a中
			Merge(a, left, mid, right);

		}
	}

	private static void Merge(int[] a, int left, int mid, int right) {
		int b[] = new int[right - left + 1];
		int i, j, k = 0;// k为数组b的下标
		i = left;
		j = mid + 1;
		while (i <= mid && j <= right) {
			if (a[i] > a[j])
				b[k++] = a[j++];
			else
				b[k++] = a[i++];

		}
		if (i > mid)
			for (int q = j; q <= right; q++)
				b[k++] = a[q];
		else
			for (int q = i; q <= mid; q++)
				b[k++] = a[q];
		int pos = left;
		for (i = 0; i <= b.length - 1; i++) {
			a[pos++] = b[i];
		}

	}

	public static void main(String[] args) throws IOException {
		System.out.println(" +--- 合并排序，递归算法  ---+ \n 数组长度: ");
		Scanner reader = new Scanner(System.in);
		int len = reader.nextInt();
		int a[] = new int[len];// 初始化a数组
		System.out.println("初始数组如下：");
		for (int i = 0; i < a.length; i++) {
			 a[i] = reader.nextInt();
			//a[i] = (int) (Math.random() * 1000); // 产生len个随机数 (<1000)

			System.out.println(a[i]);
		}
		mergeSort(a, 0, a.length - 1);
		System.out.println("排序后的数组如下：");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
