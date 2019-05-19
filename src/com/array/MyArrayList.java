package com.array;

import java.util.Arrays;

/*
 * 基于数组的列表（集合）
 */
public class MyArrayList {
	private Object[] elements = null;
	private int size = 0;

	public MyArrayList() {
		this(10);
	}

	public MyArrayList(int initialCapacity) {
		if (initialCapacity < 0) {
			throw new IllegalArgumentException("容量不能为负数");
		}
		elements = new Object[initialCapacity];
	}

	public void add(Object obj) {
		// 判断和扩容
		if (size == elements.length) {
			Object[] t = Arrays.copyOf(elements, elements.length * 2);
			elements = t;
		}
		elements[size] = obj;
		size++;
	}

	// 根据元素找索引位置
	public int getIndex(Object obj) {
		for (int index = 0; index < size; index++) {
			if (elements[index].equals(obj)) {
				return index;
			}
		}
		return -1;
	}

	/*
	 * 替换某一索引的元素 
	 * index:替换位置
	 *  newobj：新元素
	 */
	public void set(int index, Object newobj) {
		if (index < 0 || index >= size) {
			throw new IllegalArgumentException("索引越界");
		}
		elements[index] = newobj;
	}

	/*
	 * 替换某一元素
	 * 
	 */
	public void update(Object oldobj, Object newobj) {
		int index = getIndex(oldobj);
		if (index >= 0) {
			set(index, newobj);
		}
	}

	// 删除某一元素
	public void delete(int index) {
		if (index < 0 || index >= size) {
			throw new IllegalArgumentException("索引越界");
		}
		for (int i = index; i < size - 1; i++) {
			elements[i] = elements[i + 1];
		}
		elements[size - 1] = null;
		size--;
	}

	// 打印
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
			if (index != size - 1) {// 判断是否是最后一个元素
				sb.append(",");
			} else {
				sb.append("]");
			}
		}
		return sb.toString();
	}
	//返回数组元素个数
	public int size(){
		return size;
	}
	//判断数组是否为空
	public boolean isEmpty(){
		return size==0;
	}
	
}
