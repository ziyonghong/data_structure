package com.zyh.array0421;

import java.util.Arrays;

//演示数组类
public class ArraysDemo {
	public static void main(String[]args){
		int []arr={1,3,2,0,6,9};
		//将数组转化为String类型
		String ret=Arrays.toString(arr);
		System.out.println(ret);
		//升序排序
		Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	//二分查找
	int i=Arrays.binarySearch(arr, 6);
	System.out.println(i);
	}
}
