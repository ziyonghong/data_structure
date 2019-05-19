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

		// �ݹ����
		if (low > high) {
			return;
		}
		// ������key��

		int i = low;
		int j = high;
		int key = a[low];
		// ���һ�˿���
		while (i < j) {
			// 1.���������ҵ���һ��С��key����
			while (i < j && a[j] >= key) {
				j--;
			}
			// 2. ���������ҵ���һ������key����
			// (�տ�ʼ���˵��ڣ�����run�˺þö�ûrun������������������ѭ��)
			while (i < j && a[i] <= key) {
				i++;
			}
			// 3. ����
			if (i < j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		// 4.����key��λ�� (��key�ŵ�i��λ��)
		a[low] = a[i];
		a[i] = key;
		//System.out.println("key=" + key);
		// �ݹ����
		// 5. ��key��ߵ�������

		quickSort(a, low, i - 1);
		// 6. ��key�ұߵ�������
		quickSort(a, i + 1, high);

	}
}
