package chap0304;

//break에 속한 반복문을 종료
//continue 반복문을 멈춤
public class Break_ContinueEx_p156 {

	public static void main(String[] args) {
		int j = 1;
		while(j<11) { // 5<11
			j++;
			System.out.println(j);
			if(j==5) {
				System.out.println("i는 5입니다.");
				continue; //반복문을 종료 하지만 해당 시점만 종료 그 이후는 계속 이어짐
			}

		}
		
//		int i = 1;
//		while(i<11) {
//			System.out.println(i);
//			if(i==5) {
//				System.out.println("i는 5입니다.");
//				break; //반복문을 종료
//			}
//			i++;
//		}
	}
}