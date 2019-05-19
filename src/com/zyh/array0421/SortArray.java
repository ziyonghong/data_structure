package com.zyh.array0421;

import java.util.Random;

public class SortArray {
	public static void main(String[] args) {
		// 定义数组格式：类型 [] 数组变量名=new 类型[长度]
		int[] srcA = createArray(5);
		System.out.println("冒泡排序前：");
		printArray(srcA);
		System.out.println("冒泡排序后：");
		int[] tem = maoPao(srcA);
		printArray(tem);

		int[] srcA1 = createArray(5);
		System.out.println("选择排序前：");
		printArray(srcA1);
		System.out.println("选择排序后：");
		int[] tem1 = xuanZe(srcA1);
		printArray(tem1);
	}

	// 冒泡排序
	private static int[] maoPao(int[] a) {
//		 for(int i=0;i<a.length;i++){
//		 for(int j=i+1;j<a.length;j++){
//		 if(a[i]>a[j]){ //交换
//		 int t=a[i];
//		 a[i]=a[j];
//		 a[j]=t;
//		 }
//		 }
//		 }
//		 return a;
//		 }
		// 外层循环,它决定一共走几趟
		for (int i = 0; i < a.length - 1; i++) {
			// 内层循环,开始逐个比较
			// 如果发现前一个数比后一个数大,则交换
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					// 交换
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		return a;
	}

	// 选择排序
	private static int[] xuanZe(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int lowerIndex = i;
			// 找出最小的一个索引
			for (int j = i + 1; j < a.length; j++) {
				if (a[lowerIndex] > a[j]) { // 交换
					lowerIndex = j;
					int t = a[i];
					a[i] = a[lowerIndex];
					a[lowerIndex] = t;
				}
			}
		}
		return a;
	}

	// 打印数组
	private static void printArray(int[] srcA) {
		if (null == srcA) {
			return;
		}
		for (int i = 0; i < srcA.length; i++) {
			System.out.print(" " + srcA[i]);
		}
		System.out.println("");
	}

	// 生成一个指定长度乱序的数组
	private static int[] createArray(int len) {
		int[] base = new int[len];
		for (int i = 0; i < base.length; i++) {
			// 创建随机对象
			Random ran = new Random();
			int value = ran.nextInt(10);// 生成0-10的随机数
			base[i] = value;
		}
		return base;
	}
}
