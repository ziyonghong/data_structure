package com.zyh.array0421;

public class Max {
	public static void main(String[] args){
		int [] nums=new int[]{14,3,9,6,24};
		int max=getMax(nums);
		System.out.println(max);
	}
	//��ȡ���ֵ�ķ�����aΪ�βΣ�
    static int getMax(int[] a){
    	int max=a[0];
    	for(int i=0;i<a.length;i++){
    		if(a[i]>max){
    			max=a[i];
    		}
    	}
    	return max;
    }
}
