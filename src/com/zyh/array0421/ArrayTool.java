package com.zyh.array0421;

public class ArrayTool {

	// 打印数组元素
	static void printArray(int[] arr) {
		if (arr == null) {
			System.out.println("null");
			return;// 结束方法
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

	// 逆序排列数组元素
	public static void revArray(int[] arr) {
		// 循环次数是元素个数的一半
		for (int i = 0; i < arr.length / 2; i++) {
			
			int t = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = t;
		}
	}

	// 获取最大值
	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	// 获取最小值
	public static int getMin(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	// 二分查找方法
	static int Search(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			System.out.println(low + "----" + high);
			int mid = (low + high) >> 1;//>>右移运算符，相当于除2
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

	// 排序
	static void Sort(int[] arr) {
		for (int times = 1; times < arr.length; times++) {
			for (int i = times; i < arr.length; i++) {
				if (arr[times-1] < arr[i])
				swap(arr,times-1,i);
			}
		}
	}

  //交换
	private static void swap(int []arr,int i, int j) {
		int t=arr[i];
		arr[i] =arr[j];
		arr[j] = t;

	}
}
