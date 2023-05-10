package chap05;

/*배열(Array) : 동일 타입의 데이터를 연속된 공간에 나열,
각 데이터에 index를 부여해 놓은 자료구조
*배열선언 및 값 할당
타입[] 변수명 = {값0, 값1, 값2, ..}; 또는 타입 변수명[];
타입[] 변수명 = new 타입[]{값0, 값1, 값2, ..};
타입[] 변수명 = new 타입[길이];
변수명[인덱스 번호] = 값;
*배열의 길이 : 배열명.length
*/
public class ArrayEx01_p178 {

	public static void main(String[] args) {
		int[] arr1 = new int[3];
		System.out.println("arr1 = " + arr1); // [I@15db9742
		System.out.println("arr1.length = "+arr1.length); // 3
		System.out.println("---------------------------");
		
		int[] arr2 = {23, 45, 67, 89};
		System.out.println("arr2 = " + arr2); // [I@6d06d69c
		System.out.println("arr2.length = "+arr2.length); // 4
		System.out.println("arr2[0] = " +arr2[0]); // 23
		System.out.println("arr2[1] = " +arr2[1]); // 45
		System.out.println("arr2[2] = " +arr2[2]); // 67
		System.out.println("arr2[3] = " +arr2[3]); // 89
		System.out.println("--------------------------");
		
		int[] arr3 = new int[] {12, 23, 44, 56, 68};
		System.out.println("arr3 = " + arr3);//	[I@7852e922
		System.out.println("arr3.length = "+arr3.length); // 배열의 길이 5
		for (int i = 0; i <arr3.length; i++) {
//			System.out.println("arr3 [" + i + "] = " + arr3[i]);
			System.out.println("arr3 [" + i + "] = " + arr3[i]*10);  //arr3배열안에 모든값에 기존값 *10로 변경
		}
		System.out.println("-------------------------");
		//값을 변경
		//arr3의 인덱스 0의 값을 10으로 변경
		arr3[0] = 10;
		//arr3의 인덱스 1의 값을 20으로 변경
		arr3[1] = 20;
		arr3[2] = 400;
		arr3[3] = 560;
		arr3[4] = 680;
		//출력
		System.out.println("변경 후 arr3[0] = " + arr3[0]);
		System.out.println("변경 후 arr3[1] = " + arr3[1]);
		System.out.println("변경 후 arr3[2] = " + arr3[2]);
		System.out.println("변경 후 arr3[3] = " + arr3[3]);
		System.out.println("변경 후 arr3[4] = " + arr3[4]);
		
		for(int i = 0; i < arr3.length; i++) {
			arr3[i] *= 10; 
			System.out.println("arr3 [" + i + "] = " + arr3[i]); //arr3배열안에 모든값에 기존값 *10로 변경

		}
		
	}

}
