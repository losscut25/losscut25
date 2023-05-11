package chap02;

/* 데이터타입
 * -참조타입(reference type) : 주소저장 => 배열(Array), Class의 객체(object)
 * -기본타입(primitive type) : 값저장 
 * (정수(byte(1), short(2), int(4), long(8)), 실수(float(4), double(8)), 문자(char(2), String), 논리형(true, false))
 * 
 * 형변환
 * - 자동형변환 : 결과값이 큰 데이터 타입으로 형변환이 이루어짐
 * - 강제형변환 : 결과값에 대한 데이터의 값을 임의로 바꿔야 될 경우 사용하는 기능임.
 * - 리터럴형변환 : 값 뒤에 F, L, f, l 등을 명시해줌
 */

// 연산에서의 문자열 자동타입변환
public class VarEx08_p82 {

	public static void main(String[] args) {
		int r1 = 10*10;
		System.out.println("int r1 =" + r1);
		
		// int r2 = 10+10+"99"; 에러
		String r2 = 10+10+"99";
		System.out.println("String r2 =" + r2); //2099
		
		r2 = 10+"99"+10;
		System.out.println(r2); //109910
		
		r2 = "99"+10+10;
		System.out.println(r2); //991010
		
		r2 = "99"+(10+10);
		System.out.println(r2); //9920
		
		//-------------------------
		//문자열(String)을 기본타입(byte,short,int,long,float,double)으로
		//래퍼클래스(wrapper) : 기본 타입의 값을 내부에 두고 포장 p.502
		int price = 9900; //가격
		int cnt = 5; //수량
		System.out.println("총 구매가격 =" + price*cnt); //49500
		
		String stcnt = "5";
		System.out.println("총 구매가격 =" + price*Integer.parseInt(stcnt)); //String -> int로 형변환
		
		System.out.println("총 구매가격 =" + price*Byte.parseByte(stcnt)); //String -> Byte로 형변환
		
		System.out.println("총 구매가격 =" + price*Short.parseShort(stcnt)); //String -> short로 형변환
		
		System.out.println("총 구매가격 =" + price*Long.parseLong(stcnt)); //String -> long로 형변환
		
		System.out.println("총 구매가격 =" + price*Float.parseFloat(stcnt)); //String -> float로 형변환 49500.0
		
		System.out.println("총 구매가격 =" + price*Double.parseDouble(stcnt)); //String -> double로 형변환 49500.0
		
		//-------------------------------------------
		//String.valueOf(기본타입값) : 기본타입 -> String으로 강제 형변환
		//p.498
		String s1 = String.valueOf(10);
		System.out.println(s1); //문자열로 출력됨.
	}

}
