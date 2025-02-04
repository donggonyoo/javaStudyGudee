package chap4.exam;

public class Exam07_Triangle {
	//차례대로 피라미드식으로 출력되는 별
	public Exam07_Triangle(int a) {
		for (int i = 1; i <= a; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}
	}
	//거꾸로 출력되는 별 5 4 3 2 1 
	public void reverse(int b) {
		System.out.println("거꾸로출력");
		for (int i = b; i >= 1; i--) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");

			}System.out.println();

		}
	}

	/*
	 * 3:     i        j
	 *    ================
	 *     *   3        3
	 *    **   2       23
	 *   ***   1      123   
	 */
	public void emptyPrint(int c) {
		System.out.println("공백포함 출력");
		for (int i = c; i > 0; i--) {
			for (int j = 1; j <= c; j++) {
				if(i > j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}System.out.println();

		}
	}
	
	/*
	 * 		4:    i       j 
	 *  =======================
	 *    ***     1       123
	 *     **     2        23
	 *      *     3         3
	 */

	public void  emptyReverse(int d) {
		System.out.println("공백포함 거꾸로");
		for (int i = 1; i <= d; i++) {
			for (int j = 1; j <= d ; j++) {
				if(i<=j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}System.out.println();
			//i = 1    j = 1 2 3 
			//i = 2    j = 1 2 3
			//i=  3    j=  1 2 3
			
		}
	}
}
