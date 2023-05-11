package javaEx;

public class Ex7_7 {
	public static void main(String[] args) {
		Car c = new Car();
		FireEngine fe = (FireEngine)c; // 형변환 실행 에러 java.lang.ClassCastException: 
		fe.water(); // 컴파일 오케이  형변환은 가능했기에 실행은 된다. 
	}

}
class Car {
	String car;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrr~~");
	}
	void stop() {
		System.out.println("stop!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water!!!");
	}
	
}
