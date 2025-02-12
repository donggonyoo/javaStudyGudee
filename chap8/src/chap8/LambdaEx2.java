package chap8;

interface Lambda2{
	int x = 4;
	void method(int x);
}
public class LambdaEx2 {
	public static void main(String[] args) {

		Lambda2 l;
		
		l=(x)->{
			int sum=0;
			for (int i = 0; i <= x; i++) {
				sum+= i;
				System.out.print(i+"+");
			}System.out.println(" : "+sum);
			};
		
		l.method(7);
	}
	

}
