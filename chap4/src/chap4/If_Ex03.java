package chap4;

/*
 * 중첩if문 : if구문 내에 if구문이 존재
 */
public class If_Ex03 {
	public static void main(String[] args) {
		int score= 80;
		if(score>=65) {
			System.out.println("합격");
			if(score>=80) {
				System.out.println("good");}
		}
		else {
			System.out.println("불합격");
		}
	}

}
