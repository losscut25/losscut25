package chap0304;

/*  증감연산자
 *  ++변수 / 1씩 증가
 *  변수++ /
 *  --변수 / 1씩 감소
 *  변수--
 */
public class IDEx01_p112 {
	public static void main(String[] args) {
		// 변수 x, y, z 의 값을 출력하시오.
		int x = 10;
		int y = 20;
		int z;
		
		System.out.println("초기x = "+x); // 10
		System.out.println("초기y = "+y); // 20
		
		x++; //10
		++x; //12
		System.out.println("1)x = "+x); // 12
		
		z = x++; // 12++
		System.out.println("2)z = "+z); // 12
		
		z = ++x; // 14
		System.out.println("3)z = "+z); // 14
		
		z = ++x; // 15
		System.out.println("4)z = "+z); // 15
		
		y--; //20
		System.out.println("5)y = " +y); //19
		--y; //18
		System.out.println("6)y = " +y); //18
		
		z = ++x + y++; //18+16
		System.out.println("7) z = " +z); // 34
		System.out.println("7) x = " +x); // 16
		System.out.println("7) y = " +y); // 19
		
		
	}

}
