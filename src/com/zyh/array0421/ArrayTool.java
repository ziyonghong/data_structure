package com.zyh.array0421;

public class ArrayTool {

	// ��ӡ����Ԫ��
	static void printArray(int[] arr) {
		if (arr == null) {
			System.out.println("null");
			return;// ��������
		}
		String ret = "{";
		for (int i = 0; i < arr.length; i++) {
			ret = ret + arr[i];
			if (i != arr.length - 1) {
				ret = ret + ",";
			}

		}
		ret = ret + "}";
		System.out.println(ret);
	}

	// ������������Ԫ��
	public static void revArray(int[] arr) {
		// ѭ��������Ԫ�ظ�����һ��
		for (int i = 0; i < arr.length / 2; i++) {
			
			int t = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = t;
		}
	}

	// ��ȡ���ֵ
	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	// ��ȡ��Сֵ
	public static int getMin(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	// ���ֲ��ҷ���
	static int Search(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			System.out.println(low + "----" + high);
			int mid = (low + high) >> 1;//>>������������൱�ڳ�2
			int midVal = arr[mid];
			if (midVal > key) {
				high = mid - 1;
			} else if (midVal < key) {
				low = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	// ����
	static void Sort(int[] arr) {
		for (int times = 1; times < arr.length; times++) {
			for (int i = times; i < arr.length; i++) {
				if (arr[times-1] < arr[i])
				swap(arr,times-1,i);
			}
		}
	}

  //����
	private static void swap(int []arr,int i, int j) {
		int t=arr[i];
		arr[i] =arr[j];
		arr[j] = t;

	}
}
