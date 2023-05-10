package chap02;

//모니터로 변수값 출력하기
/* 정수 %d / 실수 %f / 문자열 %s
 * \n \t %%
 */
public class printf_p01 {

	public static void main(String[] args) {
		//printf("형식문자열", 값, 값2, ..., 값n)
		int v = 123;
		System.out.printf("정수 \t%d\n", v); //정수 	123
		System.out.printf("주소:%d번지\n", v); // 주소:123번지
		System.out.printf("가격:%d원\n", v); // 가격:123원
		System.out.printf("가격:%5d원\n", v); // 가격:    123원
		System.out.printf("가격:%-5d원\n", v); // 가격:123     원
		System.out.printf("가격:%05d원\n", v); // 가격:00123원
		
		System.out.println(); //빈줄
		//원의 넓이 = 반지름*반지름*3.14
		int r = 10;
		double area = r*r*3.14;
		System.out.printf("반지름:%d", r);
		System.out.printf("\n원의 넓이 =%f", area); // 314.000000
		System.out.printf("\n원의 넓이 =%10.2f", area); // 원의 넓이 =    314.00
		
		String str = "원의 넓이";
		System.out.printf("\n반지름:%d인 ", r);
		System.out.printf("%s는 =%7.2f", str, area); 	// 반지름 10인 원의 넓이는
	
		
	}
}
