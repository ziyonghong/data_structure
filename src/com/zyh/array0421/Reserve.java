package com.zyh.array0421;

public class Reserve {
	public static void main(String[]args){
		String[] arr={"A","B","C","D"};
		String[] newArray=reserve(arr);
		for(int i=0;i<newArray.length;i++)
		System.out.println(newArray[i]);
	}
	static String[] reserve (String[]oldArray){
		//����һ���µ��������
		String[] newArray=new String[oldArray.length];
		for(int i=oldArray.length-1;i>=0;i--){
			newArray[oldArray.length-1-i]=oldArray[i];
		}
		return newArray;
	}
//	����
//	int [] arr={1,2,3,};
//	static int index(int[]arr,int key){
//		for(int i=0;i<arr.length;i++){
//			if(arr[i]==key){
//				return i;
//			}
//		}
//		return -1;
//	}
}
