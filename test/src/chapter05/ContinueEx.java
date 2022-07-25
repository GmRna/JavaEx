package Chepter05;

public class ContinueEx {

	public static void main(String[] args) {
		for (int i=0; i<10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
			// 5가 되는 순간 출력 중지 되기 때문에 5는 출력이 되지 않는다.
			// 하지만, 계속하라는 continue구문때문에 for문이 조건이 false가 될때까지 
			// 계속해서 반복하고 출력한다.
		}
		
	}

}
