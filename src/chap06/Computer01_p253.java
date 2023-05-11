package chap06;

public class Computer01_p253 {
	//필드
	//[접근제어자][제어자] 타입 필드명;
	
	//생성자
	//[접근제어자] 클래스명(매개변수리스트){}
	
	//메서드
	//[접근제어자][제어자] 레턴유형 메서드명(매개변수리스트){}
	int add(int a, int b) {
		return a+b;
	}
	int sum2(int... values) {
		int sum = 0;
		for(int i = 0; i<values.length ; i++) {
			sum += values[i];
		}
		return sum;
	}
}
