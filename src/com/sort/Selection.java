package com.sort;
/*
 * ѡ������
ѡ��������е���СԪ�أ�����������ĵ�һ��Ԫ�ؽ���λ�á�
�ٴ�ʣ�µ�Ԫ����ѡ�����С��Ԫ�أ�����������ĵڶ���Ԫ�ؽ���λ�á�
���Ͻ��������Ĳ�����ֱ����������������
 */
public class Selection<T extends Comparable<T>> extends Sort<T>  {

	@Override
	public void sort(T[] nums) {
		int n=nums.length;
		for (int i = 0; i < n-1; i++) {
			int min=i;
			for (int j = i+1; j < n; j++) {
				if(less(nums[j],nums[min])){
					min=j;
				}
			}
			swap(nums, i, min);
		}
	}

}
