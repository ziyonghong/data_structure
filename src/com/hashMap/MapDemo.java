package com.hashMap;

import java.util.HashMap;
import java.util.Map;

//����һ���ַ����У�ÿһ���ַ����ֵĴ���
public class MapDemo {
	public static void main(String[] args) {
		String str = "adhfshdfjskdj";

		// ���ַ���ת��Ϊchar����
		char[] arr = str.toCharArray();
		// key���洢�ַ�����value���洢���ִ���
		Map<Character, Integer> map = new HashMap<>();
		// ѭ���õ�ÿһ���ַ�
		for (char ch : arr) {
			//System.out.println(ch);
			// �жϵ�ǰ�ַ��Ƿ���Map�е�key����
			if (map.containsKey(ch)) {
				// ��ǰMap��key�������ַ�����ʱȡ����valueֵ��1���ٷŽ���
				Integer old = map.get(ch);
				map.put(ch, old + 1);
			} else {
				// ��ǰMap��key���������ַ����Ѹ��ַ��洢��Map�У�����valueֵΪ1
				map.put(ch, 1);
			}
		}
		System.out.println(map);
	}
}
