package hw;

import java.util.Scanner;

public class Student {
	Scanner sc = new Scanner(System.in);
	private String name;
	private String gender;
	private int age;
	private int gradeNum;
		
	
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
	public int getGradeNum() {
		return gradeNum;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGradeNum(int gradeNum) {
		this.gradeNum = gradeNum;
	}
	
	
	
	void regi() {
				System.out.print("학 번  입력 : ");
				gradeNum = sc.nextInt();
				System.out.print("이 름 입력 : ");
				name = sc.next();
				System.out.print("성 별 입력 : ");
				gender = sc.next();
				System.out.print("나 이 입력 : ");
				age = sc.nextInt();
				System.out.println("등록되었습니다.");
				System.out.println("----------------------");			
	}

	void regist() {
		while(true) {
			System.out.println("**** 학생 관리 프로그램 ****");
			System.out.println("1.학생 등록");
			System.out.println("2.프로그램 종료");
			System.out.print("관리 번호를 입력하세요. : ");
			int num = sc.nextInt();
			System.out.println("----------------------");
			if(num > 2 || num < 0) {
				System.out.println("[잘못된 관리 번호 입니다. 다시 입력 하십시오.]");
			} else {
				switch (num) {
				case 1:
					System.out.println("[학생을 등록합니다.]");
					regi();
					break;
					
				case 2:
					System.out.println("[프로그램을 종료합니다.]");
					break;
					
				}break;
			}
		}
	}
}
