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

//		// 排序
//		ArrayList<Integer> sort = new ArrayList<Integer>();
//		while (al.size() > 0) {
//			// 寻找最小值
//			int minValue = 2001;
//			for (int v : al) {
//				if (minValue > v) {
//					minValue = v;
//				}
//			}
//			// 将剩下的最小值存入sort
//			sort.add(minValue);
//			//将取走的值从al中删除
//			al.remove(new Integer(minValue));
//		}
		
		//冒泡排序
		boolean change=true;
		while(change){
			//如果下面交换没有执行，change就是false，循环结束
			change=false;
			for(int i=0;i<al.size()-1;i++){
				if(al.get(i)>al.get(i+1)){
					//交换
					int t=al.get(i);
				//	al.get(i)=al.get(i+1);
					al.set(i, al.get(i+1));
					al.set(i+1,t);
					
					//有交换则再循环一遍
					change=true;
				}
			}
		}
		
		//验证
		for(int v:al){
			System.out.println(v+"\t");
		}
	}
}
