package com.zyh.array0421;
//���鶯̬����
public class ArrayDemol1 {
	public static void main(String [] args){
		//ÿnewһ�ξ��ڶ��п���һ���ڴ�ռ�
		int [] nums=new int[100];
		
		System.out.println(nums.length);
		System.out.println(nums);
		nums=new int [120];
		System.out.println(nums.length);
		System.out.println(nums);
		//��ʱnumsû�������κ�һ���ڴ�ռ�,����ֿ�ָ���쳣
		nums=null;
	//System.out.println(nums.length); //��ָ���쳣����
	}
	
}
