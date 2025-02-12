package chap8.test;

class Super{
	public float getA() {
		return 3.0f;
	}
}

class Super2 extends Super{
	public int getA(int a) {
		return 4;
	}
	
}

public class TestA {
	public static void main(String[] args) {
		Super2 super2 = new Super2();
		int a = super2.getA(4);
		
	}

}







