package stack;

public interface MyStack<T> {
    /**
     * �ж�ջ�Ƿ�Ϊ��
     */  
    boolean isEmpty();  
    /**
     * ���ջ
     */  
    void clear();  
    /**
     * ջ�ĳ���
     */  
    int length();  
    /**
     * ������ջ
     */  
    boolean push(T data);  
    /**
     * ���ݳ�ջ
     */  
    T pop();
}
