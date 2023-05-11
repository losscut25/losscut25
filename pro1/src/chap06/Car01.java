package chap06;

//클래스
/* [접근제어자] [제어자] class 클래스명 {
	//field : data
	//[접근제어자][제어자] 타입필드명[=초기값];
constructor(생성자) : 객체생성.필드초기화 주로 사용
[접근제어자] 클래스명(매개변수리스트){

}
//method
	//[접근제어자][제어자] 리턴유형 메서드명(매개변수리스트){};
*/
public class Car01 {
/* AI탑재유무 - 'y' 'n
RPM - 0~10000
브랜드 - "볼보" "테슬라"
*/ 
	//고유데이터
	String color = "red"; //색상 - red
	String brd;
	double fuelEff = 10.5;
	int rpm;
	char ai;
	boolean navi; //네비게이션 유무 - true false
	
	//상태데이터
	int curspd = 50;
	int maxspd;	
	//시동(기능 동작)
	void pOn() {
		System.out.println("powerOn() 호출");
	}	
	void pOff() {
		System.out.println("poweroff() 진입");
	}	
	//속도조절
	void spUp () {
		curspd++;
		System.out.println("speedUp("+curspd+")" );
	}	
	void spDown() {
		curspd--;
		System.out.println("speedDown("+curspd+")");
	}	
	
}
