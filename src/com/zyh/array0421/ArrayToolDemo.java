package com.zyh.array0421;

public class ArrayToolDemo {
	public static void main(String[]args){
		int []arr={1,3,2,0,6,9};
		ArrayTool.printArray(arr);
	//ËÑË÷ÔªËØ6
		ArrayTool.Sort(arr);
	//	ArrayTool.Search(arr,0);
		ArrayTool.printArray(arr);
		int i=ArrayTool.Search(arr,3);
		System.out.println(i);
	}
}
