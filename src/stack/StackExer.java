package stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StackExer {
	class ArrayStack {
		private String[] data = new String[10];// �洢����
		private int size;// ��¼����
		// ��itemѹ���ջ����

		public void push(String str) {
			// �ж��Ƿ���Ҫ����
			if (size > data.length) {
				data = Arrays.copyOf(data, data.length * 2);
			}
			data[size++] = str;
		}

		// �鿴��ջ�����Ķ��󣬵����Ӷ�ջ���Ƴ���
		public String peek() {
			// �ж�ջ�Ƿ�Ϊ��
			if (size == 0) {
				throw new EmptyStackException();
			}
			return data[size - 1]; // ��ȡջ��Ԫ��
		}

		// �Ƴ���ջ�����Ķ��󣬲���Ϊ�˺�����ֵ���ظö���
		public String pop() {
			String str = this.peek();// ��ȡջ��Ԫ��
			size--; // ����Ԫ�ظ���
			return str;
		}

		// ���Զ�ջ�Ƿ�Ϊ��
		public boolean empty() {
			return size == 0;
		}

		// ���ض����ڶ�ջ�е�λ�ã��� 1 Ϊ����

		public int research(String str) {

			// ˳�ŷŵ����ã�FILO/LIFO��
			for (int i = size - 1; i >= 0; i--) {
				if (str == data[i] || str != null && data[i].equals(str)) {
					return size - i;
				}
			}
			return -1; // ����ջ�в����ڸ�Ԫ��
		}

	}

}
