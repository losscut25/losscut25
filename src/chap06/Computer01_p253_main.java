package chap06;

public class Computer01_p253_main {
	public static void main(String[] args) {
		//Computer01_p253 클래스의 객체 생성
		
		//Computer01_p253의 add메서드를 콜
		
		Computer01_p253 cp = new Computer01_p253();
		
// 	int a = cp.add(10); // 	The method add(int, int) in the type Computer01_p253 is not applicable for the arguments (int)
		// 매개변수가 일치해야한다.
		
//		int b = cp.add(10.3, 10);//The method add(int, int) in the type Computer01_p253 is not applicable for the arguments (double, int)
		//a cannot be resolved to a variable 메서드의 매개변수 타입이 일치해야한다.
//		int a = cp.add(30, (byte)100); //The method add(int, byte) in the type Computer01_p253 is not applicable for the arguments (int, int)
		//-> 메서드의 타입과 매개변수의 타입이 일치해야한다.
//		System.out.println(a);
		
		int r0 = cp.add(10, 90);
		System.out.println("add(10, 90) = " + r0);//add(10, 90) = 100

		r0 = cp.sum2(10, 90);
		System.out.println("sum2(10, 90) = " + r0);//sum2(10, 90) = 100
		
		r0 = cp.sum2(10, 90, 100);
		System.out.println("sum2(10, 90, 100) = " + r0);//sum2(10, 90, 100) = 200
		
		r0 = cp.sum2(10, 90, 100, 150);
		System.out.println("sum2(10, 90, 100, 150) = " + r0);//sum2(10, 90, 100, 150) = 350
		
		
		}

}
