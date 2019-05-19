package com.hashMap;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * ��ȡ�Լ���HashMap�ӿ�
 *
 */
public interface MyMap<K, V> {
 
	V put(K k, V v);
	
	V get(K k);
	
	// hashMap�ڲ���Entry����
	interface Entry<K, V>{
		
		public K getKey();
		
		public V getValue();
	}

	public static void main(String[] args) {
	double pow=Math.pow(8,7);
	time(pow);
	}
	public static void time(double pow){
	double i=0;
	Hashtable table=new Hashtable<Double,Double>();
	HashMap hmap=new HashMap<Double,Double>();
	TreeSet set=new TreeSet<Double>();
	TreeMap tmap=new TreeMap<Double,Double>();
	SimpleDateFormat sd = new SimpleDateFormat("ss:SSS");
	String s1=sd.format(new Date());
	System.out.println("���ڴ���������"+s1);
	for(i=0;i<pow;i++){
	table.put(i,i);
	tmap.put(i,i);
	hmap.put(i,i);
	set.add(i);
	}
	String s2=sd.format(new Date());
	System.out.println("������ɡ�����"+s2);
	int vvv1=(int)Math.abs(Double.parseDouble(s2.substring(0,2))-Double.parseDouble(s1.substring(0,2)));//��
	int vvv2=(int)(Math.abs(Double.parseDouble(s2.substring(3))-Double.parseDouble(s1.substring(3))));//����
	System.out.println("��ʱ"+vvv1+":"+vvv2+"\n");
	//////////////////////////Hashmap
	s1=sd.format(new Date());
	System.out.println("����ȡhashmap��������"+s1);
	for(i=0;i<pow;i++){
	hmap.get(i);
	}
	s2=sd.format(new Date());
	System.out.println("ȡ����ɡ�����"+s2+" ���Ҵ�����"+i);
	vvv1=(int)(Double.parseDouble(s2.substring(0,2))-Double.parseDouble(s1.substring(0,2)));//��
	vvv2=(int)(Math.abs(Double.parseDouble(s2.substring(3))-Double.parseDouble(s1.substring(3))));//����
	System.out.println("��ʱ"+vvv1+":"+vvv2+"\n");
	//////////////////////////Treeset
	s1=sd.format(new Date());
	System.out.println("����ȡtreeset��������"+s1);
	Iterator ss = set.iterator();
	int i1=0;
	while(ss.hasNext()){
	i1++;
	ss.next();
	}
	s2=sd.format(new Date());
	System.out.println("ȡ����ɡ�����"+s2+" ���Ҵ�����"+i1);
	vvv1=(int)(Double.parseDouble(s2.substring(0,2))-Double.parseDouble(s1.substring(0,2)));//��
	vvv2=(int)(Math.abs(Double.parseDouble(s2.substring(3))-Double.parseDouble(s1.substring(3))));//����
	System.out.println("��ʱ"+vvv1+":"+vvv2);
	////////////////////////////Hashtable
	s1=sd.format(new Date());
	System.out.println("����ȡhashtable��������"+s1);
	for(i=0;i<pow;i++){
	table.get(i);
	}
	s2=sd.format(new Date());
	System.out.println("ȡ����ɡ�����"+s2+" ���Ҵ�����"+i);
	vvv1=(int)(Double.parseDouble(s2.substring(0,2))-Double.parseDouble(s1.substring(0,2)));//��
	vvv2=(int)(Math.abs(Double.parseDouble(s2.substring(3))-Double.parseDouble(s1.substring(3))));//����
	System.out.println("��ʱ"+vvv1+":"+vvv2+"\n");
	//////////////////////////Treemap
	s1=sd.format(new Date());
	System.out.println("����ȡtreemap��������"+s1);
	for(i=0;i<pow;i++){
	tmap.get(i);
	}
	s2=sd.format(new Date());
	System.out.println("ȡ����ɡ�����"+s2+" ���Ҵ�����"+i);
	vvv1=(int)(Double.parseDouble(s2.substring(0,2))-Double.parseDouble(s1.substring(0,2)));//��
	vvv2=(int)(Math.abs(Double.parseDouble(s2.substring(3))-Double.parseDouble(s1.substring(3))));//����
	System.out.println("��ʱ"+vvv1+":"+vvv2+"\n");
	}
	}


