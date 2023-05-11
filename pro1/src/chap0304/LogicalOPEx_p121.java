package chap0304;

/*논리연산자
or : 모든 조건이 f이면 f => 단 1개의 조건이라도 참이면 T
|| / |
*/
public class LogicalOPEx_p121 {

	public static void main(String[] args) {
		if(true && true) {
			System.out.println("&&연산다-둘다 true");
		if(true & true) {
			System.out.println("&&연산다-둘다 true");
		if(false && true) {
			System.out.println("&&연산다-거짓");
		}
			else {
				System.out.println("else문");
			}
		if(false & false) {
			System.out.println("&&연산다-둘다 true");
			}
		else {
			System.out.println("else문");
		}
				}

			}
		}
}
