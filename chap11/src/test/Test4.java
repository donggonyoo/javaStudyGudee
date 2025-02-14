package test;

import java.util.Scanner;

/*
 * 숫자 맞추기 게임
 * 시스템이 4자리의 서로 다른 수를 저장한 후 사용자가 저장된 수를 맞추는 게임
 *    자리수도 맞는 경우 : 스트라익
 *    자리수는 틀리지만 숫자가 존재하면 : 볼
 *  4스트라익이 되면 정답

 *  NumberInputException을 이용하여 다음의 예외 처리를 할것  
 *  4자리 수가 아닌 경우는 4자리 숫자를 입력하세요. 를 출력하고 다시 입력을 받기. 입력숫자에는 포함됨 
 *  중복된 숫자가 입력된 경우 중복된 숫자가 입력되었습니다. 를 출력하고 다시 입력을 받기. 입력숫자에는 포함됨
 *  InputMismetchException을 이용하여 예외처리
 *  만약 숫자 아닌 값이 입력되면 숫자만 가능합니다. 를 출력하고 다시 입력을 받기. 입력숫자에는 포함됨
 *    
 *  [결과]
서로다른 4자리 정수를 입력하세요
1234
1234:0스트라이크, 1볼
서로다른 4자리 정수를 입력하세요
5678
5678:2스트라이크, 0볼
서로다른 4자리 정수를 입력하세요
2679
2679정답입니다.
3번 만에 맞추셨습니다. 게임을 종료합니다.
 */
class NumberInputException23 extends Exception{
	

	public NumberInputException23(String msg) {
		super(msg);
	}

}

class InputMismetchException extends Exception{
	

	public InputMismetchException(String msg) {
		super(msg);
	}

}


public class Test4 {

	public static void main(String[] args) {
		int count=0;

		Scanner scan = new Scanner(System.in);
		String[] ran = {"0","1","2","3","4","5","6","7","8","9"};
		for (int i = 0; i < 100; i++) {
			int a = (int)(Math.random()*ran.length);
			int b = (int)(Math.random()*ran.length);
			String c = ran[a];
			ran[a] = ran[b];
			ran[b] = c;	
		}
		String rand="";
		for (int i = 0; i < 4 ; i++) {
			rand+=ran[i];
		}
		System.out.println(rand);


		while(true) {
			try {

				System.out.println("숫자를 입력하세요 : ");
				String next = scan.next();
				Integer.parseInt(next);
				if(next.length()>4 ||next.length()<4 ) {
					throw new NumberInputException23("4자리만");
				}
				int Ncount=0;
				for (int i = next.length()-1; i >=1; i--) {//  30 31 32  20 21   10     [ 33 22 11 12  00 01 02 03 은 중복 ] 
					for (int j = 0; j < i; j++) {
						if(next.charAt(j) == next.charAt(i)) { 
							++Ncount;
						}
					}
				}//모든 문자열을 
				if(Ncount >= 1) {
					throw new InputMismetchException("숫자중복!!!");
					}
				
				

				//----------------------------------------------------------------------------------				
				

				int[] sbCount = ball(next, rand);
				
				
				int sCount= sbCount[0];//스트라이크
				int bCount= sbCount[1];//볼
				

				if(sCount==4) {
					count++;
					System.out.println("정답입니다");
					System.out.println(count+"시도");
					break;
				}

				System.out.println(sCount+"스트라이크"+bCount+"볼");
				++count;
				System.out.println(count+"번쨰 시도중");

				//--------------------------------------------------------------------------				



			} catch (NumberInputException23 e) {
				System.out.println(e.getMessage());
				++count;
				System.out.println(count+"번쨰 시도중");
			}
			catch(InputMismetchException e) {
				System.out.println(e.getMessage());
				++count;
				System.out.println(count+"번쨰 시도중");
			}
			catch(NumberFormatException e ) {
				System.out.println("숫자만 입력");
				++count;
				System.out.println(count+"번쨰 시도중");

			}

		}
	}
	//스트라이크 볼 판단메서드
	private static int[] ball(String next ,String rand) {
		
		int[] sbArr = new int[2];

		for (int i = 0; i < next.length(); i++) {
			char ch = next.charAt(i);//ch : i번째 문자
			int indexOf2 = rand.indexOf(ch);//랜덤 숫자의 ch의 인덱스

			//rand =  7319 ,,  next =  7421  라고 가정
			//0번쨰루프 next.charAt(0)==7   rand.indexOf('7') == 0       [0==0] sCount++
			// 1번쨰 루프 next.charAt(1)==4   rand.indexOf('4') == -1(존재하지않는 문자)
			// 2번쨰루프  next.charAt(2)==2   rand.indexOf('2') == -1(존재하지않는 문자)
		   // 3번째 루프  next.charAt(3)==1   rand.indexOf('1') == 2    [3!=2] bCount++; 
			//					1스트라이크1볼
			
			if(i==indexOf2) { 
				sbArr[0]++;  //strike 1개 증가
			}
			else if(!(indexOf2<0)) {
				sbArr[1]++;  //ball 1개 증가
			}
		}
		return sbArr;
		
	}



}
