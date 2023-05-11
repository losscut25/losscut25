package chap11;

import java.util.Random;

//Random클래스
public class RandomClassEx {

	public static void main(String[] args) {
		// long타입의 변수 seed 
		// 생성자 seed가 동일하면 동일한 난수를 구한다.
		Random rd1 = new Random(System.currentTimeMillis());
		System.out.println(rd1.nextInt());
		//객체생성
		//클랙스타입 변수명 = new 클래스명();
		Random rd = new Random();
		long v1 = rd.nextLong();
		System.out.println("nextLong():" + v1);
		
		float v2 = rd.nextFloat();
		System.out.println("nextFloat():" + v2);
		
		double v3 = rd.nextDouble();
		System.out.println("nextDouble():" + v3);
		
		boolean v4 = rd.nextBoolean();
		System.out.println("nextBoolean():" + v4);
		
		System.out.println("");
		for(int i = 0; i<3; i++) {
			System.out.println("rd.nextInt():" + rd.nextInt(20));
			// 0이상 ~ 20미만
		}
		for(int i = 0; i<3; i++) {
			int v = rd.nextInt();
			System.out.println("nextInt():" + v);
			}
		}
}
