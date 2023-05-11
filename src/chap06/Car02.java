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
public class Car02 {
/* AI탑재유무 - 'y' 'n
RPM - 0~10000
브랜드 - "볼보" "테슬라"
*/ 
	//고유데이터
	private String color = "red"; //색상 - red
	private String brd = "volvo";
	private double fuelEff = 10.5;
	private int rpm = 10000;
	private char ai = 'Y';
	private boolean navi = true; //네비게이션 유무 - true false
	
	//상태데이터
	private int curspd = 50;
	private int maxspd;	
	
	//brand필드의 값을 변경 setter메서드 선언
	public void setBrd(String brd) {
		this.brd = brd;	
	}
	public void setFl(double fuelEff) {
		this.fuelEff = fuelEff;	
	}
	public void setRpm(int rpm) {
		this.rpm = rpm;	
	}
	public void setAi(char ai) {
		this.ai = ai;	
	}
	public void setNavi(boolean navi) {
		this.navi = navi;	
	}
	
	
	
	//brand필드의 값을 외부에 제공 getter메서드 선언
	public String getBrd() {
		return brd;
	}
	public double getFl() {
		return fuelEff;
	}
	public int getRpm() {
		return rpm;
	}
	public char getAi() {
		return ai;
	}
	public boolean getNavi() {
		return navi;
	}
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
