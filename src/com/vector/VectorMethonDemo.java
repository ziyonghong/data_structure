package com.vector;

import java.util.Vector;

public class VectorMethonDemo {

	public static void main(String[] args) {
		//testadd();
		//testremove();
		testupda();
	}

	private static void testupda() {
		// TODO Auto-generated method stub
		Vector v1 = new Vector<>();
		v1.add("A");
		v1.add("B");
		//v1.set(3, "c");
		v1.set(0, "c");
		System.out.println(v1);
	}

	private static void testremove() {
		// TODO Auto-generated method stub
		Vector v1 = new Vector<>();
		v1.add("A");
		v1.add("B");
		
		v1.add("D");
		v1.add("B");
		System.out.println(v1);
		v1.remove(0);
		System.out.println(v1);
		v1.remove("B");
		System.out.println(v1);
		
	}

	private static void testadd() {

		Vector v1 = new Vector<>();
		v1.add("A");
		v1.add("B");
		System.out.println(v1);

		// v1.add(1,"Qil");
		// System.out.println(v1);
		Vector v2 = new Vector<>();
		v2.add(1);
		v2.add(2);

		// v1.add(v2);
		v1.addAll(v2);
		System.out.println(v1);
	}
}
