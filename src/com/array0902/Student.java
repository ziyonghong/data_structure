package com.array0902;

public class Student {

	private String name;
	private int score;
	//构造方法创建学生对象，传入姓名和分数
	public Student(String name, int score) {
		
		this.name = name;
		this.score = score;
	}
	//输出学生的基本信息
	public void showInfo(){
		System.out.println("姓名： "+name+" 分数： "+score);
	}
	
}
