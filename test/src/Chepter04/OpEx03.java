package Chepter04;
//4-3 증감연산
public class OpEx03 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		
		++a; // 전위연산 -> 먼저 변수에 1증가 후 다른 연산을 실행
		b++; // 후위연산 -> 다른 연산을 실행 후 변수에 1 증가
		
		System.out.println(a);
		System.out.println(b);
		
		int c = 10;
		int d = c++; // 실행문 = ;
		// 실행문이 실행되고 더하여서 이미 10으로 출력된 후에 진행된다.
		// c가 10이니 c를 먼저 대입하고 그 후에 1을 더하는 것이니까 출력은 10이 된다.
		System.out.println(d); // 대입
		
		int c1 = 10;
		int e = ++c1; // 대입하기 전에 ++로 인해 1이 더해져서 11이 되고 11을 대입. 따라서 11이 된다
		System.out.println(e);
		
		// 전위 후위의 구분의 기준은 실행문(;)
		// 전위연산은 실행문이 실행되기 전
		// 후위연산은 실행문이 실행된 후
		// 굳이 사용할 필요가 없다.
	}
}
