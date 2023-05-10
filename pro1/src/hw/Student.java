package hw;

import java.util.Scanner;

// 나이, 성별, 이름, 학원 
// 등록, 퇴부
public class Student {
	Scanner sc = new Scanner(System.in);
	String name;
	String gender;
	int age;
		
	void regi() {
				System.out.print("이     름 입력 : ");
				name = sc.next();
				System.out.print("성     별 입력 : ");
				gender = sc.next();
				System.out.print("나     이 입력 : ");
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
