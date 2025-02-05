package chap05;

import java.util.Arrays;

/*
 * 로또번호생성
 * 1~45 까지의 값을 저장하는 배열생성
 * 배열을 섞는다  , 정렬(sort)
 */
public class ArrayEx03 {
	public static void main(String[] args) {
		
		int[] balls = new int[45];
		int[] lotto = new int[6];
		
		
		for (int i = 0; i < 45; i++) {
			balls[i] = (i+1);
		}
		System.out.println(Arrays.toString(balls));
		
		for (int i = 0; i < 1000; i++) {
			int f = (int)(Math.random() * 45 );
			int t = (int)(Math.random() * 45 );
			//swap 알고리즘 양 값 바꾸기
			int temp = balls[f];
			balls[f] = balls[t];
			balls[t] = temp; 
			//하나의 변수를 두어 중간에서 섞는역할
			//랜덤한 인덱스 값 추출후 섞기
		}
		System.out.println(Arrays.toString(balls));
		
		//lotto 번호선택 0~5 번 인덱스까지
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = balls[i];
		}
		System.out.println("** 로또 **");
		System.out.println(Arrays.toString(lotto));
		//정렬(sort)
	
		for (int i = 0; i < lotto.length; i++) {
			boolean sortable = true;
			for (int j = 0; j < lotto.length-1-i; j++) {
				/*lotto.length-1-i 로설정한 이유
				 * 일단 j+1 과비교하기떄문에 length가6이라고치면
				 * 4번인덱스 까지만 루프를 돌면5번까지도 비교가 됨
				 * 
				 * 첫번쨰루프에서 0번부터 맨뒤에까지 비교를했으니
				 * (length-1-i)번 인덱스 까지만 비교해주면 된다 
				 */
				if(lotto[j]> lotto[j+1]) {
					int temp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = temp;
					sortable = false;
				}
			}
			System.out.print(i+":");
			for (int j : lotto) {
				System.out.print(j+" , ");
			}
			System.out.println();
			if(sortable)break;
		}
		System.out.print("최종정렬 : ");
		for (int i : lotto) {
			System.out.print(i+" , "
					+ "");
		}
		
	}

}
