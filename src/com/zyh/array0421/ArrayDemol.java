package com.zyh.array0421;

public class ArrayDemol {
	public static void main(String[] args) {
		
		int[] ages = new int[] { 1, 2, 3, 4, 5 };

		System.out.println(ages.length);
		System.out.println(ages[0]);// ��ȡԪ��
		System.out.println(ages[4]);
		System.out.println(ages[0] = 0);
		// ����
		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
		boolean[] bl = new boolean[3];
		//bl[1]=true;
		for (int i = 0; i < bl.length; i++) {
			System.out.println(bl[i]); //Ĭ��false
		}
		String[] str = new String[3];
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);//Ĭ��null
		}

	}

}