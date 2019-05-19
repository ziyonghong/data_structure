package com.link;

//基于双向链表集合
public class MyLinkList {
	private Node first;// 链表的第一个节点
	private Node last;// 链表的最后一个节点
	private int size;// 节点数量

	// 链表中的每一个节点
	class Node {
		Node prev;// 上一个节点对象
		Node next;// 下一个节点对象
		Object ele;// 当前节点对象存储的数据

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
		// 找到被删除的节点
		Node current = this.first;
		for (int i = 0; i < size; i++) {
			if (!current.ele.equals(ele)) {
				if (current.next == null) {
					return;
				}
				current = current.next;
			}
		}
		// 删除节点
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
		Node node = new Node(ele);// 需要保存的节点对象
		if (size == 0) {
			this.first = node;
			this.last = node;
		} else {
			// 放入最后一个位置
			this.last.next = node;
			node.prev = this.last;
			this.last = node;
		}
		size++;
	}

	public void addFirst(Object ele) {
		Node node = new Node(ele);// 需要保存的节点对象
		if (size == 0) {
			this.first = node;
			this.last = node;
		} else {
			// 放入第一个位置
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
		Node current = this.first;// 第一个节点
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
