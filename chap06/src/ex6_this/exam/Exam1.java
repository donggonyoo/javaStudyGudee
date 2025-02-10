package ex6_this.exam;

public class Exam1 {
	public static void main(String[] args) {
		//1번생성자호출
		Rectangle r1 = new Rectangle(10,10);//1번사각형 (10,10) 면적둘레 정사각형
		System.out.println();
		//2번생성자호출 -> this(1,1) 1번생성자호출
		Rectangle r2 = new Rectangle();//2번사각형 (1,1)면적둘레정사각형
		
		//3번생성자호출 -> this(width , 1) 1번생성자호출
		Rectangle r3 = new Rectangle(10);//3번사각형(10,1)....
		
		//4번생성자호출 -> this(r.width , r.height) 1번생성자호출
		Rectangle r4 = new Rectangle(r1);//4번사각형 (10,10) .....
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
	}

}
