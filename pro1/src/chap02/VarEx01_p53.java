package chap02;

//변수(Variable) : 
public class VarEx01_p53 {
	public static void main(String[] args) {
		// 변수선언 데이터타입 변수명
		// 변수의 초기값 설정 변수명 = 초기값;
		
		// 변수선언 및 초기값설정 데이터타입 변수명 = 초기값;
		String hour = "5시"; //변수 선언 및 초기값 설정
		String minute = "30분";
		System.out.println(hour + " " + minute); // 5시 30분
		System.out.println("5시");
		System.out.println(hour); // 5시
		// + : 문자열 연결연산자 
		// 변수명 + 변수명
		System.out.println(hour + minute); // 5시30분
	}
}