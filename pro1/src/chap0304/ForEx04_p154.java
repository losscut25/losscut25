package chap0304;

public class ForEx04_p154 {
//for문 - 구구단 출력
/* 출력결과
 * 5단 출력
 */	
	public static void main(String[] args) {
//		int mul = 0;
//		int dan = 5;
//			for(int i = 1; i<10; i++) {
//				mul = dan*i;
//				System.out.println("  " + dan+"*"+i+"="+mul);
//			}
		for(int i = 2; i <10; i++) {
			System.out.println("------"+i+"단 출력 --------");
			for(int j = 1; j<10; j++) {
				System.out.println("  "+i+"*"+j+"=" + i*j);
			}
		}
	}

}
