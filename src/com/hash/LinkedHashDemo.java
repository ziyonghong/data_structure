package com.hash;

import java.util.LinkedHashSet;
import java.util.Set;

//使用哈希表和链表算法，保证了HashSet中元素的先后添加顺序
public class LinkedHashDemo {
  public static void main(String[] args) {
	  Set<String> set=new LinkedHashSet<>();
//	   set.add("x");
//	   set.add("A");
//	   set.add("c");
//	   set.add("C");
//	   set.add("1");
//	   set.add("10");
	  set.add("A");
		set.add("3");
		set.add("R");
		set.add("X");
		set.add("4");
		set.add("c");
	   System.out.println(set);
}
   
}
