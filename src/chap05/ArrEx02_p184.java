package chap05;

/*배열의 초기값(기본타입) 
정수[] : byte, short, int, long // 기본값 : 0, 0L
실수[] : float, double // 기본값 : 0.0, 0.0f
char[] 기본값 : 공백(\u0000) 
boolean[] 기본값 : false
클래스의[] 기본값 : null ->String[]의 기본값 : null
*/
public class ArrEx02_p184 {

	public static void main(String[] args) {
		int[] a1 = new int[3];
		for(int i = 0; i < a1.length; i++) {
			System.out.println("int배열 a1[" + i + "] = "+ a1[i]);
		}
		System.out.println("------------------");
		System.out.println();
		
		byte[] a2 = new byte[3];
		for(int i = 0; i < a2.length; i++) {
			System.out.println("byte배열 a2[" + i + "] = "+ a2[i]);
		}
		System.out.println("------------------");
		System.out.println();
		
		long[] a3 = new long[3];
		for(int i = 0; i < a3.length; i++) {
			System.out.println("long배열 a3[" + i + "] = "+ a3[i]);
		}
		System.out.println("------------------");
		System.out.println();
		
		float[] a4 = new float[3];
		for(int i = 0; i < a4.length; i++) {
			System.out.println("float배열 a4[" + i + "] = "+ a4[i]); // 0.0
		}
		System.out.println("------------------");
		System.out.println();
		
		double[] a5 = new double[3];
		for(int i = 0; i < a5.length; i++) {
			System.out.println("double배열 a5[" + i + "] = "+ a5[i]); // 0.0
		}
		System.out.println("------------------");
		System.out.println();
		
		String[] a6 = new String[3]; // 배열에 따른 자동 초기값 할당(p184)	
		for(int i = 0; i < a6.length; i++) {
			System.out.println("String배열 a6[" + i + "] = "+ a6[i]); //null
		}
		System.out.println("------------------");
		System.out.println();
	}

}
