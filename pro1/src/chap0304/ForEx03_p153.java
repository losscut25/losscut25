package chap0304;

public class ForEx03_p153 {
//for문 - 구구단 출력
/* 출력결과
 * 5단 출력
 */	
	public static void main(String[] args) {
		int mul = 0;
		int dan = 5;
		System.out.println("------"+dan+"단 출력 --------");
			for(int i = 1; i<10; i++) {
				mul = dan*i;
				System.out.println(dan+"*"+i+"="+mul);
			}
	}

}
