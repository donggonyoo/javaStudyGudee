package chap05;

import java.util.Arrays;

/*
 * 배열의크기변경
 *새로운 배열 객체 생성해 배열 요소값을 복사
 * 1. for구문을 이용 요소 하나하나를 복사 
 * 2. System.arratcopy()함수 이용
 */
public class ArrayEx10 {
	public static void main(String[] args) {
		int [] arr1 = {10,20,30};
		//arr1 배열보다 더 큰 배열을 생성해
		//arr1의 배열값저장 후 합계를 마지막요소에저장
		
		//arr1.length = 4 ;  크기변경은 불가능
		
		int [] arr2 = new int[arr1.length+1];
		
		System.out.println("1.for문을 이용해 복사");
		//for문으로 배열값 복사하기
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
			arr2[arr1.length] += arr1[i];}
		
		
		for(int a : arr2) {
			System.out.print(a);
			if(a!=arr2[arr1.length]) {
				System.out.print(",");}
			
		}System.out.println();
		
		//2 System.arratcopy()함수 이용
		System.out.println("\nSystem.arraycopy()함수");
		int[] arr3 = new int[10];
		System.arraycopy(arr2, 0, arr3, 2, arr2.length);
		//arr2의 0번부터의 값을 
		//arr3의 2번인덱스~arr2.length까지 넣는다
		//arraycopy(원본배열, 원본배열의시작index , 복사배열 ,복사배열의시작index , 요소의 갯수)
		
		for (int i : arr3) {
			System.out.print(i+",");
		}System.out.println();
		
		//3.Arrays.copyOf() 함수이용
		System.out.println("\nArrays.copyOf() 함수");
		int[] arr4 = Arrays.copyOf(arr3, 5);
		for (int i : arr4) {
			System.out.print(i);
			if(i!=arr4[arr4.length-1]) {
				System.out.print(",");
			}
		}System.out.println();
		
		System.out.println("\n얕은복사"); //객체 자체가복사됨
		int[] arr5 = arr4;
		for (int i : arr5) {
			System.out.print(i);
			if(i!=arr5[arr5.length-1]) {
				System.out.print(",");
			}
		}System.out.println();
		
		System.out.print("\narr1 : ");
		for (int i : arr1) {
			System.out.print(i);
			if(i!=arr1[arr1.length-1]) {
				System.out.print(",");
			}
		}System.out.println();
		
		System.out.print("arr2 : ");
		for (int i : arr2) {
			System.out.print(i);
			if(i!=arr2[arr2.length-1]) {
				System.out.print(",");
			}
		}System.out.println();
		
		System.out.print("arr3 : ");
		for (int i : arr3) {
			System.out.print(i+",");

		}System.out.println();
		
		System.out.print("arr4 : ");
		for (int i : arr4) {
			System.out.print(i+",");
		
		}System.out.println();
		
		System.out.print("arr5 : ");
		for (int i : arr5) {
			System.out.print(i);
			if(i!=arr5[arr5.length-1]) {
				System.out.print(",");
			}
		}System.out.println();
		
	}
	}

