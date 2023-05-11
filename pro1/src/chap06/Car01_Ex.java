package chap06;


// 이 클래스는 Car01의 실행클래스
/* 클래스타입 참조변수선언
 변수선언 = new 클래스명();
/* 클래스타입 참조변수;
 클래스타입 참조변수명\\ = new 클래스명();
 */
public class Car01_Ex {

	public static void main(String[] args) {
		Car01 myCar = null; //참조변수선언
//		System.out.println(myCar); // null
		myCar = new Car01(); //객체(object) 생성
		System.out.println(myCar); // 객체 주소 chap06.Car01@15db9742
		System.out.println(myCar.color);
		myCar.color = "blue";
		System.out.println(myCar.color);
		myCar.pOn();
		System.out.println("최초 speed=" + myCar.curspd);
		myCar.spUp();
		System.out.println("증속후의 speed = " + myCar.curspd);
		myCar.spDown();
		System.out.println("감속후의 speed = " + myCar.curspd);
		myCar.pOff();
		
		System.out.println("----------------");
		System.out.println();
		
		Car01 car = new Car01();
		System.out.println(car); // chap06.Car01@6d06d69c
		System.out.println(car.color);
		System.out.println(car.fuelEff);
		car.fuelEff = 21.5;
		System.out.println(car.fuelEff);
		
		
	}

}
