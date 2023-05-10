package javaEx;

class MyPoint extends Object{ //Object클래스 자동 추가
	int x;
	int y;
}

//class Circle extends MyPoint { // 상속
//	int r;
//	
//}

class Circle { // 포함
	MyPoint p; //= new MyPoint(); // 참조변수의 초기화
	int r;
	Circle () { // 생성자를 만들어줘야 함.
		p = new MyPoint();
	}
}

public class InheritanceTest {

	public static void main(String[] args) {
		Circle c= new Circle();
		System.out.println(c.toString());
//		c.p.x = 1;
//		c.p.y = 2;
//		c.r = 3;
//		System.out.println("c.p.x = "+c.p.x);
//		System.out.println("c.p.y = "+c.p.y);
//		System.out.println("c.r = "+c.r);
	}

}
