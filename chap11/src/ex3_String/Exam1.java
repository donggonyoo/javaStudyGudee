package ex3_String;
/*
 * count(문자열, 찾는문자열 ) 구현하기
 * ----> 문자열에서 찾는 문자열의 갯수 리턴
 */
public class Exam1 {
	public static void main(String[] args) {
		System.out.println(count("12345AB12AB45AB","12"));//2
		System.out.println(count("12345AB12AB45AB","AB"));//3
		System.out.println(count("12345","AB"));//0
		
		String a = "1234";
		

	}

	private static int count(String s1, String s2) {
		int index=0;
		int count=0;
		int length = s2.length();
		while(true) {
			index = s1.indexOf(s2,index);
			
			if(index < 0) {
				break;
			}
			count++;
			index++;
			
		}return count;

	}


}
