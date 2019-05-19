package stack;

public class StackApp {

	public static void main(String[] args) {
	//	System.out.println(conversion4D2X(22, 2));
	 System.out.println(isMatch("][]"));
		// System.out.println(lineEdit("Hello #world"));
	}

	/**
	 * 栈的应用举例-将10进制正整数num转换为n进制
	 * 
	 * @param num
	 *            待转化十进制数
	 * @param n
	 *            转化进制
	 * @return
	 */
/*	private static String conversion4D2X(int num, int n) {
		MyStack<Integer> myStack = new MyArrayStack<Integer>();
		Integer result = num;
		while (true) {
			// 将余数入栈
			myStack.push(result % n);
			result = result / n;
			if (result == 0) {
				break;
			}
		}
		StringBuilder sb = new StringBuilder();
		// 按出栈的顺序倒序排列即可
		while ((result = myStack.pop()) != null) {
			sb.append(result);
			//System.out.print(result);
		}
		return sb.toString();
	}
}
*/
	/**
	 * 栈的应用举例-检验符号是否匹配:
	 * '['和']', '('和')'成对出现时字符串合法
	 * @param str
	 * @return boolean
	 */
	private static boolean isMatch(String str) {  
	    MyStack<Character> myStack = new MyArrayStack<Character>();  
	    char[] arr = str.toCharArray();  
	    for (char c : arr) {  
	        Character temp = myStack.pop();  
	        // 栈为空时只将c入栈  
	        if (temp == null) {  
	            myStack.push(c);  
	        }  
	        // 配对时c不入栈  
	        else if (temp == '[' && c == ']') {  
	        }   
	        // 配对时c不入栈  
	        else if (temp == '(' && c == ')') {  
	        }   
	        // 不配对时c入栈  
	        else {  
	            myStack.push(temp);  
	            myStack.push(c);  
	        }  
	    }  
	    return myStack.isEmpty();  
}
}