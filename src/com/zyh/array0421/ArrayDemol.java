package com.zyh.array0421;

public class ArrayDemol {
	public static void main(String[] args) {
		
		int[] ages = new int[] { 1, 2, 3, 4, 5 };

		System.out.println(ages.length);
		System.out.println(ages[0]);// 获取元素
		System.out.println(ages[4]);
		System.out.println(ages[0] = 0);
		// 遍历
		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
		boolean[] bl = new boolean[3];
		//bl[1]=true;
		for (int i = 0; i < bl.length; i++) {
			System.out.println(bl[i]); //默认false
		}
		String[] str = new String[3];
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);//默认null
		}

	}

}