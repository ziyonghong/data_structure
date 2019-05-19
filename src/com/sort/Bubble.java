package com.sort;

/*
 * ð������
�����Ҳ��Ͻ������������Ԫ�أ���һ�ֵ�ѭ��֮�󣬿�����δ��������Ԫ���ϸ����Ҳࡣ

��һ��ѭ���У����û�з�����������˵�������Ѿ�������ģ���ʱ����ֱ���˳���
 */
public class Bubble<T extends Comparable<T>> extends Sort<T> {

	@Override
	public void sort(T[] nums) {
		int n = nums.length;
		boolean hasSorted = false;
		for (int i = n - 1; i > 0 && !hasSorted; i--) {
			hasSorted = true;
			for (int j = 0; j < i; j++) {
				if (less(nums[j + 1], nums[j])) {
					hasSorted = false;
					swap(nums, j, j + 1);
				}
			}
		}
	}
}
