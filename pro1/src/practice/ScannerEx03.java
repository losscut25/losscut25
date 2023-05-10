package practice;

import java.util.Scanner;

public class ScannerEx03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("1. 이름 : ");
		String s = sc.nextLine();
		System.out.printf("2. 주민번호 앞 6자리 : ");
		String n = sc.nextLine();
		System.out.printf("3. 전화번호 : ");
		String n1 = sc.nextLine();
		
		System.out.println();
		
		System.out.println("1. 이름 : "+ s);
		System.out.println("2. 이름 : "+ n);
		System.out.println("3. 이름 : "+ n1);
		
	}

}
