package chap0304;

/* for(초기값;조건식;증감식) {
 *  // 반복실행문
 *  
 */
public class ForEx01_p149 {
	// 전역변수
	public static void main(String[] args) {
		for(int i=0 ; i<10 ; i++) {
//			System.out.print(i + " ");
			System.out.printf("%d\t", i);
		}  // 지역변수
		System.out.println(); // 줄바꿈
		System.out.println("-----------");
		//5 4 3 2 1
		//10번 변수 i 값 출력, 마지막에는 0출력, 1씩 감소
		for(int i=9 ; i>=0 ; i--) {
			System.out.print(i + " ");
		}
	}
}