package com.sort;

import java.util.LinkedList;

//��������
class Node {
	int value;
	Node next;
}

public class KMerge {
	public static void main(String[] args) {
		// ������·����
		LinkedList<Node> list1 = createList(2, 5, 8, 10);
		LinkedList<Node> list2 = createList(3, 4, 14);
		LinkedList<Node> list3 = createList(9, 11, 13, 15, 18);
		LinkedList<LinkedList<Node>> kLists = new LinkedList<LinkedList<Node>>();
		kLists.add(list1);
		kLists.add(list2);
		kLists.add(list3);
		// ��ʼ�鲢
		LinkedList<Node> resultList = kMerge(kLists);
		for (Node node : resultList) {
			System.out.print(node.value + " ,");
		}
		System.out.println();
	}

	private static LinkedList<Node> kMerge(LinkedList<LinkedList<Node>> kLists) {
		int size = kLists.size();
		Node[] heap = new Node[size + 1];
		// ȡ��K·��ÿ������ĵ�һ��Ԫ�أ���������
		for (int i = 1; i <= size; i++)
			heap[i] = kLists.get(i - 1).getFirst();
		buildMaxHeap(heap, size);

		LinkedList<Node> resultList = new LinkedList<Node>();
		while (size > 0) {
			// ����λ�õ���СԪ��ȡ���������
			Node minNode = heap[1];
			resultList.add(minNode);
			// ���Ϊ�գ��򽫶�βԪ��Ų����λ��
			// ���򽫺��Ԫ����ӵ�����
			if (minNode.next == null) {
				heap[1] = heap[size];
				size -= 1;
			} else {
				heap[1] = minNode.next;
			}

			// ��λ�õĶ����ʱ��ƻ������»ָ���
			minHeapify(heap, size, 1);
		}

		return resultList;
	}

	private static void minHeapify(Node[] heap, int size, int i) {
		int left = 2 * i;
		int right = 2 * i + 1;
		int min = i;
		if (left <= size && heap[left].value < heap[i].value)
			min = left;
		if (right <= size && heap[right].value < heap[min].value)
			min = right;

		if (min != i) {
			Node tmp = heap[i];
			heap[i] = heap[min];
			heap[min] = tmp;
			minHeapify(heap, size, min);
		}
	}

	private static void buildMaxHeap(Node[] heap, int size) {
		for (int i = size / 2; i >= 1; i--) {
			minHeapify(heap, size, i);
		}
	}

	private static LinkedList<Node> createList(int... values) {
		LinkedList<Node> list = new LinkedList<Node>();
		Node preNode = null;
		for (int value : values) {
			Node node = new Node();
			node.value = value;
			if (preNode != null)
				preNode.next = node;
			list.add(node);
			preNode = node;
		}
		return list;
	}
}
