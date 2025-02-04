package chap4;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
 *반복문 :  조건식의 결과가참인동안 문장 실행
 *for문(초기값 : 조건문 : 증감식){
 *	조건문이 참인동안 실행되는 문장들
 *	}
 *조건문의결과가 거짓이면 종료
 *
 *=========while문=================
 *while(조건문){
 *	조건문의결과가 참인동안 실행
 *	} 
 *조건문의 결과가 거짓이면 반복문종료 
 *처음부터 조건문의결과가거짓이면 문장실행 X
 *
 *=========do-while문===============
 *do{
 *	조건문의결과가 참인동안 실행( 무조건 한번 실행됨 )
 *	} while(조건);
 * *조건문의 결과가 거짓이면 반복문종료 
 * 조건문과상관없이 한번은 실행
 */
public class LoopEx01 {
	public static void main(String[] args) {
		System.out.println("반복문없이 1~5 출력하기");
		System.out.print(1);
		System.out.print(2);
		System.out.print(3);
		System.out.print(4);
		System.out.println(5);
		
		for (int i = 1; i <= 5; i++) {//i :지역변수
			System.out.print(i);	
			if(i==5) {
				System.out.println("");
			}
		}
		/*
		 * 1)int i = 1;
		 * 2) i<=5 : T    <----------| 거짓인경우 반복문 종료
		 * 3)	System.out.print(i); |	
		 * 4) i++;  //6       -------|
		 */
		
		
		int count=0; //전역변수 count
		while(true) {
			count++;
			System.out.print(count);
			if(count==5) { //count==5일때 \n 후 반복문탈출
				System.out.println();
				break;}
		}
		ArrayList<Integer> arrayList = new ArrayList<Integer>(List.of(1,2,3,4,5));
		for (Integer integer : arrayList) {
			System.out.print(integer);
		}
		
		
		
	}

}
