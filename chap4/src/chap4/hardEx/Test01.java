package chap4.hardEx;

import java.util.Scanner;

/*
 * 년도를 입력받아 윤년 계산하기
 * 4로 나누어 떨어지고, 
 *     100으로 배수가 아니거나, 
 *     400의 배수는 
 * 윤년
 * 그외는 평년
 * [결과]
 * 년도 입력 : 2000
 * 윤년
 */
public class Test01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i <3; i++) {
			System.out.print("년도 입력 : ");
			int year = scan.nextInt();
			if(year%4==0 && (year%100!=0 || year%400==0)) {
				System.out.println("윤년");
			}
			else {
				System.out.println("평년");
			}

		}


	}
}
