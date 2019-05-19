package com.link;

public class MyLinkListDemo {
	public static void main(String[] args) {
		MyLinkList list = new MyLinkList();
		
		System.out.println(list);
		
		list.addLast("B");
		list.addLast("C");
		System.out.println(list);

		list.addFirst("A");
		System.out.println(list);
		list.remove("B");
		System.out.println(list);
		
		System.out.println(list.search("A"));
		
	}

}
