package com.set;

import java.util.ArrayList;
import java.util.HashSet;

public class MyTest {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		while (hs.size() < 1000) {
			int value = (int) (Math.random() * 2000);
			hs.add(value);
		}
		ArrayList<Integer> al = new ArrayList<Integer>(hs);
	//	System.out.println(al);

//		// ����
//		ArrayList<Integer> sort = new ArrayList<Integer>();
//		while (al.size() > 0) {
//			// Ѱ����Сֵ
//			int minValue = 2001;
//			for (int v : al) {
//				if (minValue > v) {
//					minValue = v;
//				}
//			}
//			// ��ʣ�µ���Сֵ����sort
//			sort.add(minValue);
//			//��ȡ�ߵ�ֵ��al��ɾ��
//			al.remove(new Integer(minValue));
//		}
		
		//ð������
		boolean change=true;
		while(change){
			//������潻��û��ִ�У�change����false��ѭ������
			change=false;
			for(int i=0;i<al.size()-1;i++){
				if(al.get(i)>al.get(i+1)){
					//����
					int t=al.get(i);
				//	al.get(i)=al.get(i+1);
					al.set(i, al.get(i+1));
					al.set(i+1,t);
					
					//�н�������ѭ��һ��
					change=true;
				}
			}
		}
		
		//��֤
		for(int v:al){
			System.out.println(v+"\t");
		}
	}
}
