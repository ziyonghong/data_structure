package stack;

public class MyArrayStack<T> implements MyStack<T> {
	// �����ʼջ�Ĵ�С
	private Object[] objs = new Object[16];
	// ջ�Ĵ�С
	    private int size = 0;  
	    
	    public boolean isEmpty() {
	        return size == 0;
	    }  
	   
	    public void clear() {  
	        // �������е�������Ϊnull, ����GC���л���  
	        for (int i = 0; i < size; i++) {  
	            objs[size] = null;  
	        }  
	        size = 0;  
	    }  
	    
	    public int length() {  
	        return size;  
	    }  
	  
	    
	    public boolean push(T data) {  
	        // �ж��Ƿ���Ҫ������������  
	        if (size >= objs.length) {  
	            resize();  
	        }  
	        objs[size++] = data;  
	        return true;  
	    }  
	  
	    /**
	     * ��������
	     */  
	    private void resize() {  
	        Object[] temp = new Object[objs.length * 3 / 2 + 1];
	        // ����
	        for (int i = 0; i < size; i++) {  
	            temp[i] = objs[i];  
	            objs[i] = null;  
	        }  
	        // ��objs��������Ϊջ�ռ�
	        objs = temp;
	    }  
	  
  
	    @SuppressWarnings("unchecked")
		public T pop() {  
	        if (size == 0) {  
	            return null;  
	        }  
	        return (T) objs[--size];  
	    }  
	  
	    @Override  
	    public String toString() {  
	        StringBuilder sb = new StringBuilder();  
	        sb.append("MyArrayStack: [");  
	        for (int i = 0; i < size; i++) {  
	            sb.append(objs[i].toString());  
	            if (i != size - 1) {  
	                sb.append(", ");  
	            }  
	        }  
	        sb.append("]");  
	        return sb.toString();  
	    }  
}
