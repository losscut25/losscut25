package chap06;

//이 클래스는 car02의 실행클래스이다
public class Car02Main {
	public static void main(String[] args) {
		// Car02 객체생성하여 참조변수 car1에 할당
		// Car02 color값 확인
		Car02 car = new Car02();
//		System.out.println(car.color); // 에러발생
		//	The field Car02.color is not visible
		String brd = car.getBrd(); // private 접근제어자로 인해 필드값 사용이 제한되면 get메서드를 통해서 출력함.
		System.out.println(brd);
		double fl = car.getFl();
		System.out.println(fl);
		int rpm = car.getRpm();
		System.out.println(rpm);
		char ai = car.getAi();
		System.out.println(ai);
		boolean navi = car.getNavi();
		System.out.println(navi);
		car.setBrd("좋은차");
		System.out.println(car.getBrd());//set값 출력 get이용
		car.setFl(14.5);
		System.out.println(car.getFl());
		car.setRpm(12000);
		System.out.println(car.getRpm());
		car.setAi('N');
		System.out.println(car.getAi());
		car.setNavi(false);
		System.out.println(car.getNavi());
	}

}
