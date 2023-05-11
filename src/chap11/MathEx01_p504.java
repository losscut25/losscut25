package chap11;

/* Math클래스 : 수학계산에 사용할 수 있는 메서드, 필드를 제공 

 */
public class MathEx01_p504 {

	public static void main(String[] args) {
		double v = Math.random();
		System.out.println(v);
		
		int v2 =(int)Math.random();
		System.out.println(v2);
		System.out.println(Math.abs(10));
		System.out.println(Math.abs(-10));
		
		double v3 = Math.PI;
		System.out.println("Math.PI = " + v3);
		System.out.println(Math.ceil(v3)); // 4.0 -올림
		System.out.println(Math.floor(v3)); // 3.0 -내림
		System.out.println(Math.round(v3)); // 3 - long 패키지임 반올림
	}
	

}
