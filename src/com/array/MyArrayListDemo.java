package com.array;

public class MyArrayListDemo {
	public static void main(String[] args) {
		//���������б����
		MyArrayList list=new MyArrayList();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add(1);
		list.add(true);
		
		list.delete(0);
		System.out.println(list);
	}

}
