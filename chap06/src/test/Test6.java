package test;
/*
 Test3의 Coin 클래스를 이용하기 
 두개의 Coin 객체를 생성하기 myCoin, youCoin 객체 생성하기
 앞면이 연속해서 3번 나오면 승리가 출력되도록 구동 클래스 구현하기   

 [결과예시] => 결과는 다를 수 있습니다.
 myCoin	youCoin
  앞면	뒷면
  뒷면	앞면
  앞면	앞면
  앞면	앞면
 youCoin 승리
 */


public class Test6 {
	
	public static void main(String[] args) {
		Coin myCoin = new Coin();
		Coin youCoin = new Coin();
		
		int myCount =0;
		int youCount =0;
		
		System.out.println("myCoin  youCoin");
		while(myCount<3 && youCount<3) {
			myCoin.flip();
			youCoin.flip();
			
			System.out.println(myCoin.getSide()+"\t "+youCoin.getSide());
			
			myCount = myCoin.isSquare()? myCount+1 : 0;
			youCount = youCoin.isSquare()? youCount+1 : 0;
			
			if(myCount==3) {
				System.out.println("myCoin 승리");
				break;
			}
			else if(myCount==3 && youCount==3){
				System.out.println("동점");
			}
			else if(youCount==3) {
				System.out.println("youCoin 승리");
			}
			
			
			
			
		}
		
		
	}


}



