package test;
/*
 * 다음 결과가 나오도록 프로그램 수정하기
 * [결과]
 * basket
 * basketball
 */

public class Test3_A {
	public static void main(String[] args) {
		String str = "base"; 
		System.out.println(str.replace('e','k')+"et");
		String replace = str.replace('e','k');
		replace += "et ball"; 
		System.out.println(replace);
	}
}
