package Chepter04;

public class OpEx05_02 {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		// & 연산
		System.out.println(a == b & test());
		// 앞(a == b)이 트루여도 일단 뒤(test())를 확인
		
		// && 연산
		System.out.println(a == b && test());
		// 앞에서 false면 뒤에 확인하지 않음 따라서 출력안됨 short cut
	}
	public static boolean test() {
		System.out.println("test()메서드 실행");
		return true;
	}
}
