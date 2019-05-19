package com.array;

public class BaskedballPlayerDemo {
 private static Integer[] players=null;
 
 private static int size=0;
 //��ʼ��
 public static void init(int a){
	 players=new Integer[a];
 }
 //����
 public static void add(int i) {
		players[size]=i;
		size++;
		
	}
 //��ӡ
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
	
	//����
	public static int find(int b){
		for(int i=0;i<size;i++){
		if(players[i].equals(b)){
			return i;
		}
	}
		return -1;
	}
	
	//ɾ��,����λ
	public static void delete(int index){
		for(int i=index;i<size-1;i++){
			
				players[i]=players[i+1];
				
				//System.out.println(players[i]);
			}
		}
	
	public static void main(String[] args) {
		//��ʼ����Ϊs�������б�
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
