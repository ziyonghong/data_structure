package com.zyh.array0421;

public class PrintArray {
	public static void main(String[]args){
		String[] arr={"A","B","C","D"};
	
		printArray(arr);
		System.out.println(arr.length);
	}
    static void printArray(String[] arr){
    	if(arr==null){
    		System.out.println("null");
    		return;//表示结束方法
    	}
    	String ret = "{";
    	for(int i=0;i<arr.length;i++){
    		ret=ret+arr[i];
    		if(i!=arr.length-1){
    			ret= ret+",";
    		}
    	
		}
    	ret=ret+"}";
		System.out.println(ret);
    }
}
