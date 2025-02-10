package ex2_super;

public class Child extends Parent {

	public Child(int x) {
		//기본생성자일 경우는 선언 생략해도 자동출력
		//super(); 자동호출
		super(100);
		//부모의 생성자는 무조건 호출해야함
	}

}
