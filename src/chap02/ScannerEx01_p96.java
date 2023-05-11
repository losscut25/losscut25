package chap02;

import java.util.Scanner;

//키보드에서 입력된 내용을 문자열로 얻기 : Scanner클래스를 이용

public class ScannerEx01_p96 {

	public static void main(String[] args) {
		// 클래스타입 참조변수 = new 클래스명(생성자(constructor));
		// 클래스의 객체를 생성하여 참조변수에 할당
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String s = sc.nextLine();
			System.out.println("입력받은 문자열:"+s);
			if(s.equals("q")) {//입력받은 문자열이 q와 동일하다면 equals를 사용
				break;
			}
			
		}
		System.out.println("while문 - 밖");
	}
}