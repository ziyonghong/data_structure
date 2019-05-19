package com.array;

public class BaskedballPlayerDemo {
 private static Integer[] players=null;
 
 private static int size=0;
 //初始化
 public static void init(int a){
	 players=new Integer[a];
 }
 //增加
 public static void add(int i) {
		players[size]=i;
		size++;
		
	}
 //打印
	public static void print(){
		if(players==null){
			System.out.println("null");
			return;
		}
		if(size==0){
			System.out.println("[]");
			return;
		}
		StringBuilder sb=new StringBuilder(size*2+1);
		sb.append("[");
		for(int index=0;index<size;index++){
			sb.append(players[index]);
			if(index!=size-1){
				sb.append(",");
			}		
		}
		sb.append("]");
		System.out.println(sb.toString());
	}
	
	//查找
	public static int find(int b){
		for(int i=0;i<size;i++){
		if(players[i].equals(b)){
			return i;
		}
	}
		return -1;
	}
	
	//删除,需移位
	public static void delete(int index){
		for(int i=index;i<size-1;i++){
			
				players[i]=players[i+1];
				
				//System.out.println(players[i]);
			}
		}
	
	public static void main(String[] args) {
		//初始容量为s的线性列表
		init(5);
		
		add(11);
		add(22);
		add(33);
		add(44);
		add(55);
		print();
		
		int b=find(11);
		
		System.out.println(b);
		delete(2);
		print();
	}


	
}
