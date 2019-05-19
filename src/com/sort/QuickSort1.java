package com.sort;

public class QuickSort1 {
	public void quickSort(int a[], int start, int end) {
		// ���Σ�ѡ��һ����Ϊ��
		int i = start, j = end, key = a[start];
		while (i < j) {
			while (i < j && a[j] >= key)
				j--;
			while (i < j && a[i] <= key)
				i++;
			while (i < j) {
				// ����
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
			}

		}
		// ����key��λ��
		a[start] = a[i];
		a[i] = key;

		// �ݹ�
		quickSort(a, start, i);
		quickSort(a, i + 1, end);
	}
}
