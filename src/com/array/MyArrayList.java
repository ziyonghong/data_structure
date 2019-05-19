package com.array;

import java.util.Arrays;

/*
 * ����������б����ϣ�
 */
public class MyArrayList {
	private Object[] elements = null;
	private int size = 0;

	public MyArrayList() {
		this(10);
	}

	public MyArrayList(int initialCapacity) {
		if (initialCapacity < 0) {
			throw new IllegalArgumentException("��������Ϊ����");
		}
		elements = new Object[initialCapacity];
	}

	public void add(Object obj) {
		// �жϺ�����
		if (size == elements.length) {
			Object[] t = Arrays.copyOf(elements, elements.length * 2);
			elements = t;
		}
		elements[size] = obj;
		size++;
	}

	// ����Ԫ��������λ��
	public int getIndex(Object obj) {
		for (int index = 0; index < size; index++) {
			if (elements[index].equals(obj)) {
				return index;
			}
		}
		return -1;
	}

	/*
	 * �滻ĳһ������Ԫ�� 
	 * index:�滻λ��
	 *  newobj����Ԫ��
	 */
	public void set(int index, Object newobj) {
		if (index < 0 || index >= size) {
			throw new IllegalArgumentException("����Խ��");
		}
		elements[index] = newobj;
	}

	/*
	 * �滻ĳһԪ��
	 * 
	 */
	public void update(Object oldobj, Object newobj) {
		int index = getIndex(oldobj);
		if (index >= 0) {
			set(index, newobj);
		}
	}

	// ɾ��ĳһԪ��
	public void delete(int index) {
		if (index < 0 || index >= size) {
			throw new IllegalArgumentException("����Խ��");
		}
		for (int i = index; i < size - 1; i++) {
			elements[i] = elements[i + 1];
		}
		elements[size - 1] = null;
		size--;
	}

	// ��ӡ
	public String toString() {
		if (elements == null) {
			return "null";
		}
		if (size == 0) {
			return "[]";
		}
		StringBuilder sb = new StringBuilder(size * 2 + 1);
		sb.append("[");
		for (int index = 0; index < size; index++) {
			sb.append(elements[index]);
			if (index != size - 1) {// �ж��Ƿ������һ��Ԫ��
				sb.append(",");
			} else {
				sb.append("]");
			}
		}
		return sb.toString();
	}
	//��������Ԫ�ظ���
	public int size(){
		return size;
	}
	//�ж������Ƿ�Ϊ��
	public boolean isEmpty(){
		return size==0;
	}
	
}
