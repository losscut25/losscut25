package chap02;

import java.util.Scanner;

public class Ex6_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		MyMath mm = new MyMath();
		long result1 = mm.add(a,b);
		long result2 = mm.sub(a,b);
		long result3 = mm.mul(a,b); 
		double result4 = mm.div(a,b);
		long result5 = mm.max(a,b);
		mm.printGugudan(6);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
	}
}

class MyMath {
	void printGugudan(int dan) {
		if(!(2<=dan && dan <=9))
			return; // 입력받은 단(dan)이 2~9가 아니면, 메서드 종료하고 돌아가기
		
		for(int i = 1; i<=9; i++) {
			System.out.printf("%d * %d = %d%n", dan, i, dan*i);
		}
	}
	long add(long a, long b) {
		long result = a+b;
		return result;
	}
	long max(long a, long b) {
		if(a>b)
			return a; // 조건식이 참일때만 실행
		else
			return b; // 조건식이 거짓일 때 실행
	}

	long sub(long a, long b) {return a-b;}
	long mul(long a, long b) {return a*b;}
	double div(double a, double b) {return (double)a/b;}
	
}
