package com.array0902;

import java.util.Scanner;

public class Manager {
	public static void main(String[] args) {
		// ����һ��ɨ�����������������û��������е�����
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫ����ѧ���ĸ�����");

		int studentCount=sc.nextInt();
		//��������ĸ�������Student���������
		Student[] stuarray=new Student[studentCount];
		for(int i=0;i<stuarray.length;i++){
			System.out.println("�������"+(i+1)+"��ѧ�������֣� ");
			String name=sc.next();
			System.out.println("�������"+(i+1)+"��ѧ���ķ����� ");
			int scro=sc.nextInt();
			Student stu=new Student(name,scro);
			//�������õ�ѧ���������������
			stuarray[i]=stu;
			}
		//���ô�ӡ����
		printStudent(stuarray);
	}

	private static void printStudent(Student[] sta) {
		System.out.println(sta.length+" ��ѧ����Ϣ���£� ");
		for (int i = 0; i < sta.length; i++) {
			Student st=sta[i];
			st.showInfo();
		}
		
	}
}
