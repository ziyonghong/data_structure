package com.hash;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		set1.add("A");
		set1.add("C");
		set1.add("B");
		
		System.out.println(set1);
		Set<String> set2 = new HashSet<>();
		set2.add("0");
		set2.add("1");
		set1.addAll(set2);
		System.out.println(set1);
		for(String ele:set1){
			System.out.println(ele);
		}
		
		Iterator<String> it = set1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
