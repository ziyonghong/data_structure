package com.array0902;

public class Student {

	private String name;
	private int score;
	//���췽������ѧ�����󣬴��������ͷ���
	public Student(String name, int score) {
		
		this.name = name;
		this.score = score;
	}
	//���ѧ���Ļ�����Ϣ
	public void showInfo(){
		System.out.println("������ "+name+" ������ "+score);
	}
	
}
