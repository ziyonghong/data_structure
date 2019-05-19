package stack;

public class Test {
	public static void main(String[] args) {
		testSpeed();
	}

	private static void testSpeed() {
		// 测试数组实现
		MyStack<Person> stack = new MyArrayStack<Person>();
		// 测试链表实现
		// MyStack<Person> stack = new MyLinkedStack<Person>();
		int num = 1000000;
		long start = System.currentTimeMillis();
		for (int i = 0; i < num; i++) {
			stack.push(new Person());
		}
		long temp = System.currentTimeMillis();
		System.out.println("push time: " + (temp - start));
		while (stack.pop() != null)
			;
		System.out.println("pop time: " + (System.currentTimeMillis() - temp));
	}
}