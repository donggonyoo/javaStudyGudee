package chap3.hard_test;

import java.util.Scanner;

/*
 * 밑변과 높이를 입력받아 삼각형의 넓이를 출력하기. 소숫점을 표시
 * [결과]
 * 밑변의 길이
 * 10
 * 높이의 길이
 * 20
 * 
 * 넓이=100.0
 */
public class Test5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("밑변 : ");
		int w = scan.nextInt();
	
		System.out.println("높이 : ");
		int h = scan.nextInt();
		
		double size = (double)(w*h)/2;
		System.out.println("넓이 : "+size);
		

	}
}
