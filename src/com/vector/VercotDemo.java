package com.vector;

import java.util.Vector;

public class VercotDemo {
	public static void main(String[] args) {
		Vector v=new Vector<>();
		v.add("A");
		System.out.println(v);
		StringBuilder sb=new StringBuilder("Bc");
		v.add(sb);
		System.out.println(v);
		sb.append("CD");
		System.out.println(v);
		v.add(1);
		System.out.println(v);
	}

}
