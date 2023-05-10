package chap05;

//다차원배열 : 행과 열로 구성된 배열을 2차원 배열이라 한다.
//행 : tuple, row, 카디널리티
//열 : 칼럼(column), 차수(degree) 
public class ArrayEx04_p190 {

	public static void main(String[] args) {
		int[][] scores = {
						{10, 20, 30, 40, 50},
						{20, 30, 40, 50, 60},
						{30, 40, 50, 60, 70}
						};
							
		System.out.println("scores = "+scores); //[[I@15db9742
		System.out.println("scores.length = "+scores.length); // 3
		
		System.out.println("scores[0].length = "+ scores[0].length); //[I@6d06d69c // 5
		System.out.println("scores[1] = "+ scores[1]); //[I@7852e922
		System.out.println("scores[2] = "+ scores[2]); //[I@4e25154f
		for(int i = 0; i<scores.length; i++) {
			System.out.println("scores["+i+"] 일때");
			for(int j =0; j<scores[i].length; j++) {
				System.out.println("scores["+i+","+j+"]=" +scores[i][j]);
			}
			System.out.println("scores["+i+"].length = "+ scores[i].length); 
		}
		
		
//		int[] korScores = {20, 30, 40, 50, 60};
//		System.out.println("korScores = "+korScores);
//		System.out.println("korScores.length = "+korScores.length);
//		
	}

}
