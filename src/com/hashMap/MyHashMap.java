package com.hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.omg.CORBA.Current;
 
public class MyHashMap<K, V> implements MyMap<K, V> {
 
	// ����Ĭ������Ĵ�С  2^n
	private static int defaultLength = 1<<4;
	
	/**
	 * 1����ϣ���ڲ�������ĳ��ȣ���ʹ�õ����鳤�ȳ����ܳ��ȵ�0.75 ��������Ҫ�������ݣ����ݽ����ǽ����鳤�ȱ�Ϊԭ����������
	 * 	    ���ҽ����ڵ������ڵ���������hash�����ȵ�ɢ�зֲ����µ������У����Ըò������ıȽϴ�
	 * 2��defaultDaaSizeFactoryֵ�Ǿ������Եó������Ǹ������غ�ľ���ֵ��ֵ������ճ����ݵĸ����½��������ٵ��Ǵ�ȡ���ݵ�Ч��Ҳ���ͣ���֮��������
	 * 3��0.9���߸��������ֵ���������γɴ�����������ȡ����Ҫ���кܶ��next�����ж����Ҳ���
	 */
	private static double defaultAddSizeFactory = 0.75;
	
	/**
	 * ��ʹ������ĳ��ȣ�put�������ж�������++������
	 */
	private int userSize;
	
	// ����֮һ���������е�������ʼ��Ϊnull��
	private Entry<K,V>[] table = null;
	
	/**
	 * �޲εĹ��캯��,ʹ��Ĭ��ֵ(��������Ĺ����γ�����ģʽ)
	 */
	public MyHashMap(){
		this(defaultLength, defaultAddSizeFactory);
	}
	
	/**
	 * �����������Ĺ��캯��
	 * @param length	���õ�����Ĭ�ϴ�С
	 * @param defaultAddSizeFactory	���õ�����ֵ
	 */
	public MyHashMap(int length, double defaultAddSizeFactory2){
		if(length < 0){
			throw new IllegalArgumentException("��������Ϊ����:");
		}
		if(defaultAddSizeFactory <= 0 || Double.isNaN(defaultAddSizeFactory)){
			throw new IllegalArgumentException("���ݲ����������0");
		}
		defaultLength = length;
		defaultAddSizeFactory = defaultAddSizeFactory2;
		table = new Entry[defaultLength];
	}
	
	class Entry<K,V> implements MyMap.Entry<K, V>{
		
		K k;
		V v;
		// ָ����һ������
		Entry<K,V> next = null;
		
		// ȫ�ι���
		public Entry(K k, V v, Entry<K, V> next) {
			super();
			this.k = k;
			this.v = v;
			this.next = next;
		}
 
		@Override
		public K getKey() {
			return k;
		}
 
		@Override
		public V getValue() {
			return v;
		}
		
	}
	/**
	 * ������
	 * @param k
	 * @param v
	 */
	@Override
	public V put(K k, V v) {
		// �ж��Ƿ���Ҫ��������
		if(userSize > defaultAddSizeFactory*defaultLength){
			up2Size();
		}
		int index = getIndex(k, table.length);
		Entry<K,V> entry = table[index];
		// �ж�index�������±�λ�����Ƿ��Ѿ���Ź����ݣ����Ҵ�������Ǻ�ŵ�����������
		if(entry == null){
			table[index] = new Entry(k,v,null);
		}else if(entry != null){
			// ���Ѿ���ռ������Ҫ����һ���µ�����
			table[index] = new Entry(k,v,entry); 
		}
		return table[index].getValue();
	}
 
	/**
	 * Ѱ������λ�õ��±�
	 * @param k
	 * @param length
	 * @return
	 */
	private int getIndex(K k, int length) {
		int i = length - 1;
		int index = hash(k.hashCode())&i;
		return index;
	}
 
	/**
	 * �Լ���hash����(���д�����λ��3��ʹ���ݸ���ɢ��)
	 * @param hashCode
	 * @return
	 */
	private int hash(int hashCode) {
		hashCode = hashCode^((hashCode>>>20)^(hashCode>>>12));
		return hashCode^((hashCode>>>7)^(hashCode>>>4));
	}
 
	/**
	 * ���������������
	 * 1�������������ȵ�������
	 * 2��
	 */
	private void up2Size() {
		Entry<K,V>[] newTable = new Entry[defaultLength*2];
		// ��ԭ�����е������ٴν���hash�������������
		againHash(newTable);
	}
 
	/**
	 * ��ԭ�����е������ٴν���hash�������������
	 * @param newTable
	 */
	private void againHash(MyHashMap<K, V>.Entry<K, V>[] newTable) {
		Map<String,String> map = new HashMap<String,String>();
		List<Entry<K,V>> entryList = new ArrayList<MyHashMap<K, V>.Entry<K,V>>();
		// ѭ���������鲢�����ݼ���ֵentryList��
		for(int i=0 ; i<table.length ; i++){
			if(table[i] == null){
				continue;
			}
			// ������������Entry����
			foundEntryByNext(table[i], entryList);
		}
		// ����entryList
		if(entryList == null){
			userSize = 0; 
			defaultLength = defaultLength*2;
			for(Entry<K,V> entry : entryList){
				if(entry.next != null){
					
				}
			}
		}
	}
 
	// ������һ��Ԫ�ز������ݴ���list��
	private void foundEntryByNext(MyHashMap<K, V>.Entry<K, V> entry,
			List<MyHashMap<K, V>.Entry<K, V>> entryList) {
		if(entry != null && entry.next != null){
			entryList.add(entry);
			//���еݹ����
			foundEntryByNext(entry.next, entryList);
		}else{
			// û��nestԪ��ָ��
			entryList.add(entry);
		}
	}
 
	/**
	 * ȡ����
	 * @param k
	 */
	@Override
	public V get(K k) {
		int index = getIndex(k,table.length);
		if(table[index] == null){
			throw new NullPointerException();
		}
		return findValueByEqualKey(k, table[index]);
	}
	
	private V findValueByEqualKey(K k, MyHashMap<K, V>.Entry<K, V> entry) {
		if(k== entry.getKey() || k.equals(entry.getKey())){
			return entry.getValue();
		}else if(entry.next != null){
			return findValueByEqualKey(k,entry.next);
		}
		return null;
	}
 
	// ��ȡ��ʱʹ���˶��ٸ�����
	public int getUseSize(){
		return userSize;
	}
 
	// ����
	public static void main(String[] args) {
		MyMap<String,String> map = new  MyHashMap<String,String>();
		long s1=System.currentTimeMillis();
		for(int i=0 ; i<10000 ; i++ ){
			map.put(i+"", ""+i);
			
		}
		for(int i=0 ; i<10000 ; i++ ){
			map.get(i+"") ;
		}
		long s2=System.currentTimeMillis();
		System.out.println(s2-s1);
		
		HashMap<String, String> hm=new HashMap<>();
		long s3=System.currentTimeMillis();
		for(int i=0 ; i<10000 ; i++ ){
			hm.put(i+"", ""+i);
		}
		for(int i=0 ; i<10000 ; i++ ){
			hm.get(i+"") ;
		}
		long s4=System.currentTimeMillis();
		System.out.println(s4-s3);
	}
}