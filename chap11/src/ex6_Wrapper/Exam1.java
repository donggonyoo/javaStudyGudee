package ex6_Wrapper;

public class Exam1 {
	public static void main(String[] args) {
		String str = "10,20,   30,  40,  50, 60";
		
	
		
		String[] split = str.split(",");
		int sum=0;
		for (String s : split) {
			System.out.print(Integer.parseInt(s.trim())+"+");
			sum += Integer.parseInt(s.trim());//공백제거
		}
		System.out.println(" == "+sum);
	}
}
