package com.sort;

import java.io.IOException;
import java.util.Scanner;

public class MergeSort {

	public static void mergeSort(int a[], int left, int right) {
		if (left < right) {// ����������Ԫ��
			int mid = (left + right) / 2;// ȡ�е�
			mergeSort(a, left, mid); // ���������
			mergeSort(a, mid + 1, right); // ���Ҳ�����
			// �ϲ������������鵽����b��
			// �ٿ���������a��
			Merge(a, left, mid, right);

		}
	}

	private static void Merge(int[] a, int left, int mid, int right) {
		int b[] = new int[right - left + 1];
		int i, j, k = 0;// kΪ����b���±�
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
		System.out.println(" +--- �ϲ����򣬵ݹ��㷨  ---+ \n ���鳤��: ");
		Scanner reader = new Scanner(System.in);
		int len = reader.nextInt();
		int a[] = new int[len];// ��ʼ��a����
		System.out.println("��ʼ�������£�");
		for (int i = 0; i < a.length; i++) {
			 a[i] = reader.nextInt();
			//a[i] = (int) (Math.random() * 1000); // ����len������� (<1000)

			System.out.println(a[i]);
		}
		mergeSort(a, 0, a.length - 1);
		System.out.println("�������������£�");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
