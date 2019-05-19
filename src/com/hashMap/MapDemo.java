package com.hashMap;

import java.util.HashMap;
import java.util.Map;

//计算一个字符串中，每一个字符出现的次数
public class MapDemo {
	public static void main(String[] args) {
		String str = "adhfshdfjskdj";

		// 把字符串转换为char数组
		char[] arr = str.toCharArray();
		// key：存储字符名，value：存储出现次数
		Map<Character, Integer> map = new HashMap<>();
		// 循环得到每一个字符
		for (char ch : arr) {
			//System.out.println(ch);
			// 判断当前字符是否在Map中的key存在
			if (map.containsKey(ch)) {
				// 当前Map的key包含该字符，此时取出该value值增1，再放进入
				Integer old = map.get(ch);
				map.put(ch, old + 1);
			} else {
				// 当前Map的key不包含该字符，把该字符存储到Map中，设置value值为1
				map.put(ch, 1);
			}
		}
		System.out.println(map);
	}
}
