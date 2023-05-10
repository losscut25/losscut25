package chap02;

import java.io.IOException;

//키보드에서 입력된 내용을 변수에 저장하기 : System.in.read()
public class readEX01_p93 {

	public static void main(String[] args) throws IOException {
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println(keyCode);
		
		keyCode = System.in.read();
		System.out.println(keyCode); // 13 캐리지리턴
		
		keyCode = System.in.read();
		System.out.println(keyCode); // 10 라인리턴
}
}