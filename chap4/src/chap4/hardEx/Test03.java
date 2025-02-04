package chap4.hardEx;

import java.util.Scanner;

/*
 삼각형의 높이를 입력받아서 *로 삼각형 출력하기
  [결과]
  삼각형의 높이
  3

   *      1       3
  ***     2      234
 *****    3     12345
 */
public class Test03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("삼각형 높이 : ");
		int a = scan.nextInt();

		for (int k = 1; k <= a; k++) {
			
			for (int i = 1; i <= a-k; i++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (k*2)-1; j++){
				System.out.print("*");

			}
			System.out.println("");
		}

		//그냥 개어려움
		//   i= 1    j =   5 4 3 2 1
	}
}
