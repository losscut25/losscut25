package chap0304;
/*
 * do while문 : 조건을 충족하지 않아도 최소한 1번은 실행
 * do { 
  // 반복실행코드
  }while(조건);
 */
//while문 - 합구하기

public class WhileEx02_p155 {

	public static void main(String[] args) {
		//do while문
		//1 2 3 4 5
		int k = 1;
		do {
			System.out.println(k); k++; //전역변수에서 지정한 값은 어떠한 조건에도 제약받지 않고 그 값을 출력함.
		}while(k<6);
		
//1부터 5까지의 합을 구하시오.
		int sum = 0; // 합을 저장하기 위한 변수 선언 및 초기화
		int n = 1; // 계산의 대상이 되어지는 변수선언 및 초기화
		while(n<6) {
			sum += n;
			n++;
		}
		System.out.println("sum = " + sum);
	}

}
