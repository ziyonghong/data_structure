package com.zyh.array0421;
//数组动态操作
public class ArrayDemol1 {
	public static void main(String [] args){
		//每new一次就在堆中开辟一块内存空间
		int [] nums=new int[100];
		
		System.out.println(nums.length);
		System.out.println(nums);
		nums=new int [120];
		System.out.println(nums.length);
		System.out.println(nums);
		//此时nums没有引用任何一块内存空间,会出现空指针异常
		nums=null;
	//System.out.println(nums.length); //空指针异常错误
	}
	
}
