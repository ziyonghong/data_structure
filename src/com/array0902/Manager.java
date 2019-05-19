package com.array0902;

import java.util.Scanner;

public class Manager {
	public static void main(String[] args) {
		// 创建一个扫描器对象，用来接收用户在命令行的输入
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要管理学生的个数：");

		int studentCount=sc.nextInt();
		//根据输入的个数创建Student对象的数组
		Student[] stuarray=new Student[studentCount];
		for(int i=0;i<stuarray.length;i++){
			System.out.println("请输入第"+(i+1)+"个学生的名字： ");
			String name=sc.next();
			System.out.println("请输入第"+(i+1)+"个学生的分数： ");
			int scro=sc.nextInt();
			Student stu=new Student(name,scro);
			//将创建好的学生对象放入数组中
			stuarray[i]=stu;
			}
		//调用打印方法
		printStudent(stuarray);
	}

	private static void printStudent(Student[] sta) {
		System.out.println(sta.length+" 个学生信息如下： ");
		for (int i = 0; i < sta.length; i++) {
			Student st=sta[i];
			st.showInfo();
		}
		
	}
}
