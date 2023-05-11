package chap06;
// 이 클래스는 p228클래스의 실행 클래스이다.
public class P228main {
	public static void main(String[] args) {
		// p228클래스의 객체를 생성한다
		// 그 객체의 필드값을 출력하여라
//		P228 p = new P228();
//		System.out.println(p.bl); // false
//		System.out.println(p.ch); // ' '
//		System.out.println(p.color); //null
//		System.out.println(p.db); //0.0
//		System.out.println(p.fl); //0.0
//		System.out.println(p.lo); //0
//		System.out.println(p.price); //0
//		System.out.println(p.by); //0
//		System.out.println(p.sh); //0
		
		//Car01클래스를 참조하는 변수선언 및 객체 생성
		//Car01클래스의 색상, 연비필드값을 출력하시오.
		
		Car01 car = new Car01();
		System.out.println(car.color);
		System.out.println(car.fuelEff);
		
	}

}
