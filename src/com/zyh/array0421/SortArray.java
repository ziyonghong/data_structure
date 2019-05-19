package com.zyh.array0421;

import java.util.Random;

public class SortArray {
	public static void main(String[] args) {
		// ���������ʽ������ [] ���������=new ����[����]
		int[] srcA = createArray(5);
		System.out.println("ð������ǰ��");
		printArray(srcA);
		System.out.println("ð�������");
		int[] tem = maoPao(srcA);
		printArray(tem);

		int[] srcA1 = createArray(5);
		System.out.println("ѡ������ǰ��");
		printArray(srcA1);
		System.out.println("ѡ�������");
		int[] tem1 = xuanZe(srcA1);
		printArray(tem1);
	}

	// ð������
	private static int[] maoPao(int[] a) {
//		 for(int i=0;i<a.length;i++){
//		 for(int j=i+1;j<a.length;j++){
//		 if(a[i]>a[j]){ //����
//		 int t=a[i];
//		 a[i]=a[j];
//		 a[j]=t;
//		 }
//		 }
//		 }
//		 return a;
//		 }
		// ���ѭ��,������һ���߼���
		for (int i = 0; i < a.length - 1; i++) {
			// �ڲ�ѭ��,��ʼ����Ƚ�
			// �������ǰһ�����Ⱥ�һ������,�򽻻�
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					// ����
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		return a;
	}

	// ѡ������
	private static int[] xuanZe(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int lowerIndex = i;
			// �ҳ���С��һ������
			for (int j = i + 1; j < a.length; j++) {
				if (a[lowerIndex] > a[j]) { // ����
					lowerIndex = j;
					int t = a[i];
					a[i] = a[lowerIndex];
					a[lowerIndex] = t;
				}
			}
		}
		return a;
	}

	// ��ӡ����
	private static void printArray(int[] srcA) {
		if (null == srcA) {
			return;
		}
		for (int i = 0; i < srcA.length; i++) {
			System.out.print(" " + srcA[i]);
		}
		System.out.println("");
	}

	// ����һ��ָ���������������
	private static int[] createArray(int len) {
		int[] base = new int[len];
		for (int i = 0; i < base.length; i++) {
			// �����������
			Random ran = new Random();
			int value = ran.nextInt(10);// ����0-10�������
			base[i] = value;
		}
		return base;
	}
}
