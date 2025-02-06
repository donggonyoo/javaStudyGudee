package chap05;

import java.util.Arrays;

/*
 * 2차원배열은 1차원배열의 참조변수의 배열 .(배열의 배열)
 */
public class ArrayEx07 {

	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		//2행3열짜리 배열
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;
		
		System.out.println("arr참조값:"+arr);
		System.out.println("arr[0]참조값:"+arr[0]);
		System.out.println("arr[1]참조값:"+arr[1]+"\n");
		
		System.out.println("arr.length :"+arr.length);
		System.out.println("arr[0].length : "+arr[0].length);
		System.out.println("arr[1].length :"+arr[1].length+"\n");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("arr["+i+"]["+j+"]="+arr[i][j]+" ");
			}System.out.println();
			
		}
		for (int[] is : arr) {
			String string = Arrays.toString(is);
			System.out.println(string);
		}
		
		System.out.println("1차원 배열의 객체변경");
		int[] arr1 = {1,2,3,4,5};
		arr[1] = arr1;
		for (int[] is : arr) {
			String string = Arrays.toString(is);
			System.out.println(string);
		}
//		arr[1].length==5
		
	}
	
}
