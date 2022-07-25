package Chepter04;

public class OpEx05 {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		System.out.println(a > b && a == 10); // and연산 두개 모두 같아야 true
		System.out.println(a > b && a == b);
		
		System.out.println(a > b || a == b); // or 연산 두개 중 하나가 true이면 true
		System.out.println(a < b || a == b);

		System.out.println(a > b ^ a == 10); // xor 연산 두개가 모두 달라야 true
		System.out.println(a > b ^ a == b);

		System.out.println(!(a > b)); // not 연산 반대여야 true
		System.out.println(!(a < b)); // 괄호로 묶지 않으면 !a를 먼저 읽음
		// 논리연산도 무조건 bollean
		
		// &&는 앞의 것이 false면 뒤의 것을 확인하지않음 하지만 &를 하나 쓰는 것은 앞에가 false여도 뒤를 확인
		// ||는 앞의 것이 true이면 뒤를 확인하지 않음 하지만 |하나만 쓰면 앞에가 true여도 뒤를 확인
		// 확인을 해도 달라지는 것은 없지만, 연산속도의 차이
	}

}
