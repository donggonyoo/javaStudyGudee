package chap05.test2;
/*
 command line에서 숫자로 이루어진 문자를 두개 받아서 두수의 공약수를 구하시오
 int num1 = Integer.parseInt(args[0])
   [결과]
   10과 20 의 공약수 : 1,2,5,10,

 */
public class Test2 {

	public static void main(String[] args) {
		int int1 = Integer.parseInt(args[0]);
		
		
		int int2 = Integer.parseInt(args[1]);
	
		int i=0;
		System.out.println(int1+"와"+int2+"의 공약수  : ");
		while(true) {
			++i;
			if(int1%i==0 && int2%i==0) {
				System.out.print(i+",");
			}
			if(i>int1 && i>int2) {
				break;
			}	
			}
		
	
	}

}
