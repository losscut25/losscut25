package chap0304;

import java.util.Scanner;

/* if문
  if(조건) {
    // 조건 만족시 실행코드
     } else if(조건2){
     //조건2 만족 시 실행코드
     } else {
     // 위의 모든 조건만족x 실행코드
     }
     비교연산자
     a==b a는 b와 일치한다
     a!=b a는 b와 불일치
     a>b a는 b보다 크다.(초과)
     a>=b a는 b보다 크거나 같다.(이상)
     a<b a는 b보다 작다.(미만)
     a<=b a는 b보다 작거나 같다.(이하)
     논리연산자 : true, false
     and && / &
     or || / |
*/ 
public class IfEx01_p135 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		String s = "";
		//100이하 90점 이상이면 A학점
		//90점 미만~80점 이상이면 B학점
		//80점 미만~70점 이상이면 C학점
		//70점 미만~60점 이상이면 D학점
		//그외 F학점
		
		//70점 이상이면 합격
		if(score<=100 && score>=90) {
			s = "A";
		}else if(score<90 && score>=80) {
			s = "B";
		}else if(score<80 && score>=70) {
			s = "C";
		}else if(score<70 && score>=60) {
			s = "D";
		}else {
			s = "F";
		}
		System.out.println("-----------------------");
		System.out.println(s+"학점");
	}
}