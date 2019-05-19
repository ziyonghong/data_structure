package com.link;

//����˫��������
public class MyLinkList {
	private Node first;// ����ĵ�һ���ڵ�
	private Node last;// ��������һ���ڵ�
	private int size;// �ڵ�����

	// �����е�ÿһ���ڵ�
	class Node {
		Node prev;// ��һ���ڵ����
		Node next;// ��һ���ڵ����
		Object ele;// ��ǰ�ڵ����洢������

		public Node(Object ele) {

			this.ele = ele;
		}

	}

	public Node search(Object ele) {
		Node current = this.first;
		for (int i = 0; i < size; i++) {
			if (!current.ele.equals(ele)) {
				if (current.next == null) {
					return null;
				}
				current = current.next;
			}
		}
		return current;
	}

	public void remove(Object ele) {
		// �ҵ���ɾ���Ľڵ�
		Node current = this.first;
		for (int i = 0; i < size; i++) {
			if (!current.ele.equals(ele)) {
				if (current.next == null) {
					return;
				}
				current = current.next;
			}
		}
		// ɾ���ڵ�
		if (current == first) {
			this.first = current.next;
			this.first.prev = null;
		} else if (current == last) {
			this.last = current.prev;
			this.last.next = null;
		} else {
			current.prev.next = current.next;
			current.next.prev = current.prev;
			current = null;
		}
		size--;
	}

	public void addLast(Object ele) {
		Node node = new Node(ele);// ��Ҫ����Ľڵ����
		if (size == 0) {
			this.first = node;
			this.last = node;
		} else {
			// �������һ��λ��
			this.last.next = node;
			node.prev = this.last;
			this.last = node;
		}
		size++;
	}

	public void addFirst(Object ele) {
		Node node = new Node(ele);// ��Ҫ����Ľڵ����
		if (size == 0) {
			this.first = node;
			this.last = node;
		} else {
			// �����һ��λ��
			node.next = this.first;
			this.first.prev = node;
			this.first = node;
		}
		size++;
	}

	public String toString() {
		if (size == 0) {
			return "[]";
		}
		StringBuilder sb = new StringBuilder(size * 2 + 1);
		Node current = this.first;// ��һ���ڵ�
		sb.append("[");
		for (int i = 0; i < size; i++) {
			sb.append(current.ele);

			if (i != size - 1) {
				sb.append(",");
			} else {
				sb.append("]");
			}
			current = current.next;
		}
		return sb.toString();
	}

}
