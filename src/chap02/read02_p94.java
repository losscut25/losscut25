package chap02;

import java.io.IOException;

/* 반복문(153p)
 * while(조건) {
 *  // 반복실행코드
 * 조건문(135p)
 * if(조건) {
 * // 조건 충족시 실행코드
 */
 

public class read02_p94 {

	public static void main(String[] args) throws IOException{
		int keyCode;
		
		// 반복문은 조건을 충족시 반복실행
		while(true) { // -> 무한반복
			//반복실행코드
			keyCode = System.in.read();
			System.out.println(keyCode);
			
			if(keyCode==113) { // 소문자 q를 입력하면 반목문 종료
				// 조건충족시 실행코드
				System.out.println("if문 안");
				break;// 반복문을 종료
			}
		}
		System.out.println("while문-밖");
	}
}
