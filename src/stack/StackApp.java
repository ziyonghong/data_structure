package stack;

public class StackApp {

	public static void main(String[] args) {
	//	System.out.println(conversion4D2X(22, 2));
	 System.out.println(isMatch("][]"));
		// System.out.println(lineEdit("Hello #world"));
	}

	/**
	 * ջ��Ӧ�þ���-��10����������numת��Ϊn����
	 * 
	 * @param num
	 *            ��ת��ʮ������
	 * @param n
	 *            ת������
	 * @return
	 */
/*	private static String conversion4D2X(int num, int n) {
		MyStack<Integer> myStack = new MyArrayStack<Integer>();
		Integer result = num;
		while (true) {
			// ��������ջ
			myStack.push(result % n);
			result = result / n;
			if (result == 0) {
				break;
			}
		}
		StringBuilder sb = new StringBuilder();
		// ����ջ��˳�������м���
		while ((result = myStack.pop()) != null) {
			sb.append(result);
			//System.out.print(result);
		}
		return sb.toString();
	}
}
*/
	/**
	 * ջ��Ӧ�þ���-��������Ƿ�ƥ��:
	 * '['��']', '('��')'�ɶԳ���ʱ�ַ����Ϸ�
	 * @param str
	 * @return boolean
	 */
	private static boolean isMatch(String str) {  
	    MyStack<Character> myStack = new MyArrayStack<Character>();  
	    char[] arr = str.toCharArray();  
	    for (char c : arr) {  
	        Character temp = myStack.pop();  
	        // ջΪ��ʱֻ��c��ջ  
	        if (temp == null) {  
	            myStack.push(c);  
	        }  
	        // ���ʱc����ջ  
	        else if (temp == '[' && c == ']') {  
	        }   
	        // ���ʱc����ջ  
	        else if (temp == '(' && c == ')') {  
	        }   
	        // �����ʱc��ջ  
	        else {  
	            myStack.push(temp);  
	            myStack.push(c);  
	        }  
	    }  
	    return myStack.isEmpty();  
}
}