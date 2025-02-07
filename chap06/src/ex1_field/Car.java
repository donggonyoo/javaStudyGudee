package ex1_field;

/*
 * 선언위치에따른 변수의 종류 
 * 클래스변수 (필드) : 클래스내부에 선언 ->static 붙은 변수(정적변수)
 * 
 * 인스턴스변수 (필드) : 클래스내부에 선언 -> ex)int iv 등
 * 
 * 지역변수  : 메서드 내에 실행(블록 내_)
 */
public class Car {
	String color;
	int num;//인스턴스변수
	static int width = 200; //클래스변수
	static int height = 120;
	
	
	//toString 오버라이딩
	
	@Override
	public String toString() {
		return color+":"+num+"("+width+","+height+")";}
	
	
}
