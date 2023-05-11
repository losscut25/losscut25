package chap0304;
//홀짝수
//if문		if(조건)(조건참일경우)else(조건x경우)}
//삼항연산자	조건?조건 참일경우 : 거짓일 경우
public class IfEx02_p125 {

	public static void main(String[] args) {
		// 0.0 이상이면서 1.0미만의 double타입 실수인 난수
		//(int)(Math.random()*최대값)+최소값
		//(int)(Math.random()*6)+1 -> 주사위 1이상 6이하
		//(int)(Math.random()*45)+1 -> 로또번호 1이상 45이하
		int n = (int)(Math.random()*100);
		String s = "짝수";
		String d = "홀수";
		//연산자 우선순위 : 단항(높다) 이항 삼항 대입(낮다)
		//산술연산자(높다) 비교연산자(낮다)
		if(n%2 == 0) { //수를 2로 나눈 나머지가 0일 경우 짝수
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		String sd = (n%2 == 0) ? s : d;
		System.out.println(sd);
	}
}
