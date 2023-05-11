package chap05;

import java.util.Arrays;

//Arrays클래스 : 배열을 다루는데 유용한 여러 메서드를 제공
//java.util.Arrays 패키지에 포함되어있음
//Arrays클래스의 모든 메서드는 static메서드 이다. -> (객체 생성하지 않고)클래스명.메서드명

public class ArrayEx05 {
	public static void main(String[] args) {
	// int형 숫자데이터를 저장하기 위한 배열 arr1을 선언	
	// 11 12 13 14 15값을 초기값으로 저장
	// for문 이용 출력
		int[] arr = {11, 12, 13, 14, 15};
		System.out.print("Arrays.toString(): " + Arrays.toString(arr)); // 문자열 타입의 배열을 나타내기에 +99 를 하면 문제 뒤에 99가 붙는 형식으로 결과 값이 나옴
		// toString메소드 : 배열의 값들(element,요소)을 [] 문자안에 넣어서 String타입으로 리턴
		// 배열 arr 이라는 주소값으로 표현 -> 객체의 주소가 있음
		arr[5] = 55; // 에러발생 -> index범위 밖을 지정했기 때문에 발생
		// java.lang.ArrayIndexOutOfBoundsException
		
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("----for문 이용 출력----");
		
	// 향상된 for문 이용 출력
		for(int i : arr) {
			System.out.print(i+ " ");
		}
		System.out.println();
		System.out.println("-----향상된 for문 이용 출력-----");

	}
}