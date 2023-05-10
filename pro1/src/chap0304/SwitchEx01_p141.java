package chap0304;

import java.util.Random;

/*조건문 - switch
switch(조건) {
case 값 : 실행코드; [break;]
case 값2 : 실행코드; [break;]
case 값n : 실행코드; [break;]
default : 실행코드;
}
*/
public class SwitchEx01_p141 {

	public static void main(String[] args) {
		String s = "lee";
		switch(s) {
		case "kim" : 
		case "hon" : 
		case "lee" : System.out.println("회원입니다");
		break;
		default : System.out.println("비회원입니다");
		}
		System.out.println("------------");
		
		switch(s) {
		case "kim" : System.out.println("회원입니다");
		break;
		case "hon" : System.out.println("회원입니다");
		break;
		case "lee" : System.out.println("회원입니다");
		break;
		default : System.out.println("비회원입니다");
		}
		
		// switch() 조건에는 String형태도 가능함
		char c = 'a';
		switch(c) {
		case 'a' : System.out.println("a입니다");
		break;
		case 'b' : System.out.println("b입니다");
		break;
		case 'c' : System.out.println("c입니다");
		break;
		default : System.out.println("d입니다");
		}
		//switch() 조건에는 char형태도 가능함 
		Random rd = new Random();
		int score = rd.nextInt(6)+1;
		System.out.println("score="+score);
		switch(score) {
		case 1 : System.out.println("1이다");
		break;
		case 2 : System.out.println("2이다");
		break;
		case 3 : System.out.println("3이다");
		break;
		default : System.out.println("4이다");
		}
	}
}
