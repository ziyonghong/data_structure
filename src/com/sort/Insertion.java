package com.sort;

public class Insertion<T extends Comparable<T>> extends Sort<T> {

	@Override
	public void sort(T[] nums) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j > 0 && less(nums[j], nums[j - 1]); j--) {
				swap(nums, j, j - 1);
			}
		}
	}

}
