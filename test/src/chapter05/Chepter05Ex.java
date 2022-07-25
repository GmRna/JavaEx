package Chepter05;
// 5단원 마무리
public class Chepter05Ex {

	public static void main(String[] args) {
		// 문제 1
		System.out.println("* 문제 1번정답");
		int sum = 0;
		for (int i = 5; i <= 100; i+=5) {
			sum += i;
		} 
		System.out.println("- 5의 배수의 합계는 "+sum);
		
		// 문제 2
		System.out.println("* 문제 2번정답");
		int evenSum = 0;
		int oddSum = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i%2 == 0) {
			evenSum += i;
			} else { oddSum += i;}
			
		}
		System.out.println("- 짝수의 합계는 "+evenSum);
		System.out.println("- 홀수의 합계는 "+oddSum);
		
		//문제 3
		for (int x=1; x<=6; x++) {
			for (int y=1; y<=6; y++) {
				if (x+y==6) {
					System.out.println("-("+x+"),("+y+")");
				}
			}
		}
	}

}
