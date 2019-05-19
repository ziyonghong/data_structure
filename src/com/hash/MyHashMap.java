

package com.hash;

import java.util.HashMap;

public class MyHashMap {

	public Node[] HeadNode = new Node[11];
	public int size = 0;
	public float loadFactor = 0.75f;// ��������

	public class Node {
		Node next;// ָ����һ���ڵ�
		Object key;
		Object value;

		// ���췽��
		public Node(Object key, Object value) {
			this.key = key;
			this.value = value;
		}

		public Object getKey() {
			return key;
		}

		public Object getValue() {
			return value;
		}
	}

	// ���ϣ������Ӽ�ֵ��
	public void put(Object key, Object value) {
		// �ж��Ƿ񳬹��������ӣ��Ƕ�һ��Ҫ���жϣ�һ��ʼ����ʱ�Ϳ�ʼִ���жϣ�Ҳ�ܺ�ʱ��������Ե���һ���̶Ⱥ��ٿ�ʼ�ж��Լ����жϴ�����
		if (size * 1.0 / HeadNode.length > loadFactor)
			rehash();

		//
		int index = hash(key, HeadNode.length);

		Node node = new Node(key, value);
		input(node, HeadNode, index);

	}

	// ��Ӻ���
	private void input(Node node, Node[] HeadNode, int index) {
		// ���HeadNodeΪ�գ���ѵ�ǰ�ڵ㸳��ͷ�ڵ�
		if (HeadNode[index] == null) {
			HeadNode[index] = node;
		} else {
			// ���򣬱�������
			// ����temp����HeadNode[index]���������temp����HeadNode[index]������̫���ῴ��
			Node temp = HeadNode[index];
			if (node.key == temp.key) {
				System.out.println("��ֵ" + temp.key + "�Ѵ���");
			} else {
				while (temp.next != null) {
					temp = temp.next;
				}
			}
			temp.next = node; // ��Ҫ����Ľڵ�ӵ��������
		}

	}

	// hash�����ǻ�ȡhashcode����ʵ�ҵ�����ǣ���������������һ��������
	public int hash(Object key, int length) {
		int index = -1;
		if (key != null) {
			// key��Object���͵ģ�Ҫת��int���͵Ĳ��ܽ���ȡ�����㡣
			// ��ת���ַ�����
			char[] c = key.toString().toCharArray();

			int tokey = 0;
			// ����ת����keyֵ
			for (int i = 0; i < c.length; i++) {
				tokey += c[i];
			}
			index = tokey % length;
		}
		return index;
	}

	public void rehash() {
		// ÿ����չ���ѵ�ǰ�Ĺ�ϣ������һ��
		Node[] newHeadNode = new Node[HeadNode.length * 2];

		// ��ԭ���Ĺ�ϣ����������hash��ȥ
		for (int i = 0; i < HeadNode.length; i++) {
			if (HeadNode[i] != null) {
				int newindex = hash(HeadNode[i].key, HeadNode.length * 2);

				// ����new�µĽڵ�������ԭ��hash���еļ�ֵ��
				Node rehashheadnode = new Node(HeadNode[i].key, HeadNode[i].value);
				input(rehashheadnode, newHeadNode, newindex);
				Node temp = HeadNode[i];
				while (temp.next != null) {
					temp = temp.next;
					Node rehashnextnode = new Node(temp.key, temp.value);
					int nextindex = hash(temp.key, newHeadNode.length);
					input(rehashnextnode, newHeadNode, nextindex);
				}

			}
		}
		// �������ýڵ���������ã����ǰ�newHeadNode����ĵ�ַ����HeadNode���������Ϊ��HeadNodeָ��newHeadNode��
		HeadNode = newHeadNode;

	}

	// ��ȡ��ֵ��Ӧ��value
	public Object getValue(Object key) {
		int index = hash(key, HeadNode.length);
		// ���ҵ�����������
		Node temp = HeadNode[index];

		// ���ж�ͷ�ڵ��Ƿ�Ϊ��
		if (temp == null)
			return null;
		else {
			if (key == temp.key)
				return temp.value;
			else {// ��������
				while (temp.next != null) {
					temp = temp.next;
					if (key == temp.key)
						return temp.value;
				}
			}
		}
		return null;
	}

	// public Node getNode(){
	//
	// }

	public int size() {
		return size;

	}

	public boolean isEmpty() {
		return size == 0;
	}

	public static void main(String[] args) {
		MyHashMap mhm = new MyHashMap();

		HashMap<Object, Object> hm = new HashMap<>();
		long s3 = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			hm.put(i + " ", i);
		}
		for (int i = 0; i < 1000000; i++) {
			hm.get(i);
		}
		long s4 = System.currentTimeMillis();
		System.out.println("jdkHashMap usetime:" + (s4 - s3));
		// ����
		long s1 = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			mhm.put(i + " ", i);
		}
		for (int i = 0; i < 1000000; i++) {
			mhm.getValue(i);
		}
		long s2 = System.currentTimeMillis();
		System.out.println("MyHashMap usetime:" + (s2 - s1));

	}

}

