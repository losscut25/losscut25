package chap05;

import java.util.Arrays;

//배열복사
// 깊은복사(for문 이용, object clone(); 이용, Arrays.arraycopy();이용, Arrays.copyof();이용)
// Arrays.copyofRange();, System.arraycopy(); 이용

public class ArrayEx06_p195 {
	public static void main(String[] args) {
		int[] oriArr = {11, 12, 13, 14, 15};
		System.out.print("Arrays.toString(): " + Arrays.toString(oriArr));
		System.out.println();
		System.out.println("oriArr = " + oriArr); //주소값 출력 [I@15db9742
		
		//원본 배열의 2배 길이인 새 배열선언
	//	int [] copyArr = new int[];
		int [] copyArr = new int[oriArr.length*2];
		for(int i = 0; i < oriArr.length; i++) {
			copyArr[i] = oriArr[i];
		}
		System.out.println(copyArr); // 주소값 출력 [I@6d06d69c
		System.out.println(Arrays.toString(copyArr)); // [11, 12, 13, 14, 15, 0, 0, 0, 0, 0] 복사된 주소값
		oriArr[0]= 0;
		System.out.println("oriArr주소 = "+ oriArr); // [I@15db9742
		System.out.println("copyArr주소 = "+ copyArr); //[I@6d06d69c
		System.out.println(Arrays.toString(oriArr)); //[0, 12, 13, 14, 15]
		System.out.println(Arrays.toString(copyArr)); // [11, 12, 13, 14, 15, 0, 0, 0, 0, 0]
     // 깊은복사(deep copy) 원본에 변경이 있어도 사본에 영향을 주지 않는다. - for문을 이용
//		System.out.println("배열복사 for문-------------");
		// 2) object.clone(); 이용 -> 주의. 1차원 배열은 깊은복사, 2차원 배열시 얕은복사
		// Object 클래스의 clone()
		System.out.println("배열복사 object.clone():");
		copyArr = oriArr.clone();
		System.out.println("oriArr주소 = "+ oriArr); // [I@15db9742
		System.out.println("copyArr주소 = "+ copyArr); // [I@6d06d69c
		System.out.println(Arrays.toString(oriArr)); // [11, 12, 13, 14, 15]
		System.out.println(Arrays.toString(copyArr)); // [11, 12, 13, 14, 15]
		
		// 3) Arrays.copyof(); 이용
		System.out.println("배열복사 Arrays.copyof():");
		copyArr = Arrays.copyOf(oriArr, oriArr.length-3); // 5개의 값중 2개만 복사(원본배열, 길이);
		System.out.println("oriArr주소 = "+ oriArr); //  [I@15db9742
		System.out.println("copyArr주소 = "+ copyArr); //  [I@7852e922
		System.out.println(Arrays.toString(oriArr)); // [11, 12, 13, 14, 15]
		System.out.println(Arrays.toString(copyArr)); // [11, 12]
		
		// 4) Arrays.copyofRange();이용
		System.out.println("배열복사 Arrays.copyofRange(); :"); 
		copyArr = Arrays.copyOfRange(oriArr, 0, oriArr.length); // 범위값 지정 가능 (1, 3) => 1, 2 등(원본배열, 시작인덱스, 끝인덱스-1)
		copyArr = Arrays.copyOfRange(oriArr, 1, 10); // [12, 13, 14, 15, 0, 0, 0, 0, 0]
		// 3번째 매개
		System.out.println("oriArr주소 = "+ oriArr); //  [I@15db9742
		System.out.println("copyArr주소 = "+ copyArr); //  [I@6d06d69c
		System.out.println(Arrays.toString(oriArr)); // [11, 12, 13, 14, 15]
		System.out.println(Arrays.toString(copyArr)); // [11, 12, 13, 14, 15]
		
		// 5)System.arraycopy(); 이용
		System.out.println("배열복사 System.arraycopy(원본배열, 원본배열시작인덱스, 새배열, 새배열시작인덱스, 복사할 개수); :");
//		System.arraycopy(oriArr, 0, copyArr, 0, 5);
		System.arraycopy(oriArr, 2, copyArr, 6, 3);
		System.out.println(Arrays.toString(oriArr)); // [11, 12, 13, 14, 15]
		System.out.println(Arrays.toString(copyArr)); // [11, 12, 13, 14, 15, 0, 0, 0, 0, 0]

//		for(int i = 0; i < oriArr.length; i++) {
//			copyArr[i] = oriArr[i];
//		}
//		System.out.println();
//		System.out.println("-배열복사 : 새배열명 = 원본배열명");
//		copyArr = oriArr; // 새배열명 = 원본배열명 -> 주소가 복사됨(얕은 복사/shallow copy)
//		// 주소가 넘어가서 copy의 값이 ori의 값과 같아짐.(원본과 사본의 값이 같아짐)
//		System.out.println(Arrays.toString(copyArr));
//		oriArr[0] = 7777;
//		System.out.println(Arrays.toString(oriArr)); // [7777, 12, 13 ...]
//		System.out.println(Arrays.toString(copyArr)); // 원본의배열주소가 copy에 있는 배열주소로 들어가면서 copy의 주소는 원본의 주소로 바뀌게 됨
		
		
	}
}