package com.zyh.array0421;

import java.util.Arrays;

//��ʾ������
public class ArraysDemo {
	public static void main(String[]args){
		int []arr={1,3,2,0,6,9};
		//������ת��ΪString����
		String ret=Arrays.toString(arr);
		System.out.println(ret);
		//��������
		Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	//���ֲ���
	int i=Arrays.binarySearch(arr, 6);
	System.out.println(i);
	}
}
