package chap0304;

//for문 - 합계구하기
public class ForEx02_p151 {

	public static void main(String[] args) {
		int sum = 0; // 총합을 저장하기 위한 변수 선언 및 초기화
		// 데이터타입 변수명[=초기값]
		// 1부터 5까지의 정수의 합을 출력하시오.
		for (int i = 1; i <6; i++) {
			sum += i;
		}
		System.out.println("총합 = " + sum); // 15
	}
}