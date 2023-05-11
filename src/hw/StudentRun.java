package hw;

import java.util.Scanner;

public class StudentRun {
	public static void main(String[] args) {
		int num = 0;
		Student stu = new Student();
		stu.regist();	
		stu.setName("셋네임");
		System.out.println(stu.getName());
		stu.setGender("남/여");
		System.out.println(stu.getGender());
		stu.setAge(000);
		System.out.println(stu.getAge());
		stu.setGradeNum(202051122);
		System.out.println(stu.getGradeNum());
		
		}

}
