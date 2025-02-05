package chap05;

public class ArrayEx01 {
	public static void main(String[] args) {
		
		int arr[];
		arr = new int[5];
		/*
		 * new 예약어 -->
		 * 1.객체생성( 정수 5개를 저장할 수 있는 객체생성)
		 * 2.기본값 초기화 
		 * 숫자 : 0 , boolean : false , 그외 : null
		 */
		
		//배열의인덱스 0번부터 시작
		arr[0] = 10;
		arr[1] = 20;
		//arr.length = 5 배열의크기
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"] : "+arr[i]);
		}
		System.out.println();
		int []arr2 = new int[]{100,200};
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2["+i+"] : "+arr2[i]);
		}System.out.println();
		
		arr2= arr;
		arr2[3] = 999;
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2["+i+"] : "+arr2[i]);
		}System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"] : "+arr[i]);
		}
		
		//향상된for문
		System.out.println("향상된for문사용");
		for (int i : arr2) {
			
			System.out.println(i);
		}
		
	}

}
