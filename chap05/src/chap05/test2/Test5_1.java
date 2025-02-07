package chap05.test2;

import java.util.Arrays;
import java.util.Scanner;

/*
11*11 크기의 사각형이 있다고 가정할때 다음 결과를 출력되도록 프로그램 작성하기
                        c         b
X         X             00       0.10
 X       X              11       1.9  
  X     X               22       28  
   X   X                33       37
    X X                 44       46
     X                       55 
    X X                 64       66 
   X   X                73       77 
  X     X               82       88
 X       X              91       99
X         X            10.0     10.10   

 */
public class Test5_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int size=0 ;
		while(true) {
		if(size%2==0) {
			System.out.print("크기를 입력 : ");
			size= scan.nextInt();
			System.out.println("홀수만 입력하세요");
		}else {
			break;
		}}
		
			String[][] a =  new String[size][size];
			int b=0;
			int c=(a.length-1);
			
			//String 배열의 초기화는 필수임
			//초기화안할시 다 null값이므로 다른것을 찍을 수 없게됨
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[0].length; j++) {
					a[i][j] = " ";
				}
				
			}
			
			for (int i = 0; i <= a.length; i++) {
				for (int j = 0; j < a[0].length; j++) {
					if(j==b || j==c) {
						a[i][j] = "X";
					}
				}b++;c--;	
			}
			
			
			
			
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[0].length; j++) {
					System.out.print(a[i][j]+" ");
				}System.out.println();
				
			}
		}
		
		
		
		
		

	
}
