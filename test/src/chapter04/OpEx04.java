package Chepter04;
//4-4 비교연산
public class OpEx04 {

	public static void main(String[] args) {
		// !는 반대의 의미 
		// 같다라는 표현은 == 이렇게 표현 다른지비교는 !=
		// 결과값은 무조건 boolean(true or false)으로 표현
		
		System.out.println(10 != 20);
		System.out.println('A' < 'B'); //A는 65이고 B는 66이니 true
		//System.out.println("A" < "B"); // 이것은 문자열이기 때문에 비교 불가
		boolean d = 10 < 20; // 대입 연산은 제일 마지막에 되니까 boolean c = true라고 나와서 c는 true로 출력
		System.out.println(d);
		boolean e = 10 == 20;
		System.out.println(e); // 10과 20은 같지 않기 때문에 false 따라서 e는 false로 출력
		}
}
