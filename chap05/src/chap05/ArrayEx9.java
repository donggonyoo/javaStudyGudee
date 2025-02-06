package chap05;

/*
 * 가변배열 : 다차원배열에서만 가능
 * 	첫번째 배열의 갯수만 설정하고 나머지값을 설정X
 */
public class ArrayEx9 {
	public static void main(String[] args) {
		
		int arr[][] = new int[3][]; //가변배열 (3행짜리 배열)(열은 알아서)
		arr[0] = new int[] {10,20};
		arr[1] = new int[] {30,40,50};
		arr[2] = new int[] {60};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("arr["+i+"]["+j+"]="+arr[i][j]);
				if(j!=arr[i].length-1) {System.out.print(", ");}
				
			}System.out.println();
			
		}
	}
}
