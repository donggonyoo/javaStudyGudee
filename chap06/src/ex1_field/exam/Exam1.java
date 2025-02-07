package ex1_field.exam;

class Rectangle {

	public int width;
	int height;
	int sno;
	static int cnt;
	
	public String toString() {
		return sno+"번 사각형 : 가로("+width+"), 세로("+height+"),"
				+ "현재까지 생성된 사각형 ("+cnt+")";
	}
}
public class Exam1 {
	public static void main(String[] args) {
		System.out.println("Rectangle.cnt : "+Rectangle.cnt);
		Rectangle r1 = new Rectangle();
		r1.width = 10;
		r1.height = 20;
		
		r1.sno = ++Rectangle.cnt;
		System.out.println("++Rectangle.cnt : "+Rectangle.cnt);
		System.out.println(r1);
		
		Rectangle r2 = new Rectangle();
		r2.width = 10;
		r2.height = 20;
		
		r2.sno = ++Rectangle.cnt;
		System.out.println("++Rectangle.cnt : "+Rectangle.cnt);
		System.out.println(r2);
	}

}
