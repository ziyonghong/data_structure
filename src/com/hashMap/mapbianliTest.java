package com.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
 
public class mapbianliTest {
	public static void main(String[] args){
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		for (int i=0; i<1000; i++){
			map.put(i, "��"+i+"��");
		}
		//ѭ����һ��
		long t1 = System.nanoTime();
		Object key[] = map.keySet().toArray();
		for (int i=0; i<map.size();i++){
			map.get(key[i]);
		}
		long t2 = System.nanoTime(); 
		//ѭ���ڶ���
		for(Entry<Integer, String> entry:map.entrySet()){
			entry.getValue();
		}
		long t3 = System.nanoTime();
		//ѭ��������
		Iterator<Integer> it = map.keySet().iterator();
		while(it.hasNext()){
			Integer ii = (Integer)it.next(); 
			map.get(ii);
		}
		long t4 = System.nanoTime();
		//ѭ��������
		for (Integer kk :map.keySet()){
			map.get(kk);
		}
		long t5 = System.nanoTime();
		System.out.println("��һ�ַ�����ʱ��" + (t2-t1)/1000 + "΢��");
		System.out.println("�ڶ��ַ�����ʱ��" + (t3-t2)/1000 + "΢��");
		System.out.println("�����ַ�����ʱ��" + (t4-t3)/1000 + "΢��");
		System.out.println("�����ַ�����ʱ��" + (t5-t4)/1000 + "΢��");
	}
}
