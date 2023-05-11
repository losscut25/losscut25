package chap05;

//향상된 for문 => 배열(Array) 또는 컬렉션(collection)에서 주로 사용
/*
 for(타입 변수명 : 배열명 또는 컬렉션명) {
  //반복실행코드
 }
 */
public class ArrayEx03_p197 {

	public static void main(String[] args) {
		int sum = 0;
		// 10, 20, 30, 40, 50을 정수배열 arr1에 할당한 후 출력
		System.out.println("일반 for문 배열값 출력---");
		int[] arr1 = {10, 20, 30, 40, 50};
		for(int i = 0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("향상된 for문 배열값 출력---");
		for ( int r : arr1) { 
			sum += r; // int배열 arr1에 할당된 모든 값의 총합 출력
		}
		System.out.println("합계 = "+ sum);
		double arg = (double)sum/arr1.length; // 평균구하기
		System.out.println("평균 = " +arg);
	}

}